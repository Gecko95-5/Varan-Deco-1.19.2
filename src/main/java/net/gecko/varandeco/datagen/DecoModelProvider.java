package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class DecoModelProvider extends FabricModelProvider {
    public DecoModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
       BlockStateModelGenerator.BlockTexturePool andesitepool =
               blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_ANDESITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool dioritepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_DIORITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool granitepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_GRANITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool stonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool smstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.SMOOTH_STONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool calcitepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.CALCITE_TEMP);
        BlockStateModelGenerator.BlockTexturePool tuffpool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.TUFF_TEMP);
        BlockStateModelGenerator.BlockTexturePool dripstonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.DRIPSTONE_TEMP);
        BlockStateModelGenerator.BlockTexturePool polistonepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.POLISHED_STONE);
        BlockStateModelGenerator.BlockTexturePool stonetilepool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(DecoBlocks.STONE_TILES);

       andesitepool.wall(DecoBlocks.POLISHED_ANDESITE_WALL);
       dioritepool.wall(DecoBlocks.POLISHED_DIORITE_WALL);
       granitepool.wall(DecoBlocks.POLISHED_GRANITE_WALL);
       stonepool.wall(DecoBlocks.STONE_WALL);

       smstonepool.stairs(DecoBlocks.SMOOTH_STONE_STAIRS);
       smstonepool.wall(DecoBlocks.SMOOTH_STONE_WALL);

       calcitepool.stairs(DecoBlocks.CALCITE_STAIRS);
       calcitepool.slab(DecoBlocks.CALCITE_SLAB);
       calcitepool.wall(DecoBlocks.CALCITE_WALL);
       tuffpool.stairs(DecoBlocks.TUFF_STAIRS);
       tuffpool.slab(DecoBlocks.TUFF_SLAB);
       tuffpool.wall(DecoBlocks.TUFF_WALL);
       dripstonepool.stairs(DecoBlocks.DRIPSTONE_STAIRS);
       dripstonepool.slab(DecoBlocks.DRIPSTONE_SLAB);
       dripstonepool.wall(DecoBlocks.DRIPSTONE_WALL);

       polistonepool.stairs(DecoBlocks.POLISHED_STONE_STAIRS);
       polistonepool.slab(DecoBlocks.POLISHED_STONE_SLAB);
       polistonepool.wall(DecoBlocks.POLISHED_STONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DecoItems.PLACEHOLDER_STICK, Models.HANDHELD);
    }
}
