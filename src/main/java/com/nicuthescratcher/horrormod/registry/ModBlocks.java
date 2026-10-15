package com.nicuthescratcher.horrormod.registry;

import com.nicuthescratcher.horrormod.HorrorMod;
import com.nicuthescratcher.horrormod.blocks.CustomBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CUSTOM_BLOCK = new CustomBlock();
    
    public static void register() {
        Registry.register(
            Registries.BLOCK,
            new Identifier(HorrorMod.MOD_ID, "custom_block"),
            CUSTOM_BLOCK
        );
    }
}