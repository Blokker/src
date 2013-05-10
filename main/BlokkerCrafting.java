package mods.blokker.main;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

	public class BlokkerCrafting
	{
		public static void addRecipes()
		{
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerRockBlocks, 4, 0), new Object[]{
                "CC", "CC",             
                'C', Block.cobblestone });
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerRockBlocks, 4, 1), new Object[]{
                "DD", "DD",             
                'D', Block.dirt });
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerRockBlocks, 3, 3), new Object[]{
                "FF", "FF",             
                'F', new ItemStack(Blokker.BlokkerRockBlocks, 1, 2)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerRockBlocks, 2, 4), new Object[]{
                "SD",              
                'S', Block.stoneBrick, 'D', new ItemStack(Item.dyePowder, 1, 4)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerRockBlocks, 2, 5), new Object[]{
                "SD",              
                'S', Block.stoneBrick, 'D', new ItemStack(Item.dyePowder, 1, 1)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerRockBlocks, 2, 6), new Object[]{
                "SD",              
                'S', Block.stoneBrick, 'D', new ItemStack(Item.dyePowder, 1, 9)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.Reet, 3), new Object[]{ 
				"ff", "ff", 
				'f', Item.wheat, });                  
            
			GameRegistry.addRecipe(new ItemStack(Blokker.Ornament, 1), new Object[]{ 
				"jjj", "jkj", "jjj", 
				'j', Item.ingotGold, 'k', Block.blockGold,});                    
            
			GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy, 1), new Object[]{
				"ly", 
				'l', Block.cobblestone,'y', Block.vine,});
           
			GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 1, 1), new Object[]{
				"ly", 
				'l', Block.stoneBrick,'y', Block.vine,});
            
			GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 1, 2), new Object[]{
				"la", 
				'l', Block.stoneBrick,'a', Block.cobblestone,});
            
			GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 1, 3), new Object[]{
				"lr", 
				'l', Block.stoneBrick,'r', Block.stone,});
            
			
			GameRegistry.addRecipe(new ItemStack(Blokker.CorrugatedSheetdark, 9), new Object[]{
				"qqq", "qeq", "qqq", 
				'q', Item.ingotIron, Character.valueOf('e'), new ItemStack(Item.dyePowder, 1, 8)});
            
			GameRegistry.addRecipe(new ItemStack(Blokker.CorrugatedSheetlight, 9), new Object[]{
				"qqq", "qeq", "qqq", 
				'q', Item.ingotIron, Character.valueOf('e'), new ItemStack(Item.dyePowder, 1, 7)});
            
			
			
			
			
			
			
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 0), new Object[]{
                "GH",              
                'G', Block.glass, 'H', Block.brick});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 1), new Object[]{
                "GH",              
                'G', Block.glass, 'H', Block.stone});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 2), new Object[]{
                "GH",              
                'G', Block.glass, 'H', Block.cobblestone});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 3), new Object[]{
                "GH",              
                'G', Block.glass, 'H', Block.dirt});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 4), new Object[]{
                "GH",              
                'G', Block.glass, 'H', Block.sandStone});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 5), new Object[]{
                "GH",              
                'G', Block.glass, 'H', new ItemStack(Block.stoneBrick, 1, 0)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 6), new Object[]{
                "GH",              
                'G', Block.glass, 'H', new ItemStack(Block.stoneBrick, 1, 1)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 7), new Object[]{
                "GH",              
                'G', Block.glass, 'H', Block.cobblestoneMossy});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 8), new Object[]{
                "GH",              
                'G', Block.glass, 'H', Block.blockNetherQuartz});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 9), new Object[]{
                "GH",              
                'G', Block.glass, 'H', new ItemStack(Block.planks, 1, 0)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 11), new Object[]{
                "GH",              
                'G', Block.glass, 'H', new ItemStack(Block.planks, 1, 1)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 10), new Object[]{
                "GH",              
                'G', Block.glass, 'H', new ItemStack(Block.planks, 1, 2)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerGhostBlocks, 2, 12), new Object[]{
                "GH",              
                'G', Block.glass, 'H', new ItemStack(Block.planks, 1, 3)});
			
			
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerFrameWorkBlocks, 4, 0), new Object[]{
                "XZX", "ZXZ", "XZX",                
                'X', Item.stick, 'Z', new ItemStack(Blokker.BlokkerRockBlocks, 1, 3)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerFrameWorkBlocks, 4, 1), new Object[]{
                "XZZ", "ZXZ", "ZZX",                
                'X', Item.stick, 'Z', new ItemStack(Blokker.BlokkerRockBlocks, 1, 3)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerFrameWorkBlocks, 4, 2), new Object[]{
                "ZZX", "ZXZ", "XZZ",                
                'X', Item.stick, 'Z', new ItemStack(Blokker.BlokkerRockBlocks, 1, 3)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerFrameWorkBlocks, 4, 3), new Object[]{
                "ZXZ", "XXX", "ZXZ",                
                'X', Item.stick, 'Z', new ItemStack(Blokker.BlokkerRockBlocks, 1, 3)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerFrameWorkBlocks, 4, 4), new Object[]{
                "ZZZ", "XXX", "ZZZ",                
                'X', Item.stick, 'Z', new ItemStack(Blokker.BlokkerRockBlocks, 1, 3)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerFrameWorkBlocks, 4, 5), new Object[]{
                "ZXZ", "ZXZ", "ZXZ",                
                'X', Item.stick, 'Z', new ItemStack(Blokker.BlokkerRockBlocks, 1, 3)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerFrameWorkBlocks, 4, 6), new Object[]{
                "XXX", "XZX", "XXX",                
                'X', Item.stick, 'Z', new ItemStack(Blokker.BlokkerRockBlocks, 1, 3)});
			
			
			GameRegistry.addRecipe(new ItemStack(Item.ingotIron, 1), new Object[]{"xxx", "xxx", 'x', Blokker.Steelberries});
            
			GameRegistry.addRecipe(new ItemStack(Blokker.BlokkerCoal, 1), new Object[]{"xxx", "xxx", "xxx", 'x', Blokker.CoalBrick});
            
			GameRegistry.addRecipe(new ItemStack(Blokker.Battleaxe, 1), new Object[]{"nn.", "njm", ".j.", 'n', Blokker.ingotMithril, 'j', Item.ingotIron, 'm', Blokker.Mithrilflake});
            
			GameRegistry.addRecipe(new ItemStack(Blokker.CoalBrick, 4), new Object[]{"kkk", "bkb", "bbb", 'b', Block.planks, 'k', new ItemStack(Item.coal, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Blokker.CoalBrick, 4), new Object[]{"kkk", "bkb", "bbb", 'b', Block.planks, 'k', new ItemStack(Item.coal, 1, 1)});
			
			GameRegistry.addRecipe(new ItemStack(Blokker.MithrilPickaxe, 1), new Object[]{"nnn", ".j.", ".j.", 'n', Blokker.ingotMithril, 'j', Item.ingotIron});
            
			GameRegistry.addRecipe(new ItemStack(Blokker.Mithrilshovel, 1), new Object[]{".n.", ".j.", ".j.", 'n', Blokker.ingotMithril, 'j', Item.ingotIron});
            
			GameRegistry.addRecipe(new ItemStack(Block.commandBlock, 2), new Object[]{"tzt", 't', Item.emerald, 'z', Block.blockGold});    
            
			GameRegistry.addRecipe(new ItemStack(Blokker.Diamondform, 1), new Object[]{"ttt", "tkt", "ttt", 't', Block.blockIron, 'k', Blokker.BlokkerCoal});       
            
			GameRegistry.addRecipe(new ItemStack(Item.beefRaw, 1), new Object[]{"kb", 'b', Item.sugar, 'k', Item.rottenFlesh});
            
			GameRegistry.addRecipe(new ItemStack(Blokker.Mithrilvermit, 1), new Object[]{"mn.", 'n', Item.ingotIron, 'm', Blokker.Mithrilflake});
            
			
			
			
			
            
			
			
			
		}
}