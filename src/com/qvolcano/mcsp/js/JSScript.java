package com.qvolcano.mcsp.js;

import java.util.logging.Level;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.qvolcano.mcsp.Facade;
import com.qvolcano.mcsp.ScriptPlugin;
import com.qvolcano.mcsp.events.EnableEvent;
import com.sun.org.apache.xml.internal.security.Init;

/**
 * 采用java api 的 js脚本
 * @author qvolcano
 *
 */
public class JSScript extends ScriptPlugin {
	
	
	Context javascriptContext;
	Scriptable javascriptScope;
	JSScriptContext jsScriptContext;
	private String source;
	
	public JSScript(JavaPlugin javaPlugin) {
		super(javaPlugin);
	}
	
	@Override
	public void load(String source) {
		this.source=source;
	}
	
	@Override
	public void onEnable() {
		try {
			javascriptContext = Context.enter();  
			javascriptScope=javascriptContext.initStandardObjects(null);
			ScriptableObject.defineClass(javascriptScope, JSScriptContext.class);
			jsScriptContext=(JSScriptContext) javascriptContext.newObject(javascriptScope, "JSScriptContext");
			jsScriptContext.init(this);
			javascriptScope.put("context", javascriptScope, jsScriptContext);
			javascriptContext.evaluateString(javascriptScope, source, null, 0, null);
			this.onEvent(new EnableEvent());
		} catch (Exception e) {
			e.printStackTrace();
			Facade.logger.log(Level.ALL, "初始化脚本引擎失败");
		}
	}
	
	@Override
	public void onDisable() {
		javascriptContext.exit();
	}
	
	@Override
	public void onEvent(Event event) {
		jsScriptContext.onEvent(event);
	}
	
	public void addEvent(String type) {
		Facade.eventManager.registerEvent(type, this);
	}
}
