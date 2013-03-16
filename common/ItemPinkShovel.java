package mods.aussiecraft.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ItemPinkShovel extends ItemSpade {

	
	public ItemPinkShovel(int i, EnumToolMaterial enumToolMaterial){
		super(i, enumToolMaterial);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
