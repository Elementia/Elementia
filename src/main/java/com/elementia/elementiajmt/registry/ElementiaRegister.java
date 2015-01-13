package com.elementia.elementiajmt.registry;

import com.elementia.elementiajmt.items.armor.DoubleJumpBoots;

/**
 * The class where we actually register items and such
 * Created by AliquotMesozoic on 1/13/15 at 1:09 AM.
 */
public class ElementiaRegister {
    /**
     * Register items and blocks
     */
    public static void preInit() {
        ElementiaLoader.add(DoubleJumpBoots.instance);
    }

    /**
     * Register everything else
     */
    public static void init() {

    }
}
