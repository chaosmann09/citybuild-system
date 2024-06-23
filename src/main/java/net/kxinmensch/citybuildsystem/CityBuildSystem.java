package net.kxinmensch.citybuildsystem;

import net.kxinmensch.citybuildsystem.commands.Day;
import net.kxinmensch.citybuildsystem.commands.GM;
import net.kxinmensch.citybuildsystem.commands.Night;
import org.bukkit.plugin.java.JavaPlugin;

public final class CityBuildSystem extends JavaPlugin {

    private static CityBuildSystem instance;

    @Override
    public void onEnable() {
        instance = this;

        registerCommand();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public void registerCommand() {
        getCommand("gm").setExecutor(new GM());
        getCommand("night").setExecutor(new Night());
        getCommand("day").setExecutor(new Day());
        getCommand("fly").setExecutor(new Day());
    }

    public static CityBuildSystem getInstance() {
        return instance;
    }
}

