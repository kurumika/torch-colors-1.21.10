package net.kurumika.torchcolors;

import net.fabricmc.api.ModInitializer;

import net.kurumika.torchcolors.block.ModBlocks;
import net.kurumika.torchcolors.item.ModItemGroups;
import net.kurumika.torchcolors.item.ModItems;
import net.kurumika.torchcolors.particle.ModParticles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TorchColors implements ModInitializer {
	public static final String MOD_ID = "torchcolors";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModParticles.registerParticles();
	}
}