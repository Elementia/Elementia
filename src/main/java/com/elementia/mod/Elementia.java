package com.elementia.mod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Elementia.MOD_ID, name = Elementia.MOD_NAME, version = Elementia.MOD_VERSION)
public class Elementia {

    public static final String MOD_ID = "ELementiaMod";
    public static final String MOD_NAME = "Elementia";
    public static final String MOD_VERSION = "1.7.10-1.0";


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
