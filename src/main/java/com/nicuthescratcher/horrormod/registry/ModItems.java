package com.nicuthescratcher.horrormod.registry;

import com.nicuthescratcher.horrormod.HorrorMod;
import com.nicuthescratcher.horrormod.items.CustomSwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CUSTOM_SWORD = new CustomSwordItem();
    
    public static void register() {
        Registry.register(
            Registries.ITEM,
            new Identifier(HorrorMod.MOD_ID, "custom_sword"),
            CUSTOM_SWORD
        );
    }
}