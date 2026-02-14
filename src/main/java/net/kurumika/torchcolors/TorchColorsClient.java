package net.kurumika.torchcolors;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.kurumika.torchcolors.particle.CustomFlame;
import net.kurumika.torchcolors.particle.ModParticles;

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
    }
}
