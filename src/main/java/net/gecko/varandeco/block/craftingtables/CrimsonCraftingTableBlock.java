package net.gecko.varandeco.block.craftingtables;

import net.gecko.varandeco.screen.AcaciaCraftingScreenHandler;
import net.gecko.varandeco.screen.CrimsonCraftingScreenHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CrimsonCraftingTableBlock extends Block {
	private static final Text TITLE = Text.translatable("container.crafting");

	public CrimsonCraftingTableBlock(Settings settings) {
		super(settings);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (world.isClient) {
			return ActionResult.SUCCESS;
		} else {
			player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
			player.incrementStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
			return ActionResult.CONSUME;
		}
	}

	@Override
	public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
		return new SimpleNamedScreenHandlerFactory(
			(syncId, inventory, player) -> new CrimsonCraftingScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos)), TITLE
		);
	}
}
