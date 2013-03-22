package mods.aussiecraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ipwnned_aussiecraft", name = "AussieCraft", version = "Aplha 1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class aussiecraft {

	@SidedProxy(clientSide = "mods.aussiecraft.client.ClientProxyAussie",
			serverSide = "mods.aussiecraft.common.CommonProxyAussie")
	public static CommonProxyAussie proxy;

	public BiomeGenBase outbackBiome = new BiomeOutback(40);

	public static EnumToolMaterial OPAL = EnumHelper.addToolMaterial("OPAL", 2, 400, 7.0F, 3, 10);
	public static EnumToolMaterial OPPAL = EnumHelper.addToolMaterial("OPPAL", 2, 400, 7.0F, 6, 10);
	public static EnumToolMaterial DOPAL = EnumHelper.addToolMaterial("DOPAL", 3, 650, 10.0F, 4, 10);
	public static EnumToolMaterial DOPPAL = EnumHelper.addToolMaterial("DOPPAL", 3, 650, 10.0F, 9, 10);
	public static EnumArmorMaterial OPALL = EnumHelper.addArmorMaterial("OPAL_ARMOUR", 23, new int[]{2, 6, 5, 2} ,10);
	public static EnumArmorMaterial DOPALL = EnumHelper.addArmorMaterial("DOPAL_ARMOUR", 40, new int[]{4, 8, 6, 3} ,20);
	public static EnumToolMaterial PINKD = EnumHelper.addToolMaterial("PINKD", 3, 650, 10.0F, 4, 10);
	public static EnumToolMaterial PINKDD = EnumHelper.addToolMaterial("PINKDD", 3, 650, 10.0F, 9, 10);
	public static EnumArmorMaterial PINKDI = EnumHelper.addArmorMaterial("PINKD_ARMOUR", 40, new int[]{4, 8, 6, 3} ,20);
	
	public static CreativeTabs tabAussieCraft = new CreativeTabAus("AussieCraft");

	public static Block testOre;
	public static Block opalOre;
	public static Block gumLog;
	public static Block gumLeaves;
	public static Block outbackBlock1;
	public static Block outbackBlock2;
	public static Block pinkOre;

	public static Item testingot;
	public static Item opalIngot;
	public static Item opalPickaxe;
	public static Item opalSword;
	public static Item opalAxe;
	public static Item opalShovel;
	public static Item opalHoe;
	public static Item damper;
	public static Item ashes;
	public static Item opalHelmet;
	public static Item opalPlate;
	public static Item opalLegs;
	public static Item opalBoots;
	public static Item infusedCoal;
	public static Item darkOpal;
	public static Item dopalPickaxe;
	public static Item dopalSword;
	public static Item dopalAxe;
	public static Item dopalShovel;
	public static Item dopalHoe;
	public static Item dopalHelmet;
	public static Item dopalPlate;
	public static Item dopalLegs;
	public static Item dopalBoots;
	public static Item knife;
	public static Item yeastSeed;
	public static Item pinkDiamond;
	public static Item pinkPickaxe;
	public static Item pinkSword;
	public static Item pinkAxe;
	public static Item pinkShovel;
	public static Item pinkHoe;
	public static Block enrichedCoal;
	public static Item Enrichedcoal;
	public static Item pinkdBow;

	
	int testOreID;
	int testingotID;
	int opalOreID;
	int opalIngotID;
	int opalPickaxeID;
	int opalSwordID;
	int opalAxeID;
	int opalShovelID;
	int opalHoeID;
	int gumLogID;
	int gumLeavesID;
	int damperID;
	int ashesID;
	int opalHelmetID;
	int opalPlateID;
	int opalLegsID;
	int opalBootsID;
	public static int outbackBlock1ID = 174;
	int infusedCoalID;
	int darkOpalID;
	int dopalPickaxeID;
	int dopalSwordID;
	int dopalAxeID;
	int dopalShovelID;
	int dopalHoeID;
	int dopalHelmetID;
	int dopalPlateID;
	int dopalLegsID;
	int dopalBootsID;
	int knifeID;
	public static int outbackBlock2ID = 175;
	int pinkOreID;
	int pinkDiamondID;
	int pinkPickaxeID;
	int pinkSwordID;
	int pinkAxeID;
	int pinkShovelID;
	int pinkHoeID;
	int enrichedCoalID;
	int EnrichedcoalID;
	int pinkdBowID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		opalOreID = config.get("Block IDs", "Opal Ore ID", 1952).getInt();
		gumLogID = config.get("Block IDs", "Eucalyptus Log ID", 1959).getInt();
		gumLeavesID = config.get("Block IDs", "Eucalyptus Leaves ID", 1961).getInt();
		testOreID = config.get("Block IDs", "Test Ore ID", 1950).getInt();
		pinkOreID = config.get("Block IDs", "Pink Diamond Ore ID", 1981).getInt();
		enrichedCoalID = config.get("Block IDs", "Inriched Coal Ore ID", 1888).getInt();
		EnrichedcoalID = config.get("Block IDs", "Inriched Coal", 1889).getInt();
		
		opalIngotID = config.get("Item IDs", "Opal Ingot ID", 1953).getInt();
		opalPickaxeID = config.get("Item IDs", "Opal Pickaxe ID", 1954).getInt();
		opalSwordID = config.get("Item IDs", "Opal Sword ID", 1955).getInt();
		opalAxeID = config.get("Item IDs", "Opal Axe ID", 1956).getInt();
		opalShovelID = config.get("Item IDs", "Opal Shovel ID", 1957).getInt();
		opalHoeID = config.get("Item IDs", "Opal Hoe ID", 1958).getInt();
		ashesID = config.get("Item IDs", "Ashes ID", 1963).getInt();
		opalHelmetID = config.get("Item IDs", "Opal Helmet ID", 1964).getInt();
		opalPlateID = config.get("Item IDs", "Opal Chestplate ID", 1965).getInt();
		opalLegsID = config.get("Item IDs", "Opal Leggings ID", 1966).getInt();
		opalBootsID = config.get("Item IDs", "Opal Boots ID", 1967).getInt();
		infusedCoalID = config.get("Item IDs", "Infused Coal ID", 1969).getInt();
		darkOpalID = config.get("Item IDs", "Dark Opal ID", 1970).getInt();
		dopalPickaxeID = config.get("Item IDs", "Dark Opal Pickaxe ID", 1971).getInt();
		dopalSwordID = config.get("Item IDs", "Dark Opal Sword ID", 1972).getInt();
		dopalAxeID = config.get("Item IDs", "Dark Opal Axe ID", 1973).getInt();
		dopalShovelID = config.get("Item IDs", "Dark Opal Shovel ID", 1974).getInt();
		dopalHoeID = config.get("Item IDs", "Dark Opal Hoe ID", 1975).getInt();
		dopalHelmetID = config.get("Item IDs", "Dark Opal Helmet ID", 1976).getInt();
		dopalPlateID = config.get("Item IDs", "Dark Opal Chestplate ID", 1977).getInt();
		dopalLegsID = config.get("Item IDs", "Dark Opal Leggings ID", 1978).getInt();
		dopalBootsID = config.get("Item IDs", "Dark Opal Boots ID", 1979).getInt();
		testingotID = config.get("Item IDs", "Test Ingot ID", 1951).getInt();
		knifeID = config.get("Item IDs", "Knife ID", 1980).getInt();
		pinkDiamondID = config.get("Item IDs", "Pink Diamond ID", 1882).getInt();
		pinkPickaxeID = config.get("Item IDs", "Pink Diamond Pickaxe ID", 1883).getInt();
		pinkSwordID = config.get("Item IDs", "Pink Diamond Sword ID", 1884).getInt();
		pinkAxeID = config.get("Item IDs", "Pink Diamond Axe ID", 1885).getInt();
		pinkShovelID = config.get("Item IDs", "Pink Diamond Shovel ID", 1886).getInt();
		pinkHoeID = config.get("Item IDs", "Pink Diamond Hoe ID", 1887).getInt();
		pinkdBowID = config.get("Item IDs", "Pink Diamond Bow ID", 1890).getInt();
		
		damperID = config.get("Item IDs", "Damper ID", 1962).getInt();
				
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event){

		testOre = new BlockTestOre(testOreID, 255, Material.iron).setUnlocalizedName("aussiecraft:testOre").setHardness(2.5F).setResistance(50F).setStepSound(Block.soundMetalFootstep);
		opalOre = new BlockOpalOre(opalOreID, 0, Material.iron).setUnlocalizedName("aussiecraft:opalOre").setHardness(4F).setResistance(30F).setStepSound(Block.soundStoneFootstep);
		testingot = new Itemtestingot(testingotID).setUnlocalizedName("aussiecraft:testIngot");
		opalIngot = new ItemOpalIngot(opalIngotID).setUnlocalizedName("aussiecraft:opalIngot");
		pinkDiamond = new ItemPinkDiamond(pinkDiamondID).setUnlocalizedName("aussiecraft:pinkDiamond");
		opalPickaxe = new ItemOpalPickaxe(opalPickaxeID, OPAL).setUnlocalizedName("aussiecraft:opalPickaxe");
		opalSword = new ItemOpalSword(opalSwordID, OPPAL).setUnlocalizedName("aussiecraft:opalSword");
		opalAxe = new ItemOpalAxe(opalAxeID, OPAL).setUnlocalizedName("aussiecraft:opalAxe");
		opalShovel = new ItemOpalShovel(opalShovelID, OPAL).setUnlocalizedName("aussiecraft:opalShovel");
		opalHoe = new ItemOpalHoe(opalHoeID, OPAL).setUnlocalizedName("aussiecraft:opalHoe");
		gumLog = new BlockGumLog(gumLogID, 2, Material.wood).setUnlocalizedName("aussiecraft:gumLog").setHardness(2.0F);
		gumLeaves = new BlockGumLeaves(gumLeavesID, 6).setUnlocalizedName("aussiecraft:gumLeaves").setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep);
		damper = new ItemDamper(damperID, 6, 2.0F, false).setUnlocalizedName("aussiecraft:damper");
		ashes = new ItemAshes(ashesID).setUnlocalizedName("aussiecraft:ashes");
		opalHelmet = new OpalArmor(opalHelmetID, OPALL, proxy.addArmor("Opal"), 0).setUnlocalizedName("aussiecraft:opalHelmet");
		opalPlate = new OpalArmor(opalPlateID, OPALL, proxy.addArmor("Opal"), 1).setUnlocalizedName("aussiecraft:opalPlate");
		opalLegs = new OpalArmor(opalLegsID, OPALL, proxy.addArmor("Opal"), 2).setUnlocalizedName("aussiecraft:opalLegs");
		opalBoots = new OpalArmor(opalBootsID, OPALL, proxy.addArmor("Opal"), 3).setUnlocalizedName("aussiecraft:opalBoots");
		outbackBlock1 = new Block(outbackBlock1ID, Material.grass).setUnlocalizedName("aussiecraft:outbackBlock1").setCreativeTab(aussiecraft.tabAussieCraft).setHardness(0.2F).setStepSound(Block.soundGrassFootstep);
		darkOpal = new ItemDarkOpal(darkOpalID).setUnlocalizedName("aussiecraft:darkOpal");
		dopalPickaxe = new ItemDopalPickaxe(dopalPickaxeID, DOPAL).setUnlocalizedName("aussiecraft:dopalPickaxe");
		dopalSword = new ItemDopalSword(dopalSwordID, DOPPAL).setUnlocalizedName("aussiecraft:dopalSword");
		dopalAxe = new ItemDopalAxe(dopalAxeID, DOPAL).setUnlocalizedName("aussiecraft:dopalAxe");
		dopalShovel = new ItemDopalShovel(dopalShovelID, DOPAL).setUnlocalizedName("aussiecraft:dopalShovel");
		dopalHoe = new ItemDopalHoe(dopalHoeID, DOPAL).setUnlocalizedName("aussiecraft:dopalHoe");
		dopalHelmet = new DopalArmor(dopalHelmetID, DOPALL, proxy.addArmor("Dark Opal"), 0).setUnlocalizedName("aussiecraft:dopalHelmet");
		dopalPlate = new DopalArmor(dopalPlateID, DOPALL, proxy.addArmor("Dark Opal"), 1).setUnlocalizedName("aussiecraft:dopalPlate");
		dopalLegs = new DopalArmor(dopalLegsID, DOPALL, proxy.addArmor("Dark Opal"), 2).setUnlocalizedName("aussiecraft:dopalLegs");
		dopalBoots = new DopalArmor(dopalBootsID, DOPALL, proxy.addArmor("Dark Opal"), 3).setUnlocalizedName("aussiecraft:dopalBoots");
		knife = new ItemKnife(knifeID).setUnlocalizedName("aussiecraft:knife");
		outbackBlock2 = new Block(outbackBlock2ID, Material.rock).setUnlocalizedName("aussiecraft:outbackBlock2").setCreativeTab(aussiecraft.tabAussieCraft).setHardness(4.0F).setStepSound(Block.soundStoneFootstep);
		pinkOre = new BlockPinkOre(pinkOreID, Material.rock).setUnlocalizedName("aussiecraft:pinkOre").setCreativeTab(aussiecraft.tabAussieCraft).setHardness(4.0F);
		pinkPickaxe = new ItemPinkPickaxe(pinkPickaxeID, PINKD).setUnlocalizedName("aussiecraft:pinkPickaxe");
		pinkSword = new ItemPinkSword(pinkSwordID, PINKDD).setUnlocalizedName("aussiecraft:pinkSword");
		pinkAxe = new ItemPinkAxe(pinkAxeID, PINKD).setUnlocalizedName("aussiecraft:pinkAxe");
		pinkShovel = new ItemPinkShovel(pinkShovelID, PINKD).setUnlocalizedName("aussiecraft:pinkShovel");
		pinkHoe = new ItemPinkHoe(pinkHoeID, PINKD).setUnlocalizedName("aussiecraft:pinkHoe");
		enrichedCoal = new BlockInrichedCoal(enrichedCoalID, Material.rock).setUnlocalizedName("aussiecraft:enrichedOre").setHardness(4F).setResistance(26F).setStepSound(Block.soundStoneFootstep);
		Enrichedcoal = new ItemInrichedCoal(EnrichedcoalID).setUnlocalizedName("aussiecraft:Enrichedcoal");
		infusedCoal = new ItemInfusedCoal(infusedCoalID).setUnlocalizedName("aussiecraft:infusedCoal");
		pinkdBow = new pinkdBow(pinkdBowID).setUnlocalizedName("aussiecraft:pinkdBow");
		
		System.out.println("Terrain block IDs are: " + outbackBlock1ID + outbackBlock2ID);
		
		gameRegisters();
		languageRegisters();
		craftingRecipes();

		proxy.registerRenderThings();


		GameRegistry.addSmelting(opalOreID, new ItemStack(opalIngot, 1), 1F);
		GameRegistry.registerWorldGenerator(new AusWorldGen());
		GameRegistry.addBiome(outbackBiome);
		
		EntityRegistry.registerModEntity(EnityAus.class, "AusEnity", 1, this, 80, 3, true);
		EntityRegistry.addSpawn(EnityAus.class, 10, 2, 6, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.extremeHills, BiomeGenBase.jungle);
		LanguageRegistry.instance().addStringLocalization("entity.ipwnned_aussiecraft.AusEnity.name", "Entity AussieCraft");
		
		EntityRegistry.registerGlobalEntityID(EntityAusArrow.class, "AusArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityAusArrow.class, "AusArrow", 2, this, 128, 1, true);
		LanguageRegistry.instance().addStringLocalization("entity.ipwnned_aussiecraft.AusArrow.name", "Aus Arrow");
		
		GameRegistry.registerFuelHandler(new InfusedCoalFuelHandler());
		MinecraftForge.setToolClass(opalPickaxe, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(opalOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(pinkOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(enrichedCoal, "pickaxe", 1);
		MinecraftForge.setToolClass(opalAxe, "axe", 2);
		MinecraftForge.setToolClass(opalShovel, "shovel", 2);
		MinecraftForge.setToolClass(dopalPickaxe, "pickaxe", 3);
		MinecraftForge.setToolClass(dopalAxe, "axe", 3);
		MinecraftForge.setToolClass(dopalShovel, "shovel", 3);

	}

	public void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalPickaxe), new Object[]{
			"OOO", " S ", " S ",
			'O', opalIngot,
			'S', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalSword), new Object[]{
			" O ", " O ", " S ",
			'O', opalIngot,
			'S', Item.stick			

		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalAxe), new Object[]{
			"OO ", "OS ", " S ",
			'O', opalIngot,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalShovel), new Object[]{
			" O ", " S ", " S ",
			'O', opalIngot,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalHoe), new Object[]{
			"OO ", " S ", " S ",
			'O', opalIngot,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.ashes, 7), new Object[]{
			"WWW", "WWW", "CWW",
			'W', Block.planks,
			'C', Item.coal
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalHelmet), new Object[]{
			"OOO", "O O", "   ",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalPlate), new Object[]{
			"O O", "OOO", "OOO",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalLegs), new Object[]{
			"OOO", "O O", "O O",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.opalBoots), new Object[]{
			"   ", "O O", "O O",
			'O', opalIngot,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.damper), new Object[]{
			"AAA", "WWW", "AAA",
			'A', ashes,
			'W', Item.wheat,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.infusedCoal), new Object[]{
			"RRR", "CCC", "RRR",
			'R', Item.redstone,
			'C', Item.coal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.darkOpal), new Object[]{
			"IOI", "DOD", "IOI",
			'I', infusedCoal,
			'O', opalIngot,
			'D', Item.diamond,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalPickaxe), new Object[]{
			"DDD", " S ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalSword), new Object[]{
			" D ", " D ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalAxe), new Object[]{
			"DD ", "DS ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalShovel), new Object[]{
			" D ", " S ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalHoe), new Object[]{
			"DD ", " S ", " S ",
			'D', darkOpal,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalHelmet), new Object[]{
			"DDD", "D D", "   ",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalPlate), new Object[]{
			"D D", "DDD", "DDD",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalLegs), new Object[]{
			"DDD", "D D", "D D",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.dopalBoots), new Object[]{
			"   ", "D D", "D D",
			'D', darkOpal,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.knife), new Object[]{
			"   ", " O ", " S ",
			'O', opalIngot,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.pinkPickaxe), new Object[]{
			"PPP", " S ", " S ",
			'P', pinkDiamond,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.pinkSword), new Object[]{
			" P ", " P ", " S ",
			'P', pinkDiamond,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.pinkAxe), new Object[]{
			"PP ", "PS ", " S ",
			'P', pinkDiamond,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.pinkShovel), new Object[]{
			" P ", " S ", " S ",
			'P', pinkDiamond,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(aussiecraft.pinkHoe), new Object[]{
			"PP ", " S ", " S ",
			'P', pinkDiamond,
			'S', Item.stick,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 4), new Object[]{
		aussiecraft.gumLog,
		});
		
		
	}
	public void gameRegisters(){
		GameRegistry.registerBlock(testOre, "Test Ore");
		GameRegistry.registerBlock(opalOre, "Opal Ore");
		GameRegistry.registerBlock(gumLog, "Eucalyptus Log");
		GameRegistry.registerBlock(gumLeaves, "Eucalyptus Leaves");
		GameRegistry.registerItem(testingot, "Test Ingot");
		GameRegistry.registerItem(opalIngot, "Opal Ingot");
		GameRegistry.registerItem(opalPickaxe, "Opal Pickaxe");
		GameRegistry.registerItem(opalSword, "Opal Sword");
		GameRegistry.registerItem(opalAxe, "Opal Axe");
		GameRegistry.registerItem(opalShovel, "Opal Shovel");
		GameRegistry.registerItem(opalHoe, "Opal Hoe");
		GameRegistry.registerItem(damper, "Damper");
		GameRegistry.registerItem(ashes, "Ashes");
		GameRegistry.registerItem(opalHelmet, "Opal Helmet");
		GameRegistry.registerItem(opalPlate, "Opal Chestplate");
		GameRegistry.registerItem(opalLegs, "Opal Leggings");
		GameRegistry.registerItem(opalBoots, "Opal Boots");
		GameRegistry.registerBlock(outbackBlock1, "Outback Dirt");
		GameRegistry.registerItem(darkOpal, "Dark Opal");
		GameRegistry.registerItem(dopalPickaxe, "Dark Opal Pickaxe");
		GameRegistry.registerItem(dopalSword, "Dark Opal Sword");
		GameRegistry.registerItem(dopalAxe, "Dark Opal Axe");
		GameRegistry.registerItem(dopalShovel, "Dark Opal Shovel");
		GameRegistry.registerItem(dopalHoe, "Dark Opal Hoe");
		GameRegistry.registerItem(dopalHelmet, "Dark Opal Helmet");
		GameRegistry.registerItem(dopalPlate, "Dark Opal Chestplate");
		GameRegistry.registerItem(dopalLegs, "Dark Opal Leggings");
		GameRegistry.registerItem(dopalBoots, "Dark Opal Boots");
		GameRegistry.registerItem(knife, "Opal Knife");
		GameRegistry.registerBlock(outbackBlock2, "Outback Stone");
		GameRegistry.registerBlock(pinkOre, "Pink Diamond Ore");
		GameRegistry.registerItem(pinkPickaxe, "Pink Diamond Pickaxe");
		GameRegistry.registerItem(pinkSword, "Pink Diamond Sword");
		GameRegistry.registerItem(pinkAxe, "Pink Diamond Axe");
		GameRegistry.registerItem(pinkShovel, "Pink Diamond Shovel");
		GameRegistry.registerItem(pinkHoe, "Pink Diamond Hoe");
		GameRegistry.registerItem(pinkDiamond, "Pink Diamond");
		GameRegistry.registerBlock(enrichedCoal, "Enriched Coal Ore");
		GameRegistry.registerItem(Enrichedcoal, "Enriched Coal");
		GameRegistry.registerItem(infusedCoal, "Infused Coal");
		GameRegistry.registerItem(pinkdBow, "Pink Diamond Bow");
		

	}

	public void languageRegisters(){
		LanguageRegistry.addName(testOre, "Test Ore");
		LanguageRegistry.addName(opalOre, "Opal Ore");
		LanguageRegistry.addName(testingot, "Test Ingot");
		LanguageRegistry.addName(opalIngot, "Opal Ingot");
		LanguageRegistry.addName(opalPickaxe, "Opal Pickaxe");
		LanguageRegistry.addName(opalSword, "Opal Sword");
		LanguageRegistry.addName(opalAxe, "Opal Axe");
		LanguageRegistry.addName(opalShovel, "Opal Shovel");
		LanguageRegistry.addName(opalHoe, "Opal Hoe");
		LanguageRegistry.addName(gumLog, "Eucalyptus Log");
		LanguageRegistry.addName(gumLeaves, "Eucalyptus Leaves");
		LanguageRegistry.addName(damper, "Damper");
		LanguageRegistry.addName(ashes, "Ashes");
		LanguageRegistry.addName(opalHelmet, "Opal Helmet");
		LanguageRegistry.addName(opalPlate, "Opal Chestplate");
		LanguageRegistry.addName(opalLegs, "Opal Leggings");
		LanguageRegistry.addName(opalBoots, "Opal Boots");
		LanguageRegistry.addName(outbackBlock1, "Outback Dirt");
		LanguageRegistry.addName(darkOpal, "Dark Opal");
		LanguageRegistry.addName(dopalPickaxe, "Dark Opal Pickaxe");
		LanguageRegistry.addName(dopalSword, "Dark Opal Sword");
		LanguageRegistry.addName(dopalAxe, "Dark Opal Axe");
		LanguageRegistry.addName(dopalShovel, "Dark Opal Shovel");
		LanguageRegistry.addName(dopalHoe, "Dark Opal Hoe");
		LanguageRegistry.addName(dopalHelmet, "Dark Opal Helmet");
		LanguageRegistry.addName(dopalPlate, "Dark Opal Chestplate");
		LanguageRegistry.addName(dopalLegs, "Dark Opal Leggings");
		LanguageRegistry.addName(dopalBoots, "Dark Opal Boots");
		LanguageRegistry.addName(knife, "Opal Knife");
		LanguageRegistry.addName(outbackBlock2, "Outback Stone");
		LanguageRegistry.addName(pinkOre, "Pink Diamond Ore");
		LanguageRegistry.addName(pinkPickaxe, "Pink Diamond Pickaxe");
		LanguageRegistry.addName(pinkSword, "Pink Diamond Sword");
		LanguageRegistry.addName(pinkAxe, "Pink Diamond Axe");
		LanguageRegistry.addName(pinkShovel, "Pink Diamond Shovel");
		LanguageRegistry.addName(pinkHoe, "Pink Diamond Hoe");
		LanguageRegistry.addName(pinkDiamond, "Pink Diamond");
		LanguageRegistry.addName(enrichedCoal, "Enriched Coal Ore");
		LanguageRegistry.addName(Enrichedcoal, "Enriched Coal");
		LanguageRegistry.addName(infusedCoal, "Infused Coal");
		LanguageRegistry.addName(pinkdBow, "Pink Diamond Bow");
	}

}
