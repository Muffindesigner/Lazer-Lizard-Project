package de.mayhan.lazer.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AFKCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.setPlayerListName(ChatColor.LIGHT_PURPLE + player.getName() + " [AFK]");
            player.setDisplayName(ChatColor.LIGHT_PURPLE + player.getName() + " [AFK]");
        } else {
            sender.sendMessage(ChatColor.RED + "You must be a Player to use this Command!");
        }
        return true;
    }
}
