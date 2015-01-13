package com.elementia.elementiajmt;


import com.elementia.elementiajmt.config.ConfigurationHandler;
import com.elementia.elementiajmt.proxy.IProxy;
import com.elementia.elementiajmt.registry.ElementiaRegister;
import com.elementia.elementiajmt.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static com.elementia.elementiajmt.reference.Reference.*;

/**
 * Created by AliquotMesozoic on 1/11/15 at 2:33 AM.
 */
@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, guiFactory = GUI_FACTORY_CLASS)
public class Elementia {

    @Mod.Instance(MOD_ID)
    public static Elementia instance;

    @SidedProxy(clientSide = CLIENT_SIDE_PROXY, serverSide = SERVER_SIDE_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        // Register our configuration handler to the FML event bus
        FMLCommonHandler.instance().bus().register(ConfigurationHandler.class);

        //TODO Load network handling

        ElementiaRegister.preInit(); // Registers items and blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        ElementiaRegister.init(); // Registers everything else
        //TODO Register GUI
        //TODO Register Tile Entities
        //TODO Register Crafting recipes
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //TODO Wrap-up
    }

}
