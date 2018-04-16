package com.qvolcano.mcsp.njs;

import java.util.function.Function;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.mozilla.javascript.Scriptable;

import com.qvolcano.mcsp.Plugin;
import com.qvolcano.mcsp.events.EventListener;
import com.qvolcano.mcsp.events.EventManager;

/**
 * 采用java api 的 js脚本
 * @author qvolcano
 *
 */
public class JSNPlugin extends Plugin {
	
	Scriptable script;
	private String source;
	
	public JSNPlugin(String source) {
		this.source=source;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onEnable() {
//		ScriptEngineManager factory = new ScriptEngineManager();
//        ScriptEngine engine = factory.getEngineByName("JavaScript");
//        String script = "function say(first,second) { print(first +' '+ second); }";
//        try {
//			engine.eval(script);
//		} catch (ScriptException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        Invocable inv = (Invocable) engine;
//        IScript script2=inv.getInterface(IScript.class);
//	       if( script2.BlockBreakEvent.call==null) {
//	    	   
//	       }
	}
}

class ScriptContext{
	public JavaPlugin plugin;
	
	public void registerEvent(String type) {
		Class<Event> eventClass=EventManager.EVENT_MAP.get(type);
		EventListener listener=new EventListener();
		plugin.getServer().getPluginManager().registerEvent(eventClass, listener, null, null, plugin);
	}
}

interface IScript{
	default void onEvent(String type,Object event) {
		
	}
}