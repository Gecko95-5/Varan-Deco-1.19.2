package net.gecko.varandeco.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.BlastFurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class BlackstoneBlastFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
	public BlackstoneBlastFurnaceBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.BLACKSTONE_BLAST_FURNACE_BE, pos, state, RecipeType.BLASTING);
	}

	@Override
	protected Text getContainerName() {
		return Text.translatable("container.blast_furnace");
	}

	@Override
	protected int getFuelTime(ItemStack fuel) {
		return super.getFuelTime(fuel) / 2;
	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new BlastFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}
}
