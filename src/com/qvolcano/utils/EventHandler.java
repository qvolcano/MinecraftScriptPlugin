package com.qvolcano.utils;

import java.util.logging.Level;

import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.mozilla.javascript.BaseFunction;

import com.qvolcano.mcsp.Facade;
import com.qvolcano.mcsp.js.JSScriptContext;

public class EventHandler implements Listener,EventExecutor{

	public String type;
	public BaseFunction js_callback;
	public JSScriptContext context;

	public EventHandler(String type,BaseFunction js_callback,JSScriptContext context) {
		this.type = type;
		this.js_callback=js_callback;
		this.context = context;
	}
	
	@Override
	public void execute(Listener arg0, Event arg1) throws EventException {
		try {
//			js_callback.call(this.context.scriptContext, this.context.scriptObject, null, null);
		} catch (Exception e) {
			Facade.logger.log(Level.ALL, e.getMessage());
		}finally {
			
		}
	}
	
}