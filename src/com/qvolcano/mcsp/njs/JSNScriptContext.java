package com.qvolcano.mcsp.njs;

import java.util.HashMap;

import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.mozilla.javascript.ScriptableObject;

import com.qvolcano.mcsp.ScriptPlugin;
import com.qvolcano.mcsp.events.EventManager;

public class JSNScriptContext extends ScriptableObject implements Listener,EventExecutor {
	
	private static final long serialVersionUID = -3801158101603251426L;
	private ScriptContext context;
	
	private HashMap<String, Object> listenerMap=new HashMap<>();
	
	
	public JSNScriptContext(ScriptContext context) {
		this.context=context;
	}

	public String getClassName() {
		return "JSNScriptContext";
	}
	
	public void jsFunction_addEvent(String type,Object listener) {
		Class<Event> event=EventManager.EVENT_MAP.get(type);
		if(event!=null) {
			listenerMap.put(type, listener);
			context.plugin.getServer().getPluginManager().registerEvent(event, this, EventPriority.NORMAL, this, context.plugin);
		}
	}
	
	public void jsFunction_log(Object obj) {
		System.out.println(obj);
	}

	@Override
	public void execute(Listener arg0, Event arg1) throws EventException {
		// TODO Auto-generated method stub
		
	}
}
