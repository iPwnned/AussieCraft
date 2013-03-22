package mods.aussiecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemInrichedCoal extends Item{

	
	public ItemInrichedCoal(int par1){
		super(par1);
		setMaxStackSize(64);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
