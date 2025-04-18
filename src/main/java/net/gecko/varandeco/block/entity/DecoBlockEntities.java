package net.gecko.varandeco.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DecoBlockEntities {

    public static BlockEntityType<DeepslateFurnaceBlockEntity> DEEPSLATE_FURNACE_BE;

    public static BlockEntityType<BlackstoneFurnaceBlockEntity> BLACKSTONE_FURNACE_BE;

    public static BlockEntityType<DeepslateBlastFurnaceBlockEntity> DEEPSLATE_BLAST_FURNACE_BE;

    public static BlockEntityType<BlackstoneBlastFurnaceBlockEntity> BLACKSTONE_BLAST_FURNACE_BE;

    public static BlockEntityType<DeepslateSmokerBlockEntity> DEEPSLATE_SMOKER_BE;

    public static BlockEntityType<BlackstoneSmokerBlockEntity> BLACKSTONE_SMOKER_BE;

    public static void registerBlockEntities(){

        DEEPSLATE_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(VaranDeco.MOD_ID, "deepslate_furnace_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateFurnaceBlockEntity::new,
                        DecoBlocks.DEEPSLATE_FURNACE).build(null));

        BLACKSTONE_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(VaranDeco.MOD_ID, "blackstone_furnace_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneFurnaceBlockEntity::new,
                        DecoBlocks.BLACKSTONE_FURNACE).build(null));

        DEEPSLATE_BLAST_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(VaranDeco.MOD_ID, "deepslate_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateBlastFurnaceBlockEntity::new,
                        DecoBlocks.DEEPSLATE_BLAST_FURNACE).build(null));

        BLACKSTONE_BLAST_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(VaranDeco.MOD_ID, "blackstone_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneBlastFurnaceBlockEntity::new,
                        DecoBlocks.BLACKSTONE_BLAST_FURNACE).build(null));

        DEEPSLATE_SMOKER_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(VaranDeco.MOD_ID, "deepslate_smoker_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateSmokerBlockEntity::new,
                        DecoBlocks.DEEPSLATE_SMOKER).build(null));

        BLACKSTONE_SMOKER_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(VaranDeco.MOD_ID, "blackstone_smoker_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneSmokerBlockEntity::new,
                        DecoBlocks.BLACKSTONE_SMOKER).build(null));
    }
}
