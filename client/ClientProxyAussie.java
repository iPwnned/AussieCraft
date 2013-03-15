package mods.aussiecraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import mods.aussiecraft.common.CommonProxyAussie;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyAussie extends CommonProxyAussie {

	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(AusEnity.class, new RenderKolaMob(new ModelKoala(), 0.5F));
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
}
