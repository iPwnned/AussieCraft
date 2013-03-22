package mods.aussiecraft.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class InfusedCoalFuelHandler  implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == aussiecraft.infusedCoal.itemID){
			return 2160;
		}else if(fuel.itemID == aussiecraft.Enrichedcoal.itemID){
			return 2160;
		}else{
			return 0;
		}
		
	}

}
