package com.qvolcano.mcsp.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TimeTypeEvent extends Event {
	
	private static final HandlerList handlers = new HandlerList();
	public Integer type;
	public String worldID;
	
	public TimeTypeEvent(Integer type,String worldID) {
		this.type = type;
		this.worldID = worldID;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

}
