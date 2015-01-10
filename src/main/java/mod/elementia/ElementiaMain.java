package mod.elementia;

import mod.elementia.util.CraftingManager;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ElementiaMain.MODID, version = ElementiaMain.VERSION)
public class ElementiaMain {
	public static final String MODID = "elementiajmt";
	public static final String VERSION = "0.1";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// TODO load config

		
		
		// TODO register items/blocks
		
		CraftingManager.register();
	}

}
