package mod.elementia.util;

import net.minecraft.item.ItemStack;

public class Recipe {
	public Object[] recipe;
	public ItemStack stack;
	
	public Recipe(ItemStack stack, Object[] recipe) {
		this.recipe = recipe;
		this.stack = stack;
	}
}