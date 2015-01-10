package mod.elementia.util;

import mod.elementia.items.*;
import mod.elementia.items.tools.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void register() {
		new ItemInscriber();
		new ItemStoneRune();
	}
}
