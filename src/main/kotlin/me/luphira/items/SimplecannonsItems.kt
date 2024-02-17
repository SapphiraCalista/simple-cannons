package me.luphira.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.slf4j.LoggerFactory


class SimplecannonsItems {
    private val CUSTOM_ITEM: Item = Item(FabricItemSettings()) // Provides settings like durability apparently
    fun registerItems() {
        val logger = LoggerFactory.getLogger("simplecannons")
        logger.info("Simple Cannons will now begin initialising items.")
        // To do: Create a function to register items to prevent horrors later.
        Registry.register<Item, Item>(Registry.ITEM, Identifier("simplecannons", "crude_cannon_ball"), CUSTOM_ITEM) // IntelliJ auto converted this, don't ask me what <Item, Item> means
    }
}