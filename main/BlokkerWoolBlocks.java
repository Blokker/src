package mods.blokker.main;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class BlokkerWoolBlocks extends BlockGeneralBlokker
	{
		public BlokkerWoolBlocks(int id, Material par2Material)
		{
			super(id, par2Material);
			
		}

		@SideOnly(Side.CLIENT)
		private Icon[] icons;

		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister par1IconRegister)
	    {
	             icons = new Icon[16];
	            
	             for(int i = 0; i < icons.length; i++)
	             {
	                    icons[i] = par1IconRegister.registerIcon(Blokker.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
	             }
	    }
	      
	       @SideOnly(Side.CLIENT)
	       public Icon getIcon(int par1, int par2)
	       {
	             return icons[par2];
	       }
	      
	       @SideOnly(Side.CLIENT)
	    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	    {
	        for (int var4 = 0; var4 < 16; ++var4)
	        {
	            par3List.add(new ItemStack(par1, 1, var4));
	        }
	    }
	       
	       
		    /**
		     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
		     */
		    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
		    {
		        Block.blocksList[this.blockID].getSubBlocks(par1, par2CreativeTabs, par3List);
		    }

		    
		    /**
		     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
		     */
		    public int idPicked(World par1World, int par2, int par3, int par4)
		    {
		        return this.blockID;
		    }
	}