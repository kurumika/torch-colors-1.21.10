package net.kurumika.torchcolors.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.kurumika.torchcolors.TorchColors;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final SimpleParticleType BLACK_FLAME = registerParticle("black_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType BLUE_FLAME = registerParticle("blue_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType BROWN_FLAME = registerParticle("brown_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType CYAN_FLAME = registerParticle("cyan_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType GRAY_FLAME = registerParticle("gray_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType GREEN_FLAME = registerParticle("green_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType LIGHT_BLUE_FLAME = registerParticle("light_blue_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType LIGHT_GRAY_FLAME = registerParticle("light_gray_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType LIME_FLAME = registerParticle("lime_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType MAGENTA_FLAME = registerParticle("magenta_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType ORANGE_FLAME = registerParticle("orange_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType PINK_FLAME = registerParticle("pink_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType PURPLE_FLAME = registerParticle("purple_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType RED_FLAME = registerParticle("red_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType WHITE_FLAME = registerParticle("white_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType YELLOW_FLAME = registerParticle("yellow_flame", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(TorchColors.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        TorchColors.LOGGER.info("Registering Particles for " + TorchColors.MOD_ID);
    }
}