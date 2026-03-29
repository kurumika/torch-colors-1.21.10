package net.kurumika.torchcolors.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kurumika.torchcolors.TorchColors;
import net.kurumika.torchcolors.particle.ModParticles;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLACK_TORCH = registerBlock("black_torch", new TorchBlock(ModParticles.BLACK_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "black_torch")))));
    public static final Block BLACK_WALL_TORCH = registerBlock("black_wall_torch", new WallTorchBlock(ModParticles.BLACK_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "black_wall_torch")))));
    public static final Block BLUE_TORCH = registerBlock("blue_torch", new TorchBlock(ModParticles.BLUE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "blue_torch")))));
    public static final Block BLUE_WALL_TORCH = registerBlock("blue_wall_torch", new WallTorchBlock(ModParticles.BLUE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "blue_wall_torch")))));
    public static final Block BROWN_TORCH = registerBlock("brown_torch", new TorchBlock(ModParticles.BROWN_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "brown_torch")))));
    public static final Block BROWN_WALL_TORCH = registerBlock("brown_wall_torch", new WallTorchBlock(ModParticles.BROWN_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "brown_wall_torch")))));
    public static final Block CYAN_TORCH = registerBlock("cyan_torch", new TorchBlock(ModParticles.CYAN_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "cyan_torch")))));
    public static final Block CYAN_WALL_TORCH = registerBlock("cyan_wall_torch", new WallTorchBlock(ModParticles.CYAN_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "cyan_wall_torch")))));
    public static final Block GRAY_TORCH = registerBlock("gray_torch", new TorchBlock(ModParticles.GRAY_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "gray_torch")))));
    public static final Block GRAY_WALL_TORCH = registerBlock("gray_wall_torch", new WallTorchBlock(ModParticles.GRAY_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "gray_wall_torch")))));
    public static final Block GREEN_TORCH = registerBlock("green_torch", new TorchBlock(ModParticles.GREEN_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "green_torch")))));
    public static final Block GREEN_WALL_TORCH = registerBlock("green_wall_torch", new WallTorchBlock(ModParticles.GREEN_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "green_wall_torch")))));
    public static final Block LIGHT_BLUE_TORCH = registerBlock("light_blue_torch", new TorchBlock(ModParticles.LIGHT_BLUE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "light_blue_torch")))));
    public static final Block LIGHT_BLUE_WALL_TORCH = registerBlock("light_blue_wall_torch", new WallTorchBlock(ModParticles.LIGHT_BLUE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "light_blue_wall_torch")))));
    public static final Block LIGHT_GRAY_TORCH = registerBlock("light_gray_torch", new TorchBlock(ModParticles.LIGHT_GRAY_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "light_gray_torch")))));
    public static final Block LIGHT_GRAY_WALL_TORCH = registerBlock("light_gray_wall_torch", new WallTorchBlock(ModParticles.LIGHT_GRAY_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "light_gray_wall_torch")))));
    public static final Block LIME_TORCH = registerBlock("lime_torch", new TorchBlock(ModParticles.LIME_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "lime_torch")))));
    public static final Block LIME_WALL_TORCH = registerBlock("lime_wall_torch", new WallTorchBlock(ModParticles.LIME_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "lime_wall_torch")))));
    public static final Block MAGENTA_TORCH = registerBlock("magenta_torch", new TorchBlock(ModParticles.MAGENTA_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "magenta_torch")))));
    public static final Block MAGENTA_WALL_TORCH = registerBlock("magenta_wall_torch", new WallTorchBlock(ModParticles.MAGENTA_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "magenta_wall_torch")))));
    public static final Block ORANGE_TORCH = registerBlock("orange_torch", new TorchBlock(ModParticles.ORANGE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "orange_torch")))));
    public static final Block ORANGE_WALL_TORCH = registerBlock("orange_wall_torch", new WallTorchBlock(ModParticles.ORANGE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "orange_wall_torch")))));
    public static final Block PINK_TORCH = registerBlock("pink_torch", new TorchBlock(ModParticles.PINK_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "pink_torch")))));
    public static final Block PINK_WALL_TORCH = registerBlock("pink_wall_torch", new WallTorchBlock(ModParticles.PINK_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "pink_wall_torch")))));
    public static final Block PURPLE_TORCH = registerBlock("purple_torch", new TorchBlock(ModParticles.PURPLE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "purple_torch")))));
    public static final Block PURPLE_WALL_TORCH = registerBlock("purple_wall_torch", new WallTorchBlock(ModParticles.PURPLE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "purple_wall_torch")))));
    public static final Block RED_TORCH = registerBlock("red_torch", new TorchBlock(ModParticles.RED_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "red_torch")))));
    public static final Block RED_WALL_TORCH = registerBlock("red_wall_torch", new WallTorchBlock(ModParticles.RED_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "red_wall_torch")))));
    public static final Block WHITE_TORCH = registerBlock("white_torch", new TorchBlock(ModParticles.WHITE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "white_torch")))));
    public static final Block WHITE_WALL_TORCH = registerBlock("white_wall_torch", new WallTorchBlock(ModParticles.WHITE_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "white_wall_torch")))));
    public static final Block YELLOW_TORCH = registerBlock("yellow_torch", new TorchBlock(ModParticles.YELLOW_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "yellow_torch")))));
    public static final Block YELLOW_WALL_TORCH = registerBlock("yellow_wall_torch", new WallTorchBlock(ModParticles.YELLOW_FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TorchColors.MOD_ID, "yellow_wall_torch")))));

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
            entries.add(ModBlocks.BLACK_TORCH);
            entries.add(ModBlocks.BLACK_WALL_TORCH);
            entries.add(ModBlocks.BLUE_TORCH);
            entries.add(ModBlocks.BLUE_WALL_TORCH);
            entries.add(ModBlocks.BROWN_TORCH);
            entries.add(ModBlocks.BROWN_WALL_TORCH);
            entries.add(ModBlocks.CYAN_TORCH);
            entries.add(ModBlocks.CYAN_WALL_TORCH);
            entries.add(ModBlocks.GRAY_TORCH);
            entries.add(ModBlocks.GRAY_WALL_TORCH);
            entries.add(ModBlocks.GREEN_TORCH);
            entries.add(ModBlocks.GREEN_WALL_TORCH);
            entries.add(ModBlocks.LIGHT_BLUE_TORCH);
            entries.add(ModBlocks.LIGHT_BLUE_WALL_TORCH);
            entries.add(ModBlocks.LIGHT_GRAY_TORCH);
            entries.add(ModBlocks.LIGHT_GRAY_WALL_TORCH);
            entries.add(ModBlocks.LIME_TORCH);
            entries.add(ModBlocks.LIME_WALL_TORCH);
            entries.add(ModBlocks.MAGENTA_TORCH);
            entries.add(ModBlocks.MAGENTA_WALL_TORCH);
            entries.add(ModBlocks.ORANGE_TORCH);
            entries.add(ModBlocks.ORANGE_WALL_TORCH);
            entries.add(ModBlocks.PINK_TORCH);
            entries.add(ModBlocks.PINK_WALL_TORCH);
            entries.add(ModBlocks.PURPLE_TORCH);
            entries.add(ModBlocks.PURPLE_WALL_TORCH);
            entries.add(ModBlocks.RED_TORCH);
            entries.add(ModBlocks.RED_WALL_TORCH);
            entries.add(ModBlocks.WHITE_TORCH);
            entries.add(ModBlocks.WHITE_WALL_TORCH);
            entries.add(ModBlocks.YELLOW_TORCH);
            entries.add(ModBlocks.YELLOW_WALL_TORCH);
        });
    }
}
