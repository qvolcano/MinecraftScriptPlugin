package com.qvolcano.mcsp.njs;

import java.util.function.Function;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.qvolcano.mcsp.ScriptPlugin;
import com.qvolcano.mcsp.events.EventListener;
import com.qvolcano.mcsp.events.EventManager;

/**
 * 采用java api 的 js脚本
 * @author qvolcano
 *
 */
public class JSNScript extends ScriptPlugin {
	
	Scriptable script;
	private String source;
	
	public JSNScript(String source) {
		this.source=source;
	}
	
	@Override
	public void onEnable() {
		Object scriptObject=this.createScript(this.source);
		
	}
	
	private Object createScript(String source) {
		Object script=null;
		try {
			Context jcontext = Context.enter();  
			Scriptable scope=jcontext.initStandardObjects(null);
			ScriptableObject.defineClass(scope, JSNScriptContext.class);
			JSNScriptContext jscontext=(JSNScriptContext) jcontext.newObject(scope, "JSNScriptContext",new Object[] {this});
			scope.put("context", scope, jscontext);
			jcontext.evaluateString(scope, source, null, 0, null);
			script=scope.get("script", scope);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return script;
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