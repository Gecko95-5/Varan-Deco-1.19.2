package net.gecko.varandeco.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.custom.BlackIceBlock;
import net.gecko.varandeco.block.magmablocks.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoBlocks {

    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).resistance(6.0f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).resistance(6.0f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_SANDSTONE_BRICKS = registerBlock("cut_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).slipperiness(0.89F)
                    .strength(1.0f).resistance(0.7f).requiresTool().sounds(BlockSoundGroup.SNOW)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGMA_BRICKS = registerBlock("magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).luminance(state -> 1)
                    .strength(1.5F).sounds(BlockSoundGroup.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_MAGMA_BRICKS = registerBlock("chiseled_magma_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlock("cut_red_sandstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.6f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new MagmaBrickBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).strength(1.4f)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLACK_ICE = registerBlock("black_ice",
            new BlackIceBlock(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.BLACK).slipperiness(1.18F)
                    .strength(5.6f).requiresTool().sounds(BlockSoundGroup.STONE).velocityMultiplier(0.9F)),
                    ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).strength(2.5f)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            new Block(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).strength(1.5f).resistance(6.0f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CALCITE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
            new StairsBlock(Blocks.TUFF.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TUFF)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHERRACK)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGMA_STAIRS = registerBlock("magma_stairs",
            new MagmaStairBlock(Blocks.MAGMA_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_MUD)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new StairsBlock(Blocks.PACKED_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PACKED_ICE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            new StairsBlock(Blocks.BLUE_ICE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.BLUE_ICE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(DecoBlocks.POLISHED_STONE.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(DecoBlocks.STONE_TILES.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerBlock("cut_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_SANDSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(DecoBlocks.SNOW_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGMA_BRICK_STAIRS = registerBlock("magma_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.MAGMA_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerBlock("cut_red_sandstone_brick_stairs",
            new StairsBlock(DecoBlocks.CUT_RED_SANDSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new MagmaBrickStairBlock(DecoBlocks.ICE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new MagmaBrickStairBlock(DecoBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block TUFF_SLAB = registerBlock("tuff_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGMA_SLAB = registerBlock("magma_slab",
            new MagmaSlabBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlock("cut_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGMA_BRICK_SLAB = registerBlock("magma_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlock("cut_red_sandstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new MagmaBrickSlabBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), ItemGroup.BUILDING_BLOCKS);

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), ItemGroup.DECORATIONS);

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)), ItemGroup.DECORATIONS);
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)), ItemGroup.DECORATIONS);
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)), ItemGroup.DECORATIONS);
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)), ItemGroup.DECORATIONS);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.DECORATIONS);
    public static final Block TUFF_WALL = registerBlock("tuff_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)), ItemGroup.DECORATIONS);
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)), ItemGroup.DECORATIONS);
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)), ItemGroup.DECORATIONS);
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE)), ItemGroup.DECORATIONS);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.DECORATIONS);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)), ItemGroup.DECORATIONS);
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK)), ItemGroup.DECORATIONS);
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)), ItemGroup.DECORATIONS);
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), ItemGroup.DECORATIONS);
    public static final Block MAGMA_WALL = registerBlock("magma_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)), ItemGroup.DECORATIONS);
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)), ItemGroup.DECORATIONS);
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE)), ItemGroup.DECORATIONS);
    public static final Block BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ICE)), ItemGroup.DECORATIONS);
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_STONE)), ItemGroup.DECORATIONS);
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.STONE_TILES)), ItemGroup.DECORATIONS);
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlock("cut_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_SANDSTONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.SNOW_BRICKS)), ItemGroup.DECORATIONS);
    public static final Block MAGMA_BRICK_WALL = registerBlock("magma_brick_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.MAGMA_BRICKS)), ItemGroup.DECORATIONS);
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlock("cut_red_sandstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(DecoBlocks.CUT_RED_SANDSTONE_BRICKS)), ItemGroup.DECORATIONS);
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.ICE_BRICKS)), ItemGroup.DECORATIONS);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new MagmaWallBlock(FabricBlockSettings.copyOf(DecoBlocks.POLISHED_BLACKSTONE_TILES)), ItemGroup.DECORATIONS);

    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)), ItemGroup.REDSTONE);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)), ItemGroup.REDSTONE);

    public static final Block STONE_TEMP = registerBlock("stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block SMOOTH_STONE_TEMP = registerBlock("smooth_stone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block POLISHED_ANDESITE_TEMP = registerBlock("polished_andesite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block POLISHED_DIORITE_TEMP = registerBlock("polished_diorite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block POLISHED_GRANITE_TEMP = registerBlock("polished_granite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block DRIPSTONE_TEMP = registerBlock("dripstone_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block CALCITE_TEMP = registerBlock("calcite_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block TUFF_TEMP = registerBlock("tuff_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block PACKED_MUD_TEMP = registerBlock("packed_mud_temp",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(0f)), ItemGroup.SEARCH);
    public static final Block NETHER_BRICKS_TEMP = registerBlock("nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block RED_NETHER_BRICKS_TEMP = registerBlock("red_nether_bricks_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block NETHERRACK_TEMP = registerBlock("netherrack_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block MAGMA_TEMP = registerBlock("magma_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block SNOW_TEMP = registerBlock("snow_temp",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0f)), ItemGroup.SEARCH);
    public static final Block PACKED_ICE_TEMP = registerBlock("packed_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)), ItemGroup.SEARCH);
    public static final Block BLUE_ICE_TEMP = registerBlock("blue_ice_temp",
            new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(0f)), ItemGroup.SEARCH);
    public static final Block SANDSTONE_TOP_TEMP = registerBlock("sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);
    public static final Block RED_SANDSTONE_TOP_TEMP = registerBlock("red_sandstone_top_temp",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0f)), ItemGroup.SEARCH);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK,new Identifier(VaranDeco.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM,new Identifier(VaranDeco.MOD_ID, name),
                new BlockItem(block, new Item.Settings().group(tab)));
    }

    public static void registerDecoBlocks(){
        VaranDeco.LOGGER.debug("Registering Blocks for " + VaranDeco.MOD_ID);
    }
}
