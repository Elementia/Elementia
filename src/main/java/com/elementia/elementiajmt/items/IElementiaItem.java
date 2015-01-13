package com.elementia.elementiajmt.items;

import com.elementia.elementiajmt.util.RecipesHelper;

/**
 * Provides the interface for generic Elementia items so we can load them in the ItemLoader class
 * Created by AliquotMesozoic on 1/12/15 at 4:59 PM.
 */
public interface IElementiaItem {

    public String getRawName();
    public RecipesHelper getRecipes();

}
