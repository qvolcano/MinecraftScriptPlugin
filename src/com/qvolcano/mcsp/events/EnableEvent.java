package com.qvolcano.mcsp.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EnableEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
}