package net.runelite.client.plugins.prayerid;

// Mandatory imports
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.plugins.Plugin;
import javax.inject.Inject;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
        name = "Config example",
        description = "A simple example plugin to illustrate how to write plugin config menus",
        tags = {"config", "menu"},
        loadWhenOutdated = true,
        enabledByDefault = false
)
public class ConfigExamplePlugin extends Plugin {

    @Inject
    private ConfigExampleConfig config;

    @Override
    protected void startUp()
    {
        // startUp
    }

    @Override
    protected void shutDown()
    {
        // shutDown
    }
}
