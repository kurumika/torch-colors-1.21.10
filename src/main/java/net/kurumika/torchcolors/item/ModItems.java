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

    public static final Item CUSTOM_TORCH_ITEM = registerItem("custom_torch_item", new VerticallyAttachableBlockItem(ModBlocks.CUSTOM_TORCH, ModBlocks.CUSTOM_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TorchColors.MOD_ID,"custom_torch_item")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TorchColors.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TorchColors.LOGGER.info("Registering Mod Items for " + TorchColors.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModItems.CUSTOM_TORCH_ITEM);
        });
    }
}
