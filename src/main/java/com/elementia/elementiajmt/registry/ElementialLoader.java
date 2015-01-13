package com.elementia.elementiajmt.registry;

import com.elementia.elementiajmt.util.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Adds items, blocks, entities, and TileEntities to the GameRegistry
 * Created by AliquotMesozoic on 1/12/15 at 4:57 PM.
 */
public class ElementialLoader {

    public static void add(IElementialBlock blockInstance) {
        LogHelper.debug("Registering block: " + blockInstance.getRawName());

        GameRegistry.registerBlock(blockInstance.getInstance(), blockInstance.getRawName());
        addRecipes(blockInstance.getRecipeHandler(), blockInstance.getRawName());
    }

    public static void add(IElementialEntity entityInstance) {
        LogHelper.debug("Registering entity: " + entityInstance.getRawName());

        //TODO register entities
    }

    public static void add(IElementialItem itemInstance) {
        LogHelper.debug("Registering item: " + itemInstance.getRawName());

        GameRegistry.registerItem(itemInstance.getInstance(), itemInstance.getRawName());
        addRecipes(itemInstance.getRecipeHandler(), itemInstance.getRawName());
    }

    public static void add(IElementialTileEntity tileEntityInstance) {
        LogHelper.debug("Registering tile entity: " + tileEntityInstance.getRawName());

        //TODO register TileEntities
    }

    public static void addRecipes(ElementialRecipe recipes, String rawName) {
        LogHelper.debug("Registering recipes for " + rawName);

        for (ElementialRecipe.Recipe recipe : recipes.getRecipes()) {
            GameRegistry.addRecipe(recipe.itemStack, recipe.recipe);
        }
    }

}
