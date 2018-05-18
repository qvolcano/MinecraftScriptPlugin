package com.qvolcano.mcsp.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.qvolcano.mcsp.Script;
import com.qvolcano.utils.EventEnum;
import com.qvolcano.utils.EventHandler;

import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class EventManager {
	private HashMap<String, ArrayList<EventHandler>> handlerMap=new HashMap();
	private HashMap<String, Listener> listenerMap=new HashMap();
	private EventExecutor eventExecutor;
	private BukkitRunnable timerTickEvent;
	private JavaPlugin javaPlugin;
	
	public EventManager(JavaPlugin javaPlugin) {
		this.javaPlugin = javaPlugin;
		eventExecutor=new EventExecutor() {
			
			@Override
			public void execute(Listener arg0, Event event) throws EventException {
				EventManager.this.dispatchEvent(event);
			}
		};
	}
	
	public void registerEvent(String type,EventHandler handler) {
		if(EventEnum.EVENT_MAP.containsKey(type)) {
			if(handlerMap.containsKey(type)==false) {
				handlerMap.put(type, new ArrayList<EventHandler>());
			}
			if(listenerMap.containsKey(type)==false) {
				listenerMap.put(type, new Listener() {});
			}
			ArrayList<EventHandler> list=handlerMap.get(type);
			if(list.indexOf(handler)==-1) {
				list.add(handler);
				Class<Event> clszz=EventEnum.EVENT_MAP.get(type);
				Listener listener=listenerMap.get(type);
				javaPlugin.getServer().getPluginManager().registerEvent(clszz, listener, EventPriority.NORMAL, eventExecutor, javaPlugin);
			}
		}
	}
	
	public void unregisterEvent(String type,EventHandler handler) {
		if(handlerMap.containsKey(type)==true) {
			Listener listener=listenerMap.get(type);
			ArrayList<EventHandler> list=handlerMap.get(type);
			if(list.indexOf(handler)!=-1) {
				list.remove(handler);
			}
			if(list.isEmpty()) {
				handlerMap.remove(type);
				listenerMap.remove(type);
				HandlerList.unregisterAll(listener);
			}
		}
	}
	
	public void dispatchEvent(Event event) {
		String type=event.getEventName();
		if(handlerMap.containsKey(type)) {
			ArrayList<EventHandler> list=handlerMap.get(type);
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				EventHandler handler = (EventHandler) iterator.next();
				handler.execute(event);
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

