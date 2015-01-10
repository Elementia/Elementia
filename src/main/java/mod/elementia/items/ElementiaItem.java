package mod.elementia.items;

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.elementia.ElementiaMain;
import mod.elementia.misc.CreativeTabElementia;
import mod.elementia.util.Recipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ElementiaItem extends Item {

	public static HashMap<Class<? extends ElementiaItem>, Item> instances = new HashMap<Class<? extends ElementiaItem>, Item>();
	
	public ElementiaItem() {
		if (!instances.containsKey(this.getClass())) {
			this.setUnlocalizedName(this.getGeneratedName());
			
			this.setTextureName(ElementiaMain.MODID + ":" + this.getGeneratedName());
			this.setCreativeTab(CreativeTabElementia.tabInstance);
			
			instances.put(this.getClass(), this);
			
			GameRegistry.registerItem(this, this.getUnlocalizedName());
			if (this.getRecipe() != null) {
				GameRegistry.addRecipe(this.getRecipe().stack, this.getRecipe().recipe);
			}
		}
	}
	
	public static Item getInstance(Class<? extends ElementiaItem> clazz) {
		if (instances.containsKey(clazz)) {
			return instances.get(clazz);
		}
		return null;
	}

	public abstract String getRawUnlocalizedName();

	public abstract Recipe getRecipe();

	public String getGeneratedName() {
		return this.getRawUnlocalizedName();
	}
}