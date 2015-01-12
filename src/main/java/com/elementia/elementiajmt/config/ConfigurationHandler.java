package com.elementia.elementiajmt.config;

import com.elementia.elementiajmt.reference.ErrorReference;
import com.elementia.elementiajmt.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by AliquotMesozoic on 1/11/15 at 4:12 AM.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile) {
        if (configuration == null) {
            Configuration configuration = new Configuration(configFile);
        }


        loadConfiguration();
    }

    public static void loadConfiguration() {
        try {
            configuration.load();
        } catch(Exception e) {
            System.err.println(ErrorReference.CONFIGURATION_LOAD_ERR);
            e.printStackTrace();
        } finally {
            if (configuration.hasChanged()) {
                configuration.save();
            }
        }
    }


    @SubscribeEvent
    public void onChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equals(Reference.MOD_ID)) {
            // Reload configs
            loadConfiguration();
        }
    }
}
