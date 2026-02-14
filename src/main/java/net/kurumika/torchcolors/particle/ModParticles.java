package net.kurumika.torchcolors.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.kurumika.torchcolors.TorchColors;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final SimpleParticleType CUSTOM_FLAME = registerParticle("custom_flame", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(TorchColors.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        TorchColors.LOGGER.info("Registering Particles for " + TorchColors.MOD_ID);
    }
}