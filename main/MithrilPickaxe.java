package mods.blokker.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class MithrilPickaxe extends ItemPickaxe{

	public MithrilPickaxe(int i, EnumToolMaterial enumToolMaterial) {
		super(i, enumToolMaterial);

	}

	public void registerIcons(IconRegister iconRegister) {

	this.itemIcon = iconRegister.registerIcon("blokker:mithrilpickaxe"); }

	
}
