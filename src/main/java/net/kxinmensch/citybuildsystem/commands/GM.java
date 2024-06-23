package net.kxinmensch.citybuildsystem.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GM implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            sender.sendMessage("§CDu bist kein Spieler");
            return true;
        }

        if(player.hasPermission("citybuild.gm")) {
            switch(args[0].toLowerCase()) {
                case "survival":
                case "0":
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage("§7Du wurdest in den §aSurvival-Modus §7gesetzt!");
                    break;
                case "creative":
                case "1":
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage("§7Du wurdest in den §aSurvival-Modus §7gesetzt!");
                    break;
                case "adventure":
                case "2":
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage("§7Du wurdest in den §aAdventure-Modus §7gesetzt!");
                    break;
                case "spec":
                case "3":
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage("§7Du wurdest in den §aSpectator-Modus §7gesetzt!");
                    break;
                default:
                    player.sendMessage("§aGebe /gm 0 | 1 | 2 | 3 ein um den Gamemode zu switchen-");
                    return true;
            }
        }else {
            player.sendMessage("§cDu hast keine Berechtigung dazu!");
        }

        return false;
    }
}
