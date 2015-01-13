package com.elementia.elementiajmt.registry;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;

/**
 * Created by AliquotMesozoic on 1/12/15 at 5:11 PM.
 */
public class ElementiaRecipe {

    private ArrayList<Recipe> recipes = new ArrayList<Recipe>();

    public void addRecipe(ItemStack itemStack, Object[] recipe) {
        this.recipes.add(new Recipe(recipe, itemStack));
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    protected class Recipe {
        public Object[] recipe;
        public ItemStack itemStack;

        public Recipe(Object[] recipe, ItemStack itemStack) {
            this.recipe = recipe;
            this.itemStack = itemStack;
        }
    }
}
