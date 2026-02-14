package net.kurumika.torchcolors;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.kurumika.torchcolors.particle.CustomFlame;
import net.kurumika.torchcolors.particle.ModParticles;

public class TorchColorsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.CUSTOM_FLAME, CustomFlame.Factory::new);
    }
}
