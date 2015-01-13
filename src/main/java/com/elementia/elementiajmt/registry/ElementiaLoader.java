package com.elementia.elementiajmt.registry;

import com.elementia.elementiajmt.util.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Adds items, blocks, entities, and TileEntities to the GameRegistry
 * Created by AliquotMesozoic on 1/12/15 at 4:57 PM.
 */
public class ElementiaLoader {


    public static void add(IElementiaBlock blockInstance) {
        LogHelper.debug("Registering block: " + blockInstance.getRawName());

        GameRegistry.registerBlock(blockInstance.getInstance(), blockInstance.getRawName());
        addRecipes(blockInstance.getRecipeHandler(), blockInstance.getRawName());
    }

    public static void add(IElementiaEntity entityInstance) {
        LogHelper.debug("Registering entity: " + entityInstance.getRawName());

        //TODO register entities
    }

    public static void add(IElementiaItem itemInstance) {
        LogHelper.debug("Registering item: " + itemInstance.getRawName());

        GameRegistry.registerItem(itemInstance.getInstance(), itemInstance.getRawName());
        addRecipes(itemInstance.getRecipeHandler(), itemInstance.getRawName());
    }

    public static void add(IElementiaTileEntity tileEntityInstance) {
        LogHelper.debug("Registering tile entity: " + tileEntityInstance.getRawName());

        //TODO register TileEntities
    }

    public static void addRecipes(ElementiaRecipe recipes, String rawName) {
        LogHelper.debug("Registering recipes for " + rawName);

        for (ElementiaRecipe.Recipe recipe : recipes.getRecipes()) {
            GameRegistry.addRecipe(recipe.itemStack, recipe.recipe);
        }
    }

}
