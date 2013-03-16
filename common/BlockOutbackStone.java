
package mods.aussiecraft.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOutbackStone extends Block {

	public BlockOutbackStone(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
	}

}
