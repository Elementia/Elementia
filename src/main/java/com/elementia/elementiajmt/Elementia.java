package com.elementia.elementiajmt;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by AliquotMesozoic on 1/11/15 at 2:33 AM.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Elementia {

    @Mod.Instance(Reference.MOD_ID)
    public static Elementia instance;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //TODO Load network handling
        //TODO Load config
        //TODO Load items
        //TODO Load blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //TODO Register GUI
        //TODO Register Tile Entities
        //TODO Register Crafting recipes
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //TODO Wrap-up
    }

}
