package me.luphira.blocks

import me.luphira.blockentities.ChargedDispenserBlockEntity
import me.luphira.registration.SimplecannonsBlockEntities
import net.minecraft.block.Block
import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityTicker
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.DirectionProperty
import net.minecraft.state.property.Properties
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.World


class ChargedDispenser(settings: Settings?) : BlockWithEntity(settings) {
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

    override fun createBlockEntity(pos: BlockPos?, state: BlockState?): BlockEntity? {
        return ChargedDispenserBlockEntity(pos, state)
    }

    override fun getRenderType(state: BlockState?): BlockRenderType {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL
    }

    //whyyyyy are you evil :<<
    companion object {

    }
}