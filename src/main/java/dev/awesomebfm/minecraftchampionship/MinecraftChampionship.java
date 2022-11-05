package dev.awesomebfm.minecraftchampionship;

import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftChampionship extends JavaPlugin {

    private static MinecraftChampionship instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MinecraftChampionship getInstance() {
        return instance;
    }
}
