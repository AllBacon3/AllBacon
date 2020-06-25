package com.AllBacon.magicfurnace.util.handlers;

import com.AllBacon.magicfurnace.blocks.magic_furance.ContainerMagicFurnace;
import com.AllBacon.magicfurnace.blocks.magic_furance.GuiMagicFurnace;
import com.AllBacon.magicfurnace.blocks.magic_furance.TileEntityMagicFurnace;
import com.AllBacon.magicfurnace.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		
		if(ID == Reference.GUI_MAGIC_FURNACE)
		{
			return new ContainerMagicFurnace(player.inventory, (TileEntityMagicFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		
		if(ID == Reference.GUI_MAGIC_FURNACE)
		{
			return new GuiMagicFurnace(player.inventory, (TileEntityMagicFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
	
	public static void registerGuis()
	{
		
	}
}