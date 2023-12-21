package org.folianochatreports.foliancp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FoliaNCR extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Stating Plugin!");
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onChatSend(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();
        Bukkit.broadcastMessage("<" + player.getName() + ">" + " " + message);
        event.setCancelled(true);
    }

}
