package net.gecko.varandeco.world.feature.tree;

import net.gecko.varandeco.world.feature.DecoConfiguredFeatures;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class WoodenSaplingGenerator extends LargeTreeSaplingGenerator {
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        if (random.nextInt(10) == 0) {
            return DecoConfiguredFeatures.DECO_FANCY_WOODEN_TREE_KEY;
        } else {
            return DecoConfiguredFeatures.DECO_WOODEN_TREE_KEY;
        }
    }

    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return DecoConfiguredFeatures.DECO_MEGA_WOODEN_TREE_KEY;
    }
}
