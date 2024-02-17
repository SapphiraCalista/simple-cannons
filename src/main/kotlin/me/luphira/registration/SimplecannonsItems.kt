package me.luphira.registration

import me.luphira.Simplecannons
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class SimplecannonsItems {
    // Function to make registering look a lot nicer
    private fun register(name: String, settings: Item) {
        Registry.register(Registry.ITEM, Identifier(Simplecannons.modid, name), settings)
    }

    fun registerItems() {
        Simplecannons.logger.info("Simple Cannons will now begin initialising items.")
        register("crude_cannon_ball", Item(FabricItemSettings().group(ItemGroup.COMBAT)))
        register("item_two", Item(FabricItemSettings()))
        register("item_three", Item(FabricItemSettings()))


    }
}