package net.fabricmc.carpettrapdoors.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ModTrapdoorBlock extends TrapdoorBlock {

    public ModTrapdoorBlock(Settings settings, SoundEvent closeSound, SoundEvent openSound) {
        super(settings, closeSound, openSound);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (!(Boolean)state.get(OPEN)) {
            return state.get(HALF) == BlockHalf.TOP ? Block.createCuboidShape(0.0, 15.0, 0.0, 16.0, 16.0, 16.0) : Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
        } else {
            switch (state.get(FACING)) {
                case NORTH:
                default:
                    return Block.createCuboidShape(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
                case SOUTH:
                    return Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
                case WEST:
                    return Block.createCuboidShape(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
                case EAST:
                    return Block.createCuboidShape(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
            }
        }
    }
}
