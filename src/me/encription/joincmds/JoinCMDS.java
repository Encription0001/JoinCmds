package me.encription.joincmds;

import org.bukkit.plugin.java.JavaPlugin;

public class JoinCMDS extends JavaPlugin {
	@Override
	public void onEnable(){
		saveDefaultConfig();
		
		new JoinMessage(this);
		
	}
	
	

}
