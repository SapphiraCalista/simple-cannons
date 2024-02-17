package me.luphira

import me.luphira.blocks.SimplecannonsBlocks
import me.luphira.items.SimplecannonsItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Simplecannons : ModInitializer {
	val logger = LoggerFactory.getLogger("simplecannons")
	const val modid = "simplecannons"
	override fun onInitialize() {
		// Some things (like resources) may still be uninitialized. Proceed with mild caution.
		logger.info("Simple Cannons 1.18.2 Fabric now starting...")
		// Registration
		SimplecannonsItems().registerItems()
		SimplecannonsBlocks().registerBlocks()
		logger.info("Simple Cannons registration finished.")
	}
}