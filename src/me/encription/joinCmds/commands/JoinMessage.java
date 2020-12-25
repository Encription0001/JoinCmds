package me.encription.joinCmds.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.encription.joinCmds.Main;
import me.encription.joinCmds.utils.Utils;

public class JoinMessage implements Listener {
	
	private static Main plugin;
	
	public JoinListener(Main plugin){
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent evnt) {
		Player plr = evnt.getPlayer();
		
		if (!plr.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstJoin_message").replace("<player>", plr.getDisplayName())));
			
		} else {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player>", plr.getDisplayName())));
			
		}
	}
	
	

}
