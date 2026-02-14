package net.kurumika.torchcolors.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kurumika.torchcolors.TorchColors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TORCH_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TorchColors.MOD_ID, "torch_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CUSTOM_TORCH_ITEM)).displayName(Text.translatable("itemgroup.torchcolors.torch_items")).entries((displayContext, entries) -> {
                entries.add(ModItems.CUSTOM_TORCH_ITEM);
                entries.add(ModItems.WHITE_TORCH_ITEM);
            }).build());
    public static void registerItemGroups() {
        TorchColors.LOGGER.info("Registering Item Groups for " + TorchColors.MOD_ID);
    }
}
