package com.qvolcano.mcsp;


import javax.swing.text.View;

import org.bukkit.conversations.PlayerNamePrompt;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Script implements Listener,com.qvolcano.utils.EventHandler {
	public boolean enabled;
	

	public JavaPlugin javaPlugin;
	
	public Script(JavaPlugin javaPlugin) {
		this.javaPlugin = javaPlugin;
	}
	
	public void enable() throws Exception {
		if(enabled==false) {
			enabled=true;
//			context.plugin.getServer().getPluginManager().registerEvents(this, context.plugin);
			onEnable();
		}
	}
	
	public void disable() {
		if(enabled==true) {
			enabled=false;
//			HandlerList.unregisterAll(this);
			onDisable();
		}
	}
	
	
	public void onEnable() throws Exception {
		
	}
	
	public void onDisable() {
		
	}
	
	public void execute(Event event) {
		
	}


	
	
}
