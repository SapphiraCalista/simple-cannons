package me.luphira.blockentities

import me.luphira.Simplecannons
import me.luphira.registration.SimplecannonsBlockEntities
import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World


class ChargedDispenserBlockEntity(pos: BlockPos?, state: BlockState?) : BlockEntity(SimplecannonsBlockEntities.CHARGED_DISPENSER, pos, state){
    companion object {
        fun tick(world1: World?, pos: BlockPos?, state1: BlockState?, be: BlockEntity) {
            Simplecannons.logger.info("meow")
        }
    }
}
