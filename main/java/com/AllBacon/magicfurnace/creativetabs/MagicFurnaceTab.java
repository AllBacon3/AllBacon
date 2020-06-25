package com.AllBacon.magicfurnace.creativetabs;

import com.AllBacon.magicfurnace.Main;
import com.AllBacon.magicfurnace.init.ModItems;
import com.AllBacon.magicfurnace.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MagicFurnaceTab extends CreativeTabs {

	public MagicFurnaceTab() {
		super(Reference.MOD_ID);
		
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.MAGIC_COAL);
	}
}
