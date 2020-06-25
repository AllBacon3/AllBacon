package com.AllBacon.magicfurnace.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CampfireBlock extends BlockBase {
public static final AxisAlignedBB CAMPFIRE_BLOCK_AABB = new AxisAlignedBB(0D, 0D, 1D, 1D, 0.2D, 0D);
	

public CampfireBlock(String name) {
	super (name, Material.WOOD);
	setSoundType(SoundType.WOOD);
	setHardness(2.0F);
	setResistance(3.0F);
	setHarvestLevel("axe", 0);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state,IBlockAccess source, BlockPos pos)
	{
		return CAMPFIRE_BLOCK_AABB;
	}
	
}
