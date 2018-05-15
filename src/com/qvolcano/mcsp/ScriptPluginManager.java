package com.qvolcano.mcsp;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.qvolcano.utils.PathUtil;

public class ScriptPluginManager {
	private boolean enabled=false;
	private HashMap<String, ScriptPlugin> scriptPluginMap=new HashMap<String,ScriptPlugin>();
	private JavaPlugin plugin;
	
	public ScriptPluginManager(JavaPlugin plugin) {
		this.plugin=plugin;
	}
	
	public void addScript(String name,ScriptPlugin plugin) {
		if(scriptPluginMap.get(name)==null) {
			scriptPluginMap.put(name,plugin);
		}
	}
	
	public void enableScript(String name) {
		ScriptPlugin plugin=scriptPluginMap.get(name);
		if(plugin!=null&&plugin.enabled==false) {
			plugin.enable();
		}
	}
	
	public void disableScript(String name) {
		ScriptPlugin plugin=scriptPluginMap.get(name);
		if(plugin!=null&&plugin.enabled==true) {
			plugin.disable();
		}
	}
	
	public void loadScript(File file) {
		String name=PathUtil.getFileName(file.getPath());
		if(scriptPluginMap.containsKey(name)) {
			ScriptPlugin plugin=scriptPluginMap.get(name);
			plugin.disable();
			scriptPluginMap.remove(name);
		}
		
		ScriptPluginLoader loader=new ScriptPluginLoader(this.plugin);
		loader.load(file);
		ScriptPlugin plugin=loader.getPlugin();
		addScript(file.getName(), plugin);
		if(enabled) {
			enableScript(file.getName());
		}
	}

	public void enable() {
		if(enabled==false) {
			for (Entry<String, ScriptPlugin> entry : scriptPluginMap.entrySet()) {
				enableScript(entry.getKey());
			}
			enabled=true;
		}
	}
	
	public void disable() {
		if(enabled==false) {
			for (Entry<String, ScriptPlugin> entry : scriptPluginMap.entrySet()) {
				disableScript(entry.getKey());
			}
			enabled=false;
		}
	}
}
