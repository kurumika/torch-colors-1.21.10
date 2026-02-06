package net.kurumika.torchcolors.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kurumika.torchcolors.TorchColors;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CUSTOM_TORCH = registerBlock(
            "custom_torch", new TorchBlock(
                    ParticleTypes.FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).emissiveLighting((state, world, pos) -> true).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "custom_torch")))
            ));
    public static final Block CUSTOM_WALL_TORCH = registerBlock(
            "custom_wall_torch", new WallTorchBlock(
                    ParticleTypes.FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).emissiveLighting((state, world, pos) -> true).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "custom_wall_torch")))
            ));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TorchColors.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TorchColors.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        TorchColors.LOGGER.info("Registering Mod Blocks for " + TorchColors.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.CUSTOM_TORCH);
            entries.add(ModBlocks.CUSTOM_WALL_TORCH);
        });
    }
}
