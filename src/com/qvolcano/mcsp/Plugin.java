package com.qvolcano.mcsp;


import javax.swing.text.View;

import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Plugin implements Listener {
	public boolean enabled;
	
	public PluginContext context;
	
	
	public void enable() {
		if(enabled==false) {
			enabled=true;
			context.plugin.getServer().getPluginManager().registerEvents(this, context.plugin);
			onEnable();
		}
	}
	
	public void disable() {
		if(enabled==true) {
			enabled=true;
			HandlerList.unregisterAll(this);
			onDisable();
		}
	}
	
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) {
		
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		
	}
	
}
