package com.AllBacon.magicfurnace.init;

import java.util.ArrayList;
import java.util.List;

import com.AllBacon.magicfurnace.blocks.BlockBase;
import com.AllBacon.magicfurnace.blocks.CampfireBlock;
import com.AllBacon.magicfurnace.blocks.MagicCoalBlock;
import com.AllBacon.magicfurnace.blocks.MagicCoalLittleOre;
import com.AllBacon.magicfurnace.blocks.MagicCoalOre;
import com.AllBacon.magicfurnace.blocks.magic_furance.MagicFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Blocks
	public static final Block MAGIC_COAL_BLOCK = new MagicCoalBlock("magic_coal_block", Material.IRON);
	public static final Block CAMPFIRE_BLOCK = new CampfireBlock("campfire_block");
	public static final Block MAGIC_COAL_ORE = new MagicCoalOre("magic_coal_ore", Material.ROCK);
	public static final Block MAGIC_COAL_LITTLE_ORE = new MagicCoalLittleOre("magic_coal_little_ore", Material.ROCK);
	public static final Block MAGIC_FURNACE_OFF = new MagicFurnace("magic_furnace_off", false);
	public static final Block MAGIC_FURNACE_ON = new MagicFurnace("magic_furnace_on", true);
}
