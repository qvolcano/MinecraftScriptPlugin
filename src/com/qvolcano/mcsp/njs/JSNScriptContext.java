package com.qvolcano.mcsp.njs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.ScriptableObject;

import com.qvolcano.mcsp.ScriptPlugin;
import com.qvolcano.mcsp.ScriptPluginContext;
import com.qvolcano.mcsp.events.EventManager;

import sun.net.www.content.text.plain;

public class JSNScriptContext extends ScriptableObject {
	
	private static final long serialVersionUID = -3801158101603251426L;
	
	
	private BaseFunction js_eventHandler;
	
	private ScriptPluginContext context;
	
	
	private ArrayList<js_EventListener> listeners=new ArrayList<>();
	
	
	public JSNScriptContext() {
		
	}

	public String getClassName() {
		return "JSNScriptContext";
	}
	
	public void broadcastMessage(String msg) {
		context.plugin.getServer().broadcastMessage(msg);
	}
	
	public void  addEvent(String type,js_EventListener listener) {
		Class<Event> event=EventManager.EVENT_MAP.get(type);
		if(event!=null) {
			listeners.add(listener);
			context.plugin.getServer().getPluginManager().registerEvent(event, listener, EventPriority.NORMAL, listener, context.plugin);
		}else {
			
		}
	}
	
	public void delEvent(String type) {
		for(int i=listeners.size()-1;i>=0;i--) {
			js_EventListener listener=listeners.get(i);
			if(listener.type==type) {
				HandlerList.unregisterAll(listener);
				listeners.remove(i);
			}
		}
	}
	
	public void dipatchEvent(Event event) {
		
		
	}
	
	public void jsFunction_addEvent(String type,Object listener) {
		if(listener==null) {
			Class<Event> event=EventManager.EVENT_MAP.get(type);
			if(event!=null) {
				addEvent(type,new js_EventListener(type,listener,this));
			}
		}else {
			
		}
		
	}
	
	
	public void jsFunction_setEventHandler(Object listener) {
		this.js_eventHandler=(BaseFunction)listener;
	}
	
	
	public void jsFunction_log(Object obj) {
		System.out.println(obj);
	}

	public void init(ScriptPluginContext context) {
		this.context=context;
	}

	

	
}
class JavaEventListener  implements Listener,EventExecutor{

	@Override
	public void execute(Listener arg0, Event arg1) throws EventException {
		// TODO Auto-generated method stub
		
	}
	
	
}

class js_EventListener implements Listener,EventExecutor{

	public String type;
	private Object js_callback;
	private JSNScriptContext context;

	public js_EventListener(String type,Object js_callback,JSNScriptContext context) {
		this.type = type;
		this.js_callback=js_callback;
		this.context = context;
	}
	
	@Override
	public void execute(Listener arg0, Event arg1) throws EventException {
		this.context.dipatchEvent(arg1);
	}
	
}