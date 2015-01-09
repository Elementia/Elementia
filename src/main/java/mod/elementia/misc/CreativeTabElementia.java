package mod.elementia.misc;

import mod.elementia.items.tools.ItemInscriber;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabElementia extends CreativeTabs {

	public static CreativeTabElementia tabInstance = new CreativeTabElementia();
	
	public CreativeTabElementia() {
		super("tabElementia");
	}

	@Override
	public Item getTabIconItem() {
		return ItemInscriber.inscriberInstance;
	}

}
