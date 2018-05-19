package com.qvolcano.mcsp.js;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.logging.Level;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.ast.LetNode;

import com.qvolcano.mcsp.Facade;
import com.qvolcano.utils.EventEnum;
import com.qvolcano.utils.EventHandler;

import jdk.nashorn.internal.runtime.ScriptObject;

public class JSScriptContext extends ScriptableObject {
	
	private static final long serialVersionUID = -3801158101603251426L;
	
	private JSScript script;
	
	public JSScriptContext() {

	}

	public String getClassName() {
		return "JSScriptContext";
	}

	/**
	 * 发布公告
	 */
	@JSFunction
	public void broadcastMessage(String message) {
		script.javaPlugin.getServer().broadcastMessage(message);
	}
	
	/**
	 * 在服务器执行一个命令
	 * @param command
	 */
	@JSFunction
	public void consoleCommand(String command) {
		script.javaPlugin.getServer().getScheduler().runTaskLater((Plugin) script.javaPlugin, new Runnable() {
		        @Override
		        public void run() {
		        	script.javaPlugin.getServer().dispatchCommand(script.javaPlugin.getServer().getConsoleSender(), command);
		        }
		      }, 1); // 1 = next tick
	}
	
	/**
	 * 玩家执行一个命令
	 * @param command
	 */
	@JSFunction
	public void palyerCommand(String playerUUID,String command) {
		Player player=script.javaPlugin.getServer().getPlayer(java.util.UUID.fromString(playerUUID));
		script.javaPlugin.getServer().dispatchCommand(player,command);
	}
	
	@JSFunction
	public void addEvent(String type,BaseFunction callback) {
		script.addEvent(type,new EventHandler() {
			@Override
			public void execute(Event event) {
				// TODO Auto-generated method stub
				callback.call(script.javascriptContext, script.javascriptScope, script.javascriptScope,new Object[]{event});
			}
		});
	}
	


	public void init(JSScript script) {
		this.script = script;
		
	}
	
	@JSGetter
	public Server server() {
		return script.javaPlugin.getServer();
	}
	
	@JSFunction
	public void event(Object events) {
		NativeObject aObject=(NativeObject)events;
		Object[] ids=aObject.getAllIds();
		for (int i = 0; i < ids.length; i++) {
			String id=(String)ids[i];
			BaseFunction callback=(BaseFunction)aObject.get(id);
			addEvent(id, callback);
		}
	}
	
	@JSFunction
	public void log(String message) {
		Facade.logger.info(message);
	}
	
	@JSFunction
	public void recipes(NativeObject data) {
		script.javaPlugin.getServer().getScheduler().runTaskLater((Plugin) script.javaPlugin, new Runnable() {
	        @Override
	        public void run() {
	        	for(Entry<Object, Object> i:data.entrySet()) {
	    			NativeObject recipe=(NativeObject)i.getValue();
	    			if(recipe.containsKey("shape")) {
	    				NativeArray shape=(NativeArray)recipe.get("shape");
	    				String[] shapeList=(String[]) shape.toArray(new String[]{});
	    			
	    				script.addShapedRecipe((Integer)recipe.get("output"), shapeList, (NativeObject)recipe.get("input"));
	    			}
	    			
	    		}
	        }
	      }, 1); // 
		
		
	}
}
//


