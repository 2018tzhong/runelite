package net.runelite.client.plugins.prayerid;

// Mandatory imports
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("prayerid")
public interface ConfigExampleConfig extends Config
{
    // Configuration menu items go here

    @ConfigItem(
            position = 1,
            keyName = "booleanConfig",
            name = "Boolean checkbox",
            description = "Simple example of a checkbox to store a booleans value"
    )
    default boolean booleanConfig() {return false;}

    @ConfigItem(
            position = 2,
            keyName = "intConfig",
            name = "Int Spinner",
            description = "Simple example of a spinner to store integers"
    )
    default int intConfig() { return 1; }

    @ConfigItem(
            position = 3,
            keyName = "stringConfig",
            name = "String Textbox",
            description = "Simple example of a tesxtbox to store strings"
    )
    default String stringConfig() {
        return "string";
    }

    @ConfigItem(
            position = 4,
            keyName = "colorConfig",
            name = "Color Selector",
            description = "Simple example of a color selector"
    )
    default Color colorConfig() {return Color.BLACK;}
}