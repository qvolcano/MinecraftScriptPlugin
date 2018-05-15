package com.qvolcano.mcsp.js;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.ScriptableObject;

public class JSScriptContext extends ScriptableObject {
	
	private static final long serialVersionUID = -3801158101603251426L;
	
//	private HashMap<String, EventHandler>handlerMap=new HashMap<>();
	
	private HashMap<String, BaseFunction>eventMap=new HashMap<>();

	private JSScript script;
	
	public JSScriptContext() {

	}

	public String getClassName() {
		return "JSScriptContext";
	}

	
//	public void addEvent(String type,EventHandler handler) {
//		Class<Event> event=EventEnum.EVENT_MAP.get(type);
//		if(event!=null) {
//			if(handlerMap.containsKey(type)==false) {
//				script.javaPlugin.getServer().getPluginManager().registerEvent(event, handler, EventPriority.NORMAL, handler, script.javaPlugin);
//				handlerMap.put(type, handler);
//			}
//		}
//	}
//	
//	public void sendEvent(Event event) {
//		String type=event.getEventName();
//		if(handlerMap.containsKey(type)) {
//			EventHandler handler=handlerMap.get(type);
//			try {
//				handler.execute(handler, event);
//			} catch (EventException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	

	
	/**
	 * 发布公告
	 */
	public void broadcastMessage(String message) {
		script.javaPlugin.getServer().broadcastMessage(message);
	}
	
	/**
	 * 在服务器执行一个命令
	 * @param command
	 */
	public void consoleCommand(String command) {
		script.javaPlugin.getServer().dispatchCommand(script.javaPlugin.getServer().getConsoleSender(),command);
	}
	
	/**
	 * 玩家执行一个命令
	 * @param command
	 */
	public void palyerCommand(java.util.UUID playerUUID,String command) {
		Player player=script.javaPlugin.getServer().getPlayer(playerUUID);
		script.javaPlugin.getServer().dispatchCommand(player,command);
	}

	public void js_addEvent(String type,BaseFunction callback) {
		script.addEvent(type);
		eventMap.put(type, callback);
	}

	public void init(JSScript script) {
		this.script = script;
		
	}

	public void onEvent(Event event) {
		String type=event.getEventName();
		if(eventMap.containsKey(type)) {
			BaseFunction callback=eventMap.get(type);
			callback.call(script.javascriptContext, script.javascriptScope, script.javascriptScope, null);
		}
	}
}
//


