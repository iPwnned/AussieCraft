package mods.aussiecraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class OpalArmor extends ItemArmor implements IArmorTextureProvider {

	public OpalArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == aussiecraft.opalHelmet.itemID || itemstack.itemID == aussiecraft.opalPlate.itemID || itemstack.itemID == aussiecraft.opalBoots.itemID){
			return "/mods/aussiecraft/textures/armor/opal_1.png";
		}
		if(itemstack.itemID == aussiecraft.opalLegs.itemID){
			return "/mods/aussiecraft/textures/armor/opal_2.png";
		}
		else return "/mods/aussiecraft/textures/armor/opal_2.png";
	}
}
