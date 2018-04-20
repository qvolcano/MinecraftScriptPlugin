package com.qvolcano.mcsp;


import javax.swing.text.View;

import org.bukkit.conversations.PlayerNamePrompt;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class ScriptPlugin implements Listener {
	public boolean enabled;
	
	public ScriptPluginContext context;
	
	
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
	
	/***********************************server******************************/
	@EventHandler
	public void onServerCommand(ServerCommandEvent event) {
		
	}
	
	/***********************************player******************************/
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		
	}
	
	/*
	 * 玩家躺在床上时触发此事件.
	 */
	@EventHandler
	public void onPlayerBedEnter(PlayerBedEnterEvent event){
		
		
	}
	
	/*
	 * 玩家离开床时触发此事件.
	 */
	@EventHandler
	public void onPlayerBedLeave(PlayerBedLeaveEvent event){
		
		
	}
	
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) {
		
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		
	}
	
}
