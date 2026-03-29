package net.kurumika.torchcolors;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.kurumika.torchcolors.block.ModBlocks;
import net.kurumika.torchcolors.particle.CustomFlame;
import net.kurumika.torchcolors.particle.ModParticles;
import net.minecraft.client.render.BlockRenderLayer;

public class TorchColorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLACK_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLUE_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BROWN_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.CYAN_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GRAY_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LIGHT_BLUE_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LIGHT_GRAY_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LIME_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGENTA_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.ORANGE_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.PINK_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.PURPLE_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.WHITE_FLAME, CustomFlame.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.YELLOW_FLAME, CustomFlame.Factory::new);

        BlockRenderLayerMap.putBlocks(BlockRenderLayer.CUTOUT,
                ModBlocks.WHITE_TORCH, ModBlocks.WHITE_WALL_TORCH,
                ModBlocks.ORANGE_TORCH, ModBlocks.ORANGE_WALL_TORCH,
                ModBlocks.MAGENTA_TORCH, ModBlocks.MAGENTA_WALL_TORCH,
                ModBlocks.LIGHT_BLUE_TORCH, ModBlocks.LIGHT_BLUE_WALL_TORCH,
                ModBlocks.YELLOW_TORCH, ModBlocks.YELLOW_WALL_TORCH,
                ModBlocks.LIME_TORCH, ModBlocks.LIME_WALL_TORCH,
                ModBlocks.PINK_TORCH, ModBlocks.PINK_WALL_TORCH,
                ModBlocks.GRAY_TORCH, ModBlocks.GRAY_WALL_TORCH,
                ModBlocks.LIGHT_GRAY_TORCH, ModBlocks.LIGHT_GRAY_WALL_TORCH,
                ModBlocks.CYAN_TORCH, ModBlocks.CYAN_WALL_TORCH,
                ModBlocks.PURPLE_TORCH, ModBlocks.PURPLE_WALL_TORCH,
                ModBlocks.BLUE_TORCH, ModBlocks.BLUE_WALL_TORCH,
                ModBlocks.BROWN_TORCH, ModBlocks.BROWN_WALL_TORCH,
                ModBlocks.GREEN_TORCH, ModBlocks.GREEN_WALL_TORCH,
                ModBlocks.RED_TORCH, ModBlocks.RED_WALL_TORCH,
                ModBlocks.BLACK_TORCH, ModBlocks.BLACK_WALL_TORCH
        );
    }
}
