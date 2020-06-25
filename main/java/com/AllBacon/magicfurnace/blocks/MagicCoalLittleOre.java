package com.AllBacon.magicfurnace.blocks;

import java.util.Random;

import com.AllBacon.magicfurnace.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class MagicCoalLittleOre extends BlockBase {

	public MagicCoalLittleOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(9.0F);
		setResistance(9.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand,int fortune) {
		return ModItems.MAGIC_COAL_LITTLE;
	}
	@Override 
	public int quantityDropped(Random rand) {
		int max = 9;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}