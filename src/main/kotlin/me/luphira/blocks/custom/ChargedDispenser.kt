package me.luphira.blocks.custom

import me.luphira.Simplecannons
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.DirectionProperty
import net.minecraft.state.property.Properties
import net.minecraft.util.BlockMirror
import net.minecraft.util.BlockRotation

class ChargedDispenser(settings: Settings?) : Block(settings) {
    val FACING: DirectionProperty = Properties.HORIZONTAL_FACING
    override fun getPlacementState(ctx: ItemPlacementContext?): BlockState? {
        return this.defaultState.with(FACING, ctx?.playerFacing?.opposite)
    }

    override fun rotate(state: BlockState?, rotation: BlockRotation?): BlockState? {
        if (state != null) {
            return state.with(FACING, rotation?.rotate(state.get(FACING)))
        } else {
            return state
        }
    }

    override fun mirror(state: BlockState?, mirror: BlockMirror?): BlockState? {
        if (state != null && mirror != null) {
            return state.rotate(mirror.getRotation(state.get(FACING)))
        } else {
            Simplecannons.logger.info("Something has gone seriously wrong with Simple Cannons.")
            return state
        }
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>?) {
        super.appendProperties(builder)
        builder?.add(FACING)
    }
}