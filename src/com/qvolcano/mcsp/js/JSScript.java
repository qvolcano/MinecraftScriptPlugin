package com.qvolcano.mcsp.js;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.qvolcano.mcsp.Facade;
import com.qvolcano.mcsp.Script;
import com.qvolcano.mcsp.events.EnableEvent;
import com.qvolcano.utils.EventHandler;

import sun.reflect.generics.tree.ReturnType;

/**
 * 采用java api 的 js脚本
 * @author qvolcano
 *
 */
public class JSScript extends Script {
	
	
	Context javascriptContext;
	Scriptable javascriptScope;
	JSScriptContext jsScriptContext;
	String source;
	HashMap<String, EventHandler> eventHanlderMap=new HashMap<>();
	
	
	public JSScript(String source,JavaPlugin javaPlugin) {
		super(javaPlugin);
		this.source = source;
	}
	
	
	@Override
	public void onEnable() throws Exception {
		javascriptContext = Context.enter(); 
		javascriptScope=javascriptContext.initStandardObjects(null);
		ScriptableObject.defineClass(javascriptScope, JSScriptContext.class);
		
		jsScriptContext=(JSScriptContext) javascriptContext.newObject(javascriptScope, "JSScriptContext");
		jsScriptContext.init(this);
		javascriptScope.put("context", javascriptScope, jsScriptContext);
		javascriptContext.evaluateString(javascriptScope, source, null, 0, null);
		this.execute(new EnableEvent());
	}
	
	@Override
	public void onDisable() {
		javascriptContext.exit();
		for (String type : eventHanlderMap.keySet()) {
			Facade.eventManager.unregisterEvent(type, this);
		}
		eventHanlderMap.clear();
	}
	
	@Override
	public void execute(Event event) {
		String key=event.getEventName();
		if(eventHanlderMap.containsKey(key)) {
			EventHandler handler=eventHanlderMap.get(key);
			handler.execute(event);
		}
	}
	
	public void addEvent(String type,EventHandler handler) {
		if(eventHanlderMap.containsKey(type)==false) {
			eventHanlderMap.put(type, handler);
			Facade.eventManager.registerEvent(type, this);
		}
	}
	
	public void delEvent(String type) {
		if(eventHanlderMap.containsKey(type)==true) {
			eventHanlderMap.remove(type);
			Facade.eventManager.unregisterEvent(type, this);
		}
	}
	
}
