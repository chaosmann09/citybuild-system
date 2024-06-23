package net.kxinmensch.citybuildsystem.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Night implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player = (Player) sender;
        if(sender instanceof Player) {
            if(player.hasPermission("citybuildsystem.day")) {
                World world = player.getWorld();
                world.setTime(0);
                player.sendMessage("§aDu hast die Welt zu Night geändert!");
            }else {
                player.sendMessage("§cDu hast keine Berechtigung dazu!");
            }
        }

        return false;
    }
}
