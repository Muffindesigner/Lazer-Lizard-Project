package de.mayhan.lazer.Listener;

import de.mayhan.lazer.utils.LocationCalc;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEventListener implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent e) {

        if (LocationCalc.didPlayerMove(e.getFrom(), e.getTo())){
            Player player = e.getPlayer();

            player.setPlayerListName(player.getName());
            player.setDisplayName(player.getName());

            player.sendMessage(ChatColor.GREEN + "Afk Status aufgehoben!");
        }
    }
}
