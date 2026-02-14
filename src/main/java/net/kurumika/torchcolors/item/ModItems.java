package net.kurumika.torchcolors.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kurumika.torchcolors.TorchColors;
import net.kurumika.torchcolors.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModItems {

    public static final Item BLACK_TORCH_ITEM = registerItem("black_torch_item", new VerticallyAttachableBlockItem(ModBlocks.BLACK_TORCH, ModBlocks.BLACK_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "black_torch_item")))));
    public static final Item BLUE_TORCH_ITEM = registerItem("blue_torch_item", new VerticallyAttachableBlockItem(ModBlocks.BLUE_TORCH, ModBlocks.BLUE_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "blue_torch_item")))));
    public static final Item BROWN_TORCH_ITEM = registerItem("brown_torch_item", new VerticallyAttachableBlockItem(ModBlocks.BROWN_TORCH, ModBlocks.BROWN_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "brown_torch_item")))));
    public static final Item CYAN_TORCH_ITEM = registerItem("cyan_torch_item", new VerticallyAttachableBlockItem(ModBlocks.CYAN_TORCH, ModBlocks.CYAN_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "cyan_torch_item")))));
    public static final Item GRAY_TORCH_ITEM = registerItem("gray_torch_item", new VerticallyAttachableBlockItem(ModBlocks.GRAY_TORCH, ModBlocks.GRAY_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "gray_torch_item")))));
    public static final Item GREEN_TORCH_ITEM = registerItem("green_torch_item", new VerticallyAttachableBlockItem(ModBlocks.GREEN_TORCH, ModBlocks.GREEN_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "green_torch_item")))));
    public static final Item LIGHT_BLUE_TORCH_ITEM = registerItem("light_blue_torch_item", new VerticallyAttachableBlockItem(ModBlocks.LIGHT_BLUE_TORCH, ModBlocks.LIGHT_BLUE_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "light_blue_torch_item")))));
    public static final Item LIGHT_GRAY_TORCH_ITEM = registerItem("light_gray_torch_item", new VerticallyAttachableBlockItem(ModBlocks.LIGHT_GRAY_TORCH, ModBlocks.LIGHT_GRAY_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "light_gray_torch_item")))));
    public static final Item LIME_TORCH_ITEM = registerItem("lime_torch_item", new VerticallyAttachableBlockItem(ModBlocks.LIME_TORCH, ModBlocks.LIME_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "lime_torch_item")))));
    public static final Item MAGENTA_TORCH_ITEM = registerItem("magenta_torch_item", new VerticallyAttachableBlockItem(ModBlocks.MAGENTA_TORCH, ModBlocks.MAGENTA_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "magenta_torch_item")))));
    public static final Item ORANGE_TORCH_ITEM = registerItem("orange_torch_item", new VerticallyAttachableBlockItem(ModBlocks.ORANGE_TORCH, ModBlocks.ORANGE_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "orange_torch_item")))));
    public static final Item PINK_TORCH_ITEM = registerItem("pink_torch_item", new VerticallyAttachableBlockItem(ModBlocks.PINK_TORCH, ModBlocks.PINK_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "pink_torch_item")))));
    public static final Item PURPLE_TORCH_ITEM = registerItem("purple_torch_item", new VerticallyAttachableBlockItem(ModBlocks.PURPLE_TORCH, ModBlocks.PURPLE_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "purple_torch_item")))));
    public static final Item RED_TORCH_ITEM = registerItem("red_torch_item", new VerticallyAttachableBlockItem(ModBlocks.RED_TORCH, ModBlocks.RED_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "red_torch_item")))));
    public static final Item WHITE_TORCH_ITEM = registerItem("white_torch_item", new VerticallyAttachableBlockItem(ModBlocks.WHITE_TORCH, ModBlocks.WHITE_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "white_torch_item")))));
    public static final Item YELLOW_TORCH_ITEM = registerItem("yellow_torch_item", new VerticallyAttachableBlockItem(ModBlocks.YELLOW_TORCH, ModBlocks.YELLOW_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID, "yellow_torch_item")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TorchColors.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TorchColors.LOGGER.info("Registering Mod Items for " + TorchColors.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModItems.BLACK_TORCH_ITEM);
            entries.add(ModItems.BLUE_TORCH_ITEM);
            entries.add(ModItems.BROWN_TORCH_ITEM);
            entries.add(ModItems.CYAN_TORCH_ITEM);
            entries.add(ModItems.GRAY_TORCH_ITEM);
            entries.add(ModItems.GREEN_TORCH_ITEM);
            entries.add(ModItems.LIGHT_BLUE_TORCH_ITEM);
            entries.add(ModItems.LIGHT_GRAY_TORCH_ITEM);
            entries.add(ModItems.LIME_TORCH_ITEM);
            entries.add(ModItems.MAGENTA_TORCH_ITEM);
            entries.add(ModItems.ORANGE_TORCH_ITEM);
            entries.add(ModItems.PINK_TORCH_ITEM);
            entries.add(ModItems.PURPLE_TORCH_ITEM);
            entries.add(ModItems.RED_TORCH_ITEM);
            entries.add(ModItems.WHITE_TORCH_ITEM);
            entries.add(ModItems.YELLOW_TORCH_ITEM);
        });
    }
}
