package net.creeper.soc;

import net.creeper.soc.block.ModBlocks;
import net.creeper.soc.entity.ModEntities;
import net.creeper.soc.item.ModItemGroup;
import net.creeper.soc.item.ModItems;
import net.creeper.soc.item.custom.ModMusicDiscItem;
import net.creeper.soc.sound.ModSounds;
import net.creeper.soc.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class StoryOfCreeper implements ModInitializer {
	public static final String MOD_ID = "soc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GeckoLib.initialize();
		ModBlocks.RegisterModBlocks();
		ModItems.registerModItems();
		ModRegistries.registerModStuffs();
	}
}
