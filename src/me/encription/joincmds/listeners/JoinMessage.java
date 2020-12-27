package me.encription.joincmds.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.encription.joincmds.utils.Utils;
import me.encription.joincmds.JoinCMDS;

public class JoinMessage implements Listener {
	
	private final JoinCMDS plugin;
	
	public JoinListener(JoinCMDS plugin){
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent evnt) {
		Player plr = evnt.getPlayer();
		
		if (!plr.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstJoin_message").replace("<player>", plr.getDisplayName())));
			return;
		}
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player>", plr.getDisplayName())));
			
	}
	

}