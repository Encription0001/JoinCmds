package me.encription.joinCmds;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable(){
		saveDefaultConfig();
		
		new JoinMessage(this);
		
	}
	
	

}
