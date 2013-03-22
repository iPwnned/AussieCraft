package mods.aussiecraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import mods.aussiecraft.common.CommonProxyAussie;
import mods.aussiecraft.common.EntityAusArrow;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyAussie extends CommonProxyAussie {

	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityAusArrow.class, new RenderAusArrow());
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
}
