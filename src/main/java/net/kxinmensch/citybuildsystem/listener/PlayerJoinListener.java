package net.kxinmensch.citybuildsystem.listener;

import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("§a" + player.getName() + " ist dem Server beigreteten.");
        player.setGameMode(GameMode.SURVIVAL);

        //player.playSound(Sound.ENTITY_PLAYER_LEVELUP, 10f, 10f);
    }
}
