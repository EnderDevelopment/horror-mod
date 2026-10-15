package com.nicuthescratcher.horrormod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HorrorMod implements ModInitializer {
    public static final String MOD_ID = "horrormod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    @Override
    public void onInitialize() {
        ModItems.register();
        ModBlocks.register();
        
        LOGGER.info("HorrorMod has been initialized!");
    }
}