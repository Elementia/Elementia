package com.elementia.elementiajmt.reference;

import com.elementia.elementiajmt.proxy.ServerProxy;

/**
 * Created by AliquotMesozoic on 1/11/15 at 3:30 AM.
 */
public class Reference {
    // The unique ID for our mod
    public static final String MOD_ID = "elementiajmt";

    // The human-readable name for our mod
    public static final String MOD_NAME = "Elementia";

    public static final String MOD_VERSION = "@VERSION@";

    // The path to our proxies
    public static final String CLIENT_SIDE_PROXY = "com.elementia.elementiajmt.proxy.ClientProxy";
    public static final String SERVER_SIDE_PROXY = "com.elementia.elementiajmt.proxy.ServerProxy";

    public static final String GUI_FACTORY_CLASS = "com.elementia.elementiajmt.client.gui.ElementiaGuiFactory";
}
