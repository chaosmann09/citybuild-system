package net.kxinmensch.citybuildsystem.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Day implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player = (Player) sender;

        if(sender instanceof Player) {
            if(player.hasPermission("citybuildsystem.day")) {
                World world = player.getWorld();
                world.setTime(12000);
                player.sendMessage("§aDu hast die Welt zu Tag geändert!");
            }else {
                player.sendMessage("§cDu hast keine Berechtigung dazu!");
            }
        } else {
            sender.sendMessage("§cDu bist kein Spieler!");
        }

        return false;
    }
}
