package org.avp.world.dimension.varda.gen;

import java.util.Random;

import org.avp.AliensVsPredator;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TerrainFormation1 extends TerrainFormation
{
    private static final IBlockState block = AliensVsPredator.blocks().unidirt.getDefaultState();
    
    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {
        if (this.shouldNotGenerate(world, pos))
        {
            return false;
        }

        this.setBlock(world, pos, 0, 0, 1, block);
        this.setBlock(world, pos, 0, 1, 1, block);
        this.setBlock(world, pos, 0, 2, 1, block);
        this.setBlock(world, pos, 1, 0, 0, block);
        this.setBlock(world, pos, 1, 0, 1, block);
        this.setBlock(world, pos, 1, 0, 2, block);
        this.setBlock(world, pos, 1, 1, 0, block);
        this.setBlock(world, pos, 1, 1, 1, block);
        this.setBlock(world, pos, 1, 2, 1, block);
        this.setBlock(world, pos, 1, 3, 1, block);
        this.setBlock(world, pos, 1, 4, 1, block);
        this.setBlock(world, pos, 1, 5, 1, block);
        this.setBlock(world, pos, 2, 0, 1, block);
        this.setBlock(world, pos, 2, 1, 1, block);

        return true;
    }
}
