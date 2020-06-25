package com.AllBacon.magicfurnace.util.handlers;

import com.AllBacon.magicfurnace.blocks.magic_furance.TileEntityMagicFurnace;
import com.AllBacon.magicfurnace.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityMagicFurnace.class, "magic_furnace");
	}
}
