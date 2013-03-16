package mods.aussiecraft.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class ItemPinkSword extends ItemSword {

	
	public ItemPinkSword(int i, EnumToolMaterial enumToolMaterial){
		super(i, enumToolMaterial);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	
}
