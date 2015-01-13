package com.elementia.elementiajmt.items;

import cpw.mods.fml.common.registry.GameRegistry;

import java.util.ArrayList;

/**
 * Adds items to the GameRegistry
 * Created by AliquotMesozoic on 1/12/15 at 4:57 PM.
 */
public class ItemLoader {

    private ArrayList<IElementiaItem> items = new ArrayList<IElementiaItem>();

    public void init() {

    }

    public void addItem(IElementiaItem itemInstance) {
        this.items.add(itemInstance);
    }

}
