package mod.elementia.items.tools;

import java.util.Set;

import mod.elementia.ElementiaMain;
import mod.elementia.items.ElementiaItem;
import mod.elementia.misc.CreativeTabElementia;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemInscriber extends ElementiaItem {	
	
	public static final String unlocalizedName = "item_inscriber";
	public static final String textureName = ElementiaMain.MODID + ":" + "item_inscriber";
	
	public static final Item inscriberInstance = new ItemInscriber()
		.setUnlocalizedName(unlocalizedName)
		.setCreativeTab(CreativeTabElementia.tabInstance)
		.setTextureName(textureName);
	
	
	@Override
	public int getItemStackLimit(ItemStack arg0) {
		return 1;
	}
}