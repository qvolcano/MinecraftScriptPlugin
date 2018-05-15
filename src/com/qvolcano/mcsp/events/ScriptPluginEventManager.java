package com.qvolcano.mcsp.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.qvolcano.mcsp.ScriptPlugin;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class ScriptPluginEventManager {
	private HashMap<String, ArrayList<ScriptPlugin>> scriptPluginMap=new HashMap();
	private BukkitRunnable timerTickEvent;
	private JavaPlugin javaPlugin;
	
	public ScriptPluginEventManager(JavaPlugin javaPlugin) {
		this.javaPlugin = javaPlugin;
		
	}
	
	public void registerEvent(String type,ScriptPlugin scriptPlugin) {
		if(scriptPluginMap.containsKey(type)) {
			ArrayList<ScriptPlugin> list=scriptPluginMap.get(type);
			if(list.indexOf(scriptPlugin)==-1) {
				list.add(scriptPlugin);
			}
		}
	}
	
	public void dispatchEvent(Event event) {
		String type=event.getEventName();
		if(scriptPluginMap.containsKey(type)) {
			ArrayList<ScriptPlugin> list=scriptPluginMap.get(type);
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				ScriptPlugin scriptPlugin = (ScriptPlugin) iterator.next();
				scriptPlugin.onEvent(event);
			}
		}
	}
	
	public void startTick() {
		timerTickEvent=new BukkitRunnable() {
			@Override
			public void run() {
				dispatchEvent(new TickEvent());
			}
		};
		timerTickEvent.runTaskLater(javaPlugin, 1000);
	}
}

