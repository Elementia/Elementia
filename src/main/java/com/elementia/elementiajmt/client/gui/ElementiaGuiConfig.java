package com.elementia.elementiajmt.client.gui;

import com.elementia.elementiajmt.config.ConfigurationHandler;
import com.elementia.elementiajmt.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by AliquotMesozoic on 1/12/15 at 2:43 PM.
 */
public class ElementiaGuiConfig extends GuiConfig {
    public ElementiaGuiConfig(GuiScreen guiScreen) {
        super(
                guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString())
        );
    }
}
