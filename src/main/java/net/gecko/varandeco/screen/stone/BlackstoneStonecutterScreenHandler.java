package net.gecko.varandeco.screen.stone;

import com.google.common.collect.Lists;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.screen.Property;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import java.util.List;

public class BlackstoneStonecutterScreenHandler extends ScreenHandler {
	public static final int field_30842 = 0;
	public static final int field_30843 = 1;
	private static final int field_30844 = 2;
	private static final int field_30845 = 29;
	private static final int field_30846 = 29;
	private static final int field_30847 = 38;
	private final ScreenHandlerContext context;
	private final Property selectedRecipe = Property.create();
	private final World world;
	private List<StonecuttingRecipe> availableRecipes = Lists.<StonecuttingRecipe>newArrayList();
	private ItemStack inputStack = ItemStack.EMPTY;
	long lastTakeTime;
	final Slot inputSlot;
	final Slot outputSlot;
	Runnable contentsChangedListener = () -> {};
	public final Inventory input = new SimpleInventory(1) {
		@Override
		public void markDirty() {
			super.markDirty();
			BlackstoneStonecutterScreenHandler.this.onContentChanged(this);
			BlackstoneStonecutterScreenHandler.this.contentsChangedListener.run();
		}
	};
	final CraftingResultInventory output = new CraftingResultInventory();

	public BlackstoneStonecutterScreenHandler(int syncId, PlayerInventory playerInventory) {
		this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
	}

	public BlackstoneStonecutterScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
		super(ScreenHandlerType.STONECUTTER, syncId);
		this.context = context;
		this.world = playerInventory.player.world;
		this.inputSlot = this.addSlot(new Slot(this.input, 0, 20, 33));
		this.outputSlot = this.addSlot(new Slot(this.output, 1, 143, 33) {
			@Override
			public boolean canInsert(ItemStack stack) {
				return false;
			}

			@Override
			public void onTakeItem(PlayerEntity player, ItemStack stack) {
				stack.onCraft(player.world, player, stack.getCount());
				BlackstoneStonecutterScreenHandler.this.output.unlockLastRecipe(player);
				ItemStack itemStack = BlackstoneStonecutterScreenHandler.this.inputSlot.takeStack(1);
				if (!itemStack.isEmpty()) {
					BlackstoneStonecutterScreenHandler.this.populateResult();
				}

				context.run((world, pos) -> {
					long l = world.getTime();
					if (BlackstoneStonecutterScreenHandler.this.lastTakeTime != l) {
						world.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
						BlackstoneStonecutterScreenHandler.this.lastTakeTime = l;
					}
				});
				super.onTakeItem(player, stack);
			}
		});

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (int i = 0; i < 9; i++) {
			this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
		}

		this.addProperty(this.selectedRecipe);
	}

	public int getSelectedRecipe() {
		return this.selectedRecipe.get();
	}

	public List<StonecuttingRecipe> getAvailableRecipes() {
		return this.availableRecipes;
	}

	public int getAvailableRecipeCount() {
		return this.availableRecipes.size();
	}

	public boolean canCraft() {
		return this.inputSlot.hasStack() && !this.availableRecipes.isEmpty();
	}

	@Override
	public boolean canUse(PlayerEntity player) {
		return canUse(this.context, player, DecoBlocks.BLACKSTONE_STONECUTTER);
	}

	@Override
	public boolean onButtonClick(PlayerEntity player, int id) {
		if (this.isInBounds(id)) {
			this.selectedRecipe.set(id);
			this.populateResult();
		}

		return true;
	}

	private boolean isInBounds(int id) {
		return id >= 0 && id < this.availableRecipes.size();
	}

	@Override
	public void onContentChanged(Inventory inventory) {
		ItemStack itemStack = this.inputSlot.getStack();
		if (!itemStack.isOf(this.inputStack.getItem())) {
			this.inputStack = itemStack.copy();
			this.updateInput(inventory, itemStack);
		}
	}

	private void updateInput(Inventory input, ItemStack stack) {
		this.availableRecipes.clear();
		this.selectedRecipe.set(-1);
		this.outputSlot.setStack(ItemStack.EMPTY);
		if (!stack.isEmpty()) {
			this.availableRecipes = this.world.getRecipeManager().getAllMatches(RecipeType.STONECUTTING, input, this.world);
		}
	}

	void populateResult() {
		if (!this.availableRecipes.isEmpty() && this.isInBounds(this.selectedRecipe.get())) {
			StonecuttingRecipe stonecuttingRecipe = (StonecuttingRecipe)this.availableRecipes.get(this.selectedRecipe.get());
			this.output.setLastRecipe(stonecuttingRecipe);
			this.outputSlot.setStack(stonecuttingRecipe.craft(this.input));
		} else {
			this.outputSlot.setStack(ItemStack.EMPTY);
		}

		this.sendContentUpdates();
	}

	@Override
	public ScreenHandlerType<?> getType() {
		return ScreenHandlerType.STONECUTTER;
	}

	public void setContentsChangedListener(Runnable contentsChangedListener) {
		this.contentsChangedListener = contentsChangedListener;
	}

	@Override
	public boolean canInsertIntoSlot(ItemStack stack, Slot slot) {
		return slot.inventory != this.output && super.canInsertIntoSlot(stack, slot);
	}

	@Override
	public ItemStack transferSlot(PlayerEntity player, int index) {
		ItemStack itemStack = ItemStack.EMPTY;
		Slot slot = this.slots.get(index);
		if (slot != null && slot.hasStack()) {
			ItemStack itemStack2 = slot.getStack();
			Item item = itemStack2.getItem();
			itemStack = itemStack2.copy();
			if (index == 1) {
				item.onCraft(itemStack2, player.world, player);
				if (!this.insertItem(itemStack2, 2, 38, true)) {
					return ItemStack.EMPTY;
				}

				slot.onQuickTransfer(itemStack2, itemStack);
			} else if (index == 0) {
				if (!this.insertItem(itemStack2, 2, 38, false)) {
					return ItemStack.EMPTY;
				}
			} else if (this.world.getRecipeManager().getFirstMatch(RecipeType.STONECUTTING, new SimpleInventory(itemStack2), this.world).isPresent()) {
				if (!this.insertItem(itemStack2, 0, 1, false)) {
					return ItemStack.EMPTY;
				}
			} else if (index >= 2 && index < 29) {
				if (!this.insertItem(itemStack2, 29, 38, false)) {
					return ItemStack.EMPTY;
				}
			} else if (index >= 29 && index < 38 && !this.insertItem(itemStack2, 2, 29, false)) {
				return ItemStack.EMPTY;
			}

			if (itemStack2.isEmpty()) {
				slot.setStack(ItemStack.EMPTY);
			}

			slot.markDirty();
			if (itemStack2.getCount() == itemStack.getCount()) {
				return ItemStack.EMPTY;
			}

			slot.onTakeItem(player, itemStack2);
			this.sendContentUpdates();
		}

		return itemStack;
	}

	@Override
	public void close(PlayerEntity player) {
		super.close(player);
		this.output.removeStack(1);
		this.context.run((world, pos) -> this.dropInventory(player, this.input));
	}
}
