package mod.elementia.items.tools;

import java.util.Set;

import mod.elementia.ElementiaMain;
import mod.elementia.items.ElementiaItem;
import mod.elementia.misc.CreativeTabElementia;
import mod.elementia.util.Recipe;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemInscriber extends ElementiaItem {	

	@Override
	public String getRawUnlocalizedName() {
		return "inscriber";
	}
	
	@Override
	public int getItemStackLimit(ItemStack arg0) {
		return 1;
	}

	@Override
	public Recipe getRecipe() {
		return new Recipe(new ItemStack(this, 1), new Object[] {
			" I ",
			" S ",
			" S ",
			'I', Blocks.iron_block,
			'S', Items.stick
		});
	}
}