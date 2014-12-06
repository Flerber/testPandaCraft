package com.Flerbergerber.PandaCraft.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class configHandler
{
    public static void init(File configFile)
    {
        // Create the config object
        Configuration config = new Configuration(configFile);

        try
        {
            // Loads the config
            config.load();

            // Reads in properties from config
            boolean configValue = config.get("General", "configValue", true, "I am example!").getBoolean(true);
        }
        catch (Exception e)
        {
            // Logs any exceptions (Please no exceptions? :D)
        }
        finally
        {
            //Saves the config
            config.save();
        }
    }
}
