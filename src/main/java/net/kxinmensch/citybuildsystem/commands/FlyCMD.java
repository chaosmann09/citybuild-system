package net.kxinmensch.citybuildsystem.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class FlyCMD implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("citybuildsystem.fly")) {
                if(player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    player.sendMessage("§7Flugmodus §8» §cDeaktiviert");
                }else {
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    player.sendMessage("§7Flugmodus §8» §aAktiviert");
                }
            }else {
                player.sendMessage("§cDazu hast du keine Berechtigung!");
            }
        }
        return false;
    }
}
