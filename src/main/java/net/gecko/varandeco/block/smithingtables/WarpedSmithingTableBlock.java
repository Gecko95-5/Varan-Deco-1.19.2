package net.gecko.varandeco.block.smithingtables;

import net.gecko.varandeco.screen.wood.WarpedSmithingScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
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

public class WarpedSmithingTableBlock extends CraftingTableBlock {
	private static final Text SCREEN_TITLE = Text.translatable("container.upgrade");

	public WarpedSmithingTableBlock(Settings settings) {
		super(settings);
	}

	@Override
	public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
		return new SimpleNamedScreenHandlerFactory(
			(syncId, inventory, player) -> new WarpedSmithingScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos)), SCREEN_TITLE
		);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (world.isClient) {
			return ActionResult.SUCCESS;
		} else {
			player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
			player.incrementStat(Stats.INTERACT_WITH_SMITHING_TABLE);
			return ActionResult.CONSUME;
		}
	}
}
