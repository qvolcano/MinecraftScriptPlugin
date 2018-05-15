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

public class ScriptPlugin implements Listener {
	public boolean enabled;
	

	public JavaPlugin javaPlugin;
	
	public ScriptPlugin(JavaPlugin javaPlugin) {
		this.javaPlugin = javaPlugin;
	}
	
	public void enable() {
		if(enabled==false) {
			enabled=true;
//			context.plugin.getServer().getPluginManager().registerEvents(this, context.plugin);
			onEnable();
		}
	}
	
	public void disable() {
		if(enabled==true) {
			enabled=true;
//			HandlerList.unregisterAll(this);
			onDisable();
		}
	}
	
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}

	public void load(String source) {
		// TODO Auto-generated method stub
		
	}

	public void onEvent(Event event) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
