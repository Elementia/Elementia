package com.elementia.elementiajmt.registry;

import java.util.ArrayList;

/**
 * Created by AliquotMesozoic on 1/12/15 at 5:11 PM.
 */
public class ElementialRecipe {

    private ArrayList<Object[]> recipes = new ArrayList<Object[]>();

    public void addRecipe(Object[] recipe) {
        this.recipes.add(recipe);
    }

    public ArrayList<Object[]> getRecipes() {
        return this.recipes;
    }
}
