package de.mayhan.lazer;

import de.mayhan.lazer.Listener.JoinQuitMessages;
import de.mayhan.lazer.Listener.PlayerSkullDrop;
import de.mayhan.lazer.commands.AFKCommand;
import de.mayhan.lazer.commands.DeAFKCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");



        commands();
        events();
    }

    @Override
    public void onDisable() {
        getLogger().info("PLugin disabled!");
    }
    public void commands(){
        getCommand("afk").setExecutor(new AFKCommand());
        getCommand("deafk").setExecutor(new DeAFKCommand());
    }
    public void events(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerSkullDrop(), this);
        pm.registerEvents(new JoinQuitMessages(), this);

    }

}
