package me.luphira.blocks.custom

import me.luphira.Simplecannons
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.FacingBlock
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.DirectionProperty
import net.minecraft.state.property.Properties
import net.minecraft.util.BlockMirror
import net.minecraft.util.BlockRotation
import net.minecraft.util.math.Direction

class ChargedDispenser(settings: Settings?) : FacingBlock(settings) {
    val FACING: DirectionProperty = Properties.FACING

    //TODO: top texture for the charged dispenser

    init {
        defaultState = defaultState.with(Properties.FACING, Direction.NORTH)
    }

    override fun getPlacementState(ctx: ItemPlacementContext?): BlockState? {
        //TODO: Dispensers cannot be placed facing up
        return this.defaultState.with(FACING, ctx?.playerFacing?.opposite)
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>?) {
        super.appendProperties(builder)
        builder?.add(Properties.FACING)
    }

    companion object {

    }
}