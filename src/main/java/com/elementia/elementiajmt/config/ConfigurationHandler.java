package com.elementia.elementiajmt.config;

import com.elementia.elementiajmt.reference.ErrorReference;
import com.elementia.elementiajmt.reference.Reference;
import com.elementia.elementiajmt.util.LogHelper;
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
        LogHelper.info("Loading config");
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }


        loadConfiguration();
    }

    public static void loadConfiguration() {
        // Load in our configuration

        // Temporary test for visual config
        boolean someValue = configuration.get(Configuration.CATEGORY_GENERAL, "someValue", true, "Just a test - remove later").getBoolean(true);

        if (configuration.hasChanged()) {
            LogHelper.info("Reloading configuration");
            configuration.save();
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
