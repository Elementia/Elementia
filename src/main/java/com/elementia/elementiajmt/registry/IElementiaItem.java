package com.elementia.elementiajmt.registry;

import net.minecraft.item.Item;

/**
 * Provides the interface for generic Elementia items so we can load them in the ElementialLoader class
 * Created by AliquotMesozoic on 1/12/15 at 4:59 PM.
 */
public interface IElementiaItem extends IRegisterGeneric<Item>, IRegisterWithRecipe, IRegisterTextured {

}
