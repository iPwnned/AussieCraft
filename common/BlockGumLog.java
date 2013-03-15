package mods.aussiecraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockGumLog extends Block {

	private int blockIndexInTexture;

	public BlockGumLog(int par1, int par2, Material par3Material) {
		super(par1, par3Material);
		this.setCreativeTab(aussiecraft.tabAussieCraft);
		this.field_94336_cN = iconRegister.func_94245_a("aussiecraft:gumLog");
	}
	}