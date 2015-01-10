package mod.elementia.util;

import mod.elementia.items.tools.ItemInscriber;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void register() {
		new ItemInscriber();
	}
}
