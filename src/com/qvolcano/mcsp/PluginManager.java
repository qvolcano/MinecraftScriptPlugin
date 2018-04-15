package com.qvolcano.mcsp;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PluginManager {
	private boolean enabled=false;
	private HashMap<String, Plugin> pluginMap=new HashMap<String,Plugin>();
	
	public void addPlugin(String name,Plugin plugin) {
		if(pluginMap.get(name)==null) {
			pluginMap.put(name,plugin);
		}
	}
	
	public void enablePlug(String name) {
		Plugin plugin=pluginMap.get(name);
		if(plugin!=null&&plugin.enabled==false) {
			plugin.enable();
		}
	}
	
	public void disablePlug(String name) {
		Plugin plugin=pluginMap.get(name);
		if(plugin!=null&&plugin.enabled==true) {
			plugin.disable();
		}
	}
	
	public void loadPlugin(File file) {
		PluginLoader loader=new PluginLoader();
		loader.load(file);
		Plugin plugin=loader.getPlugin();
		addPlugin(file.getName(), plugin);
		if(enabled) {
			enablePlug(file.getName());
		}
	}

	public void enable() {
		if(enabled==false) {
			for (Entry<String, Plugin> entry : pluginMap.entrySet()) {
				enablePlug(entry.getKey());
			}
			enabled=true;
		}
	}
	
	public void disable() {
		if(enabled==false) {
			for (Entry<String, Plugin> entry : pluginMap.entrySet()) {
				disablePlug(entry.getKey());
			}
			enabled=false;
		}
	}
}
