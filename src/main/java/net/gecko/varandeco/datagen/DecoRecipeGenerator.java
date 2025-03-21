package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class DecoRecipeGenerator extends FabricRecipeProvider {
    public DecoRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerWallRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Items.DIORITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Items.GRANITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);

        offerWallRecipe(exporter, DecoBlocks.STONE_WALL, Items.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_WALL, Items.STONE);

        createStairsRecipe(DecoBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Items.SMOOTH_STONE))
                .criterion(hasItem(Items.SMOOTH_STONE),conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);

        createStairsRecipe(DecoBlocks.CALCITE_STAIRS, Ingredient.ofItems(Items.CALCITE))
                .criterion(hasItem(Items.CALCITE),conditionsFromItem(Items.CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CALCITE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_STAIRS, Items.CALCITE);

        offerSlabRecipe(exporter, DecoBlocks.CALCITE_SLAB, Items.CALCITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_SLAB, Items.CALCITE,2);

        offerWallRecipe(exporter, DecoBlocks.CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_WALL, Items.CALCITE);

        createStairsRecipe(DecoBlocks.TUFF_STAIRS, Ingredient.ofItems(Items.TUFF))
                .criterion(hasItem(Items.TUFF),conditionsFromItem(Items.TUFF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TUFF_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_STAIRS, Items.TUFF);

        offerSlabRecipe(exporter, DecoBlocks.TUFF_SLAB, Items.TUFF);
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_SLAB, Items.TUFF,2);

        offerWallRecipe(exporter, DecoBlocks.TUFF_WALL, Items.TUFF);
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_WALL, Items.TUFF);

        createStairsRecipe(DecoBlocks.DRIPSTONE_STAIRS, Ingredient.ofItems(Items.DRIPSTONE_BLOCK))
                .criterion(hasItem(Items.DRIPSTONE_BLOCK),conditionsFromItem(Items.DRIPSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DRIPSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_STAIRS, Items.DRIPSTONE_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK,2);

        offerWallRecipe(exporter, DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Items.CHISELED_STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, Items.STONE_BRICKS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_WALL, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Items.CHISELED_STONE_BRICKS, Items.COBBLESTONE);

        createStairsRecipe(DecoBlocks.POLISHED_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_STONE),conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_STAIRS, DecoBlocks.POLISHED_STONE);

        offerSlabRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE,2);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Items.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, DecoBlocks.POLISHED_STONE);

        createStairsRecipe(DecoBlocks.STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.STONE_TILES))
                .criterion(hasItem(DecoBlocks.STONE_TILES),conditionsFromItem(DecoBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.STONE_TILES);

        offerSlabRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES,2);

        offerWallRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Items.COBBLESTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Items.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Items.STONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Items.STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Items.STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Items.STONE_BRICKS);

        createStairsRecipe(DecoBlocks.PACKED_MUD_STAIRS, Ingredient.ofItems(Items.PACKED_MUD))
                .criterion(hasItem(Items.PACKED_MUD),conditionsFromItem(Items.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_MUD_STAIRS)));

        offerSlabRecipe(exporter, DecoBlocks.PACKED_MUD_SLAB, Items.PACKED_MUD);
        offerWallRecipe(exporter, DecoBlocks.PACKED_MUD_WALL, Items.PACKED_MUD);

        ShapedRecipeJsonBuilder.create(DecoBlocks.RED_NETHER_BRICK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Items.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Items.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)));

        createStairsRecipe(DecoBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Items.NETHERRACK))
                .criterion(hasItem(Items.NETHERRACK),conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.NETHERRACK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_STAIRS, Items.NETHERRACK);

        offerSlabRecipe(exporter, DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK,2);

        offerWallRecipe(exporter, DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);

        createStairsRecipe(DecoBlocks.MAGMA_STAIRS, Ingredient.ofItems(Items.MAGMA_BLOCK))
                .criterion(hasItem(Items.MAGMA_BLOCK),conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_STAIRS, Items.MAGMA_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK,2);

        offerWallRecipe(exporter, DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);

        createStairsRecipe(DecoBlocks.MAGMA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGMA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGMA_BRICKS),conditionsFromItem(DecoBlocks.MAGMA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_STAIRS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_STAIRS, DecoBlocks.MAGMA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, Items.MAGMA_BLOCK,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS,2);

        offerWallRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICKS);

        offerPolishedStoneRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILES),conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerSlabRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES,2);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.BLACKSTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.POLISHED_GLIDED_BLACKSTONE,2)
                .pattern("P#")
                .pattern("#P")
                .input('P', Items.POLISHED_BLACKSTONE)
                .input('#', Items.GILDED_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Items.POLISHED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.POLISHED_BLACKSTONE))
                .criterion(RecipeProvider.hasItem(Items.GILDED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.GILDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .input('C', Items.CHISELED_POLISHED_BLACKSTONE)
                .input('#', DecoBlocks.POLISHED_GLIDED_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Items.CHISELED_POLISHED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.CHISELED_POLISHED_BLACKSTONE))
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_STAIRS)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_STAIRS)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_SLAB,2)
                .pattern("###")
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_SLAB)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_WALL)
                .pattern("###")
                .pattern("###")
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_WALL)));

        createStairsRecipe(DecoBlocks.PACKED_ICE_STAIRS, Ingredient.ofItems(Items.PACKED_ICE))
                .criterion(hasItem(Items.PACKED_ICE),conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PACKED_ICE_STAIRS, Items.PACKED_ICE);

        offerSlabRecipe(exporter, DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE,2);

        offerWallRecipe(exporter, DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);

        createStairsRecipe(DecoBlocks.BLUE_ICE_STAIRS, Ingredient.ofItems(Items.BLUE_ICE))
                .criterion(hasItem(Items.BLUE_ICE),conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_ICE_STAIRS, Items.BLUE_ICE);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE,2);

        offerWallRecipe(exporter, DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);

        ShapedRecipeJsonBuilder.create(DecoItems.SNOW_BRICK,8)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', Items.ICE)
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Items.ICE),
                        RecipeProvider.conditionsFromItem(Items.ICE))
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.SNOW_BRICK)));

        offerPolishedStoneRecipe(exporter, DecoBlocks.SNOW_BRICKS, DecoItems.SNOW_BRICK);

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_BRICK_STAIRS)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_BRICK_SLAB,2)
                .pattern("###")
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_BRICK_WALL)
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_SNOW_BRICKS)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('S', Items.SNOWBALL)
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_SNOW_BRICKS)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.ICE_BRICKS)
                .pattern("/#")
                .pattern("#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_ICE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_ICE))
                .criterion(RecipeProvider.hasItem(Items.PACKED_ICE),
                        RecipeProvider.conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.ICE_BRICKS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICKS, Items.BLUE_ICE);

        createStairsRecipe(DecoBlocks.ICE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ICE_BRICKS))
                .criterion(hasItem(DecoBlocks.ICE_BRICKS),conditionsFromItem(DecoBlocks.ICE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ICE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_STAIRS, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_STAIRS, DecoBlocks.ICE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_SLAB, Items.BLUE_ICE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS,2);

        offerWallRecipe(exporter, DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLACK_ICE)
                .pattern("/#/")
                .pattern("#/#")
                .pattern("/#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_ICE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_ICE))
                .criterion(RecipeProvider.hasItem(Items.PACKED_ICE),
                        RecipeProvider.conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLACK_ICE)));

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_SANDSTONE))
                .criterion(hasItem(Items.CUT_SANDSTONE),conditionsFromItem(Items.CUT_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_STAIRS, Items.CUT_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_RED_SANDSTONE))
                .criterion(hasItem(Items.CUT_RED_SANDSTONE),conditionsFromItem(Items.CUT_RED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICKS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        ShapelessRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANKS,2)
                .input(Items.CACTUS)
                .criterion(RecipeProvider.hasItem(Items.CACTUS),
                        RecipeProvider.conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANKS)));

        createStairsRecipe(DecoBlocks.CACTUS_PLANK_STAIRS, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANK_STAIRS)));

        offerSlabRecipe(exporter, DecoBlocks.CACTUS_PLANK_SLAB, DecoBlocks.CACTUS_PLANKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE_GATE)));

        offerPressurePlateRecipe(exporter, DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE, DecoBlocks.CACTUS_PLANKS);

        ShapelessRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANK_BUTTON)
                .input(DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_BUTTON)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_DOOR)));
        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_TRAPDOOR)));

        createSignRecipe(DecoItems.CACTUS_SIGN, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.CACTUS_SIGN)));

        offerWallRecipe(exporter, DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);

        offerWallRecipe(exporter, DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE, Items.PRISMARINE_CRYSTALS);

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerSlabRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerWallRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE), Items.SEA_LANTERN,
                0.35f, 200).criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE), conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier("sea_lantern_from_smelting"));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.LIGHT_PRISMARINE)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .input('I', Items.WHITE_DYE)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .criterion(RecipeProvider.hasItem(Items.WHITE_DYE),
                        RecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.LIGHT_PRISMARINE)));

        createStairsRecipe(DecoBlocks.LIGHT_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_PRISMARINE))
                .criterion(hasItem(DecoBlocks.LIGHT_PRISMARINE),conditionsFromItem(DecoBlocks.LIGHT_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_STAIRS, DecoBlocks.LIGHT_PRISMARINE);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);

        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_SHARD)
                .input('I', Items.PRISMARINE_CRYSTALS)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_SHARD),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_PRISMARINE_BRICKS)));
        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .input('I', Items.PRISMARINE_SHARD)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_SHARD),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)));

        ShapelessRecipeJsonBuilder.create(DecoItems.BUBBLE_ORB)
                .input(Items.WATER_BUCKET)
                .input(Items.SLIME_BALL)
                .criterion(RecipeProvider.hasItem(Items.SLIME_BALL),
                        RecipeProvider.conditionsFromItem(Items.SLIME_BALL))
                .criterion(RecipeProvider.hasItem(Items.WATER_BUCKET),
                        RecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.BUBBLE_ORB)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.BUBBLE_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .input('#', Items.COBBLESTONE)
                .input('I', DecoItems.BUBBLE_ORB)
                .criterion(RecipeProvider.hasItem(Items.COBBLESTONE),
                        RecipeProvider.conditionsFromItem(Items.COBBLESTONE))
                .criterion(RecipeProvider.hasItem(DecoItems.BUBBLE_ORB),
                        RecipeProvider.conditionsFromItem(DecoItems.BUBBLE_ORB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BUBBLE_BLOCK)));

        createStairsRecipe(DecoBlocks.BUBBLE_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BLOCK))
                .criterion(hasItem(DecoBlocks.BUBBLE_BLOCK),conditionsFromItem(DecoBlocks.BUBBLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_STAIRS, DecoBlocks.BUBBLE_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);

        offerWallRecipe(exporter, DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);

        createStairsRecipe(DecoBlocks.BUBBLE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BRICKS))
                .criterion(hasItem(DecoBlocks.BUBBLE_BRICKS),conditionsFromItem(DecoBlocks.BUBBLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICKS);

        offerPolishedStoneRecipe(exporter, DecoBlocks.SOUL_SOILSTONE, Items.SOUL_SOIL);

        createStairsRecipe(DecoBlocks.SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);

        offerSlabRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);

        offerWallRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerWallRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE), DecoBlocks.SMOOTH_SOUL_SOILSTONE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier("smooth_soul_soilstone_from_smelting"));

        createStairsRecipe(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerWallRecipe(exporter, DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);

        createStairsRecipe(DecoBlocks.QUARTZ_BRICK_STAIRS, Ingredient.ofItems(Items.QUARTZ_BRICKS))
                .criterion(hasItem(Items.QUARTZ_BRICKS),conditionsFromItem(Items.QUARTZ_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.QUARTZ_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.CUT_QUARTZ)
                .pattern("#Q")
                .pattern("Q#")
                .input('#', Items.QUARTZ_BLOCK)
                .input('Q', Items.QUARTZ)
                .criterion(RecipeProvider.hasItem(Items.QUARTZ_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
                .criterion(RecipeProvider.hasItem(Items.QUARTZ),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CUT_QUARTZ)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ, Items.QUARTZ_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_QUARTZ_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_QUARTZ))
                .criterion(hasItem(DecoBlocks.CUT_QUARTZ),conditionsFromItem(DecoBlocks.CUT_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_QUARTZ_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_STAIRS, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_STAIRS, DecoBlocks.CUT_QUARTZ);

        offerSlabRecipe(exporter, DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_SLAB, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);

        offerWallRecipe(exporter, DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);

        ShapedRecipeJsonBuilder.create(Items.WARPED_WART_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.WARPED_WART)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.WARPED_WART_BLOCK)));

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICKS), DecoBlocks.CRACKED_RED_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICKS), conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier("cracked_red_nether_bricks_from_smelting"));

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLUE_NETHER_BRICKS)
                .pattern("#N")
                .pattern("N#")
                .input('#', DecoItems.WARPED_WART)
                .input('N', Items.NETHER_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICKS)));

        createStairsRecipe(DecoBlocks.BLUE_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS),conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_STAIRS, DecoBlocks.BLUE_NETHER_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLUE_NETHER_BRICK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)));

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS), DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier("cracked_blue_nether_bricks_from_smelting"));

        ShapedRecipeJsonBuilder.create(Items.ENDER_PEARL)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" # ")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(RecipeProvider.hasItem(Items.CHORUS_FRUIT),
                        RecipeProvider.conditionsFromItem(Items.CHORUS_FRUIT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(Items.ENDER_EYE)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" #B")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .input('B', Items.BLAZE_POWDER)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(RecipeProvider.hasItem(Items.CHORUS_FRUIT),
                        RecipeProvider.conditionsFromItem(Items.CHORUS_FRUIT))
                .criterion(RecipeProvider.hasItem(Items.BLAZE_POWDER),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier("ender_eye_from_warped_wart"));

        createStairsRecipe(DecoBlocks.TERRACOTTA_STAIRS, Ingredient.ofItems(Items.TERRACOTTA))
                .criterion(hasItem(Items.TERRACOTTA),conditionsFromItem(Items.TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_STAIRS, Items.TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);

        createStairsRecipe(DecoBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.WHITE_TERRACOTTA))
                .criterion(hasItem(Items.WHITE_TERRACOTTA),conditionsFromItem(Items.WHITE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_STAIRS, Items.WHITE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BLACK_TERRACOTTA))
                .criterion(hasItem(Items.BLACK_TERRACOTTA),conditionsFromItem(Items.BLACK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_STAIRS, Items.BLACK_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.GRAY_TERRACOTTA))
                .criterion(hasItem(Items.GRAY_TERRACOTTA),conditionsFromItem(Items.GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_STAIRS, Items.GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_TERRACOTTA))
                .criterion(hasItem(Items.LIGHT_GRAY_TERRACOTTA),conditionsFromItem(Items.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BROWN_TERRACOTTA))
                .criterion(hasItem(Items.BROWN_TERRACOTTA),conditionsFromItem(Items.BROWN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_STAIRS, Items.BROWN_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.RED_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.RED_TERRACOTTA))
                .criterion(hasItem(Items.RED_TERRACOTTA),conditionsFromItem(Items.RED_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_STAIRS, Items.RED_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);

        createStairsRecipe(DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.ORANGE_TERRACOTTA))
                .criterion(hasItem(Items.ORANGE_TERRACOTTA),conditionsFromItem(Items.ORANGE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Items.ORANGE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.YELLOW_TERRACOTTA))
                .criterion(hasItem(Items.YELLOW_TERRACOTTA),conditionsFromItem(Items.YELLOW_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Items.YELLOW_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIME_TERRACOTTA))
                .criterion(hasItem(Items.LIME_TERRACOTTA),conditionsFromItem(Items.LIME_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_STAIRS, Items.LIME_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.GREEN_TERRACOTTA))
                .criterion(hasItem(Items.GREEN_TERRACOTTA),conditionsFromItem(Items.GREEN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_STAIRS, Items.GREEN_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.CYAN_TERRACOTTA))
                .criterion(hasItem(Items.CYAN_TERRACOTTA),conditionsFromItem(Items.CYAN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_STAIRS, Items.CYAN_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BLUE_TERRACOTTA))
                .criterion(hasItem(Items.BLUE_TERRACOTTA),conditionsFromItem(Items.BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_STAIRS, Items.BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_TERRACOTTA))
                .criterion(hasItem(Items.LIGHT_BLUE_TERRACOTTA),conditionsFromItem(Items.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.PURPLE_TERRACOTTA))
                .criterion(hasItem(Items.PURPLE_TERRACOTTA),conditionsFromItem(Items.PURPLE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Items.PURPLE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.MAGENTA_TERRACOTTA))
                .criterion(hasItem(Items.MAGENTA_TERRACOTTA),conditionsFromItem(Items.MAGENTA_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Items.MAGENTA_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.PINK_TERRACOTTA))
                .criterion(hasItem(Items.PINK_TERRACOTTA),conditionsFromItem(Items.PINK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_STAIRS, Items.PINK_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);

        createStairsRecipe(DecoBlocks.WHITE_CONCRETE_STAIRS, Ingredient.ofItems(Items.WHITE_CONCRETE))
                .criterion(hasItem(Items.WHITE_CONCRETE),conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);

        createStairsRecipe(DecoBlocks.BLACK_CONCRETE_STAIRS, Ingredient.ofItems(Items.BLACK_CONCRETE))
                .criterion(hasItem(Items.BLACK_CONCRETE),conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Items.GRAY_CONCRETE))
                .criterion(hasItem(Items.GRAY_CONCRETE),conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE),conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.BROWN_CONCRETE_STAIRS, Ingredient.ofItems(Items.BROWN_CONCRETE))
                .criterion(hasItem(Items.BROWN_CONCRETE),conditionsFromItem(Items.BROWN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.RED_CONCRETE_STAIRS, Ingredient.ofItems(Items.RED_CONCRETE))
                .criterion(hasItem(Items.RED_CONCRETE),conditionsFromItem(Items.RED_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_CONCRETE_STAIRS, Items.RED_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);

        createStairsRecipe(DecoBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(Items.ORANGE_CONCRETE))
                .criterion(hasItem(Items.ORANGE_CONCRETE),conditionsFromItem(Items.ORANGE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);

        createStairsRecipe(DecoBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(Items.YELLOW_CONCRETE))
                .criterion(hasItem(Items.YELLOW_CONCRETE),conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.LIME_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIME_CONCRETE))
                .criterion(hasItem(Items.LIME_CONCRETE),conditionsFromItem(Items.LIME_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.GREEN_CONCRETE_STAIRS, Ingredient.ofItems(Items.GREEN_CONCRETE))
                .criterion(hasItem(Items.GREEN_CONCRETE),conditionsFromItem(Items.GREEN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.CYAN_CONCRETE_STAIRS, Ingredient.ofItems(Items.CYAN_CONCRETE))
                .criterion(hasItem(Items.CYAN_CONCRETE),conditionsFromItem(Items.CYAN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Items.BLUE_CONCRETE))
                .criterion(hasItem(Items.BLUE_CONCRETE),conditionsFromItem(Items.BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE),conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(Items.PURPLE_CONCRETE))
                .criterion(hasItem(Items.PURPLE_CONCRETE),conditionsFromItem(Items.PURPLE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(Items.MAGENTA_CONCRETE))
                .criterion(hasItem(Items.MAGENTA_CONCRETE),conditionsFromItem(Items.MAGENTA_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.PINK_CONCRETE_STAIRS, Ingredient.ofItems(Items.PINK_CONCRETE))
                .criterion(hasItem(Items.PINK_CONCRETE),conditionsFromItem(Items.PINK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.WHITE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.WHITE_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.WHITE_DYE),
                        RecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier("dye_white_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIGHT_GRAY_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.LIGHT_GRAY_DYE),
                        RecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier("dye_light_gray_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.GRAY_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.GRAY_DYE),
                        RecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier("dye_gray_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLACK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BLACK_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.BLACK_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier("dye_black_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.BROWN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BROWN_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.BROWN_DYE),
                        RecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier("dye_brown_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.RED_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.RED_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.RED_DYE),
                        RecipeProvider.conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier("dye_red_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.ORANGE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.ORANGE_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.ORANGE_DYE),
                        RecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier("dye_orange_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.YELLOW_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.YELLOW_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.YELLOW_DYE),
                        RecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier("dye_yellow_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.LIME_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIME_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.LIME_DYE),
                        RecipeProvider.conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier("dye_lime_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.GREEN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.GREEN_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.GREEN_DYE),
                        RecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("dye_green_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.CYAN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.CYAN_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.CYAN_DYE),
                        RecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier("dye_cyan_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIGHT_BLUE_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.LIGHT_BLUE_DYE),
                        RecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier("dye_light_blue_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BLUE_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("dye_blue_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.PURPLE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.PURPLE_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE),
                        RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("dye_purple_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.MAGENTA_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.MAGENTA_DYE),
                        RecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier("dye_magenta_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(DecoBlocks.PINK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.PINK_DYE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(RecipeProvider.hasItem(Items.PINK_DYE),
                        RecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier("dye_pink_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);

        createStairsRecipe(DecoBlocks.TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_STAIRS, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_STAIRS, DecoBlocks.TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_SLAB, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_WALL, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.WHITE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BLACK_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.GRAY_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BROWN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.RED_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, DecoBlocks.RED_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_WALL, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIME_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.GREEN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.CYAN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BLUE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.PINK_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_WHITE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_WHITE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_WHITE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, DecoBlocks.CUT_WHITE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BLACK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BLACK_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BLACK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, DecoBlocks.CUT_BLACK_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CUT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BROWN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BROWN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BROWN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, DecoBlocks.CUT_BROWN_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_RED_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_RED_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_RED_CONCRETE),conditionsFromItem(DecoBlocks.CUT_RED_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_STAIRS, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_STAIRS, DecoBlocks.CUT_RED_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_SLAB, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_WALL, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_ORANGE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_ORANGE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_ORANGE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, DecoBlocks.CUT_ORANGE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_YELLOW_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_YELLOW_CONCRETE),conditionsFromItem(DecoBlocks.CUT_YELLOW_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, DecoBlocks.CUT_YELLOW_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIME_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIME_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIME_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_STAIRS, DecoBlocks.CUT_LIME_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GREEN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_GREEN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_GREEN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, DecoBlocks.CUT_GREEN_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_CYAN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_CYAN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_CYAN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, DecoBlocks.CUT_CYAN_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PURPLE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_PURPLE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_PURPLE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, DecoBlocks.CUT_PURPLE_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_MAGENTA_CONCRETE),conditionsFromItem(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, DecoBlocks.CUT_MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PINK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_PINK_CONCRETE),conditionsFromItem(DecoBlocks.CUT_PINK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_STAIRS, DecoBlocks.CUT_PINK_CONCRETE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE);

        offerWallRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.WHITE_CONCRETE_PILLAR, DecoBlocks.WHITE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_CONCRETE_PILLAR, Items.WHITE_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, Items.LIGHT_GRAY_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.GRAY_CONCRETE_PILLAR, DecoBlocks.GRAY_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_CONCRETE_PILLAR, Items.GRAY_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.BLACK_CONCRETE_PILLAR, DecoBlocks.BLACK_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_CONCRETE_PILLAR, Items.BLACK_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.BROWN_CONCRETE_PILLAR, DecoBlocks.BROWN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_CONCRETE_PILLAR, Items.BROWN_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.RED_CONCRETE_PILLAR, DecoBlocks.RED_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_CONCRETE_PILLAR, Items.RED_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.ORANGE_CONCRETE_PILLAR, DecoBlocks.ORANGE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_CONCRETE_PILLAR, Items.ORANGE_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.YELLOW_CONCRETE_PILLAR, DecoBlocks.YELLOW_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_CONCRETE_PILLAR, Items.YELLOW_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.LIME_CONCRETE_PILLAR, DecoBlocks.LIME_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_CONCRETE_PILLAR, Items.LIME_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.GREEN_CONCRETE_PILLAR, DecoBlocks.GREEN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_CONCRETE_PILLAR, Items.GREEN_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CYAN_CONCRETE_PILLAR, DecoBlocks.CYAN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_CONCRETE_PILLAR, Items.CYAN_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, Items.LIGHT_BLUE_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.BLUE_CONCRETE_PILLAR, DecoBlocks.BLUE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_CONCRETE_PILLAR, Items.BLUE_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.PURPLE_CONCRETE_PILLAR, DecoBlocks.PURPLE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_CONCRETE_PILLAR, Items.PURPLE_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.MAGENTA_CONCRETE_PILLAR, DecoBlocks.MAGENTA_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_CONCRETE_PILLAR, Items.MAGENTA_CONCRETE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.PINK_CONCRETE_PILLAR, DecoBlocks.PINK_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_CONCRETE_PILLAR, Items.PINK_CONCRETE);

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.TINTED_GLASS_PANE, Blocks.TINTED_GLASS);
    }
}
