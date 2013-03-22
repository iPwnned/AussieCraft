package mods.aussiecraft.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPinkOre extends Block {

	public BlockPinkOre(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}
	public int idDropped(int par1, Random rand, int par2){
		return aussiecraft.pinkDiamond.itemID;
	}
	
}
