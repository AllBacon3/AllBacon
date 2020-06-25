package com.AllBacon.magicfurnace.items;

import com.AllBacon.magicfurnace.Main;
import com.AllBacon.magicfurnace.init.ModItems;
import com.AllBacon.magicfurnace.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MAGIC_FURNACE_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
