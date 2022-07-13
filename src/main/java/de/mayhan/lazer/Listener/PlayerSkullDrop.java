package de.mayhan.lazer.Listener;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerSkullDrop implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player player = e.getEntity();
        Location l = player.getLocation();

        //Skull Generator
        ItemStack itemStack = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta sm = (SkullMeta) itemStack.getItemMeta();
        sm.setOwningPlayer(player);
        itemStack.setItemMeta(sm);

        e.getDrops().add(itemStack);
    }
}
