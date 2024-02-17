package me.luphira.blocks

import me.luphira.Simplecannons
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class SimplecannonsBlocks {
    // Function to make registering look a lot nicer
    private fun register(name: String, block: Block, itemGroup: ItemGroup) {
        registerItem(name, block, itemGroup)
        Registry.register(Registry.BLOCK, Identifier(Simplecannons.modid, name), block)
    }
    private fun registerItem(name: String, block: Block, itemGroup: ItemGroup) {
        Registry.register(Registry.ITEM, Identifier(Simplecannons.modid, name),
            BlockItem(block, FabricItemSettings().group(itemGroup)))
    }

    fun registerBlocks() {
        Simplecannons.logger.info("Simple Cannons will now begin initialising blocks.")
        // To do: Create a function to register blocks to prevent horrors later.
        register("charged_dispenser", Block(FabricBlockSettings.of(Material.STONE).strength(6f)), ItemGroup.REDSTONE)
        //register("charged_dispenser", ChargedDispenser, ItemGroup.REDSTONE) // The replacement dispenser, does not work.
    }
}