package com.AllBacon.magicfurnace.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagicCoalBlock extends BlockBase {

	public MagicCoalBlock(String name, Material material) {
		
		super(name, material);
	
		setSoundType(SoundType.STONE);
		setHardness(30.0F);
		setResistance(600.0F);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(1.0F); hoeveel licht het af geeft
		//setLightOpacity(1); of het light makkelijk door een block kan schijnen
		//setBlockUnbreakable(); dat het niet kapot mag
		
	}

}
