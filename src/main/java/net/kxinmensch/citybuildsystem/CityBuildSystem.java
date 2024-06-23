package net.kxinmensch.citybuildsystem;

import net.kxinmensch.citybuildsystem.commands.DayCMD;
import net.kxinmensch.citybuildsystem.commands.GMCommand;
import net.kxinmensch.citybuildsystem.commands.NightCMD;
import net.kxinmensch.citybuildsystem.manager.ConfigManager;
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
        getCommand("gm").setExecutor(new GMCommand());
        getCommand("night").setExecutor(new NightCMD());
        getCommand("day").setExecutor(new DayCMD());
        getCommand("fly").setExecutor(new DayCMD());
    }

    public static CityBuildSystem getInstance() {
        return instance;
    }
}

