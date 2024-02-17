package me.luphira.registration

import me.luphira.Simplecannons
import me.luphira.blockentities.ChargedDispenserBlockEntity
import net.fabricmc.fabric.api.`object`.builder.v1.block.entity.FabricBlockEntityTypeBuilder
import net.minecraft.block.*
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry


object SimplecannonsBlockEntities {
    fun registerBlockEntities() {
        Simplecannons.logger.info("Simple Cannons will now begin initialising blocks.")

        //todo: clean up
    }
    val CHARGED_DISPENSER = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            Identifier(Simplecannons.modid, "charged_dispenser"),
            FabricBlockEntityTypeBuilder.create({ pos: BlockPos?, state: BlockState? -> ChargedDispenserBlockEntity(pos, state) }, SimplecannonsBlocks.CHARGED_DISPENSER).build()
    )


}