package com.qvolcano.mcsp;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.qvolcano.utils.PathUtil;

public class ScriptManager {
	private boolean enabled=false;
	private HashMap<String, Script> scriptMap=new HashMap<String,Script>();
	private JavaPlugin javaPlugin;
	
	public ScriptManager(JavaPlugin plugin) {
		this.javaPlugin=plugin;
	}
	
	public void addScript(String name,Script script) {
		name=name.toLowerCase();
		if(scriptMap.get(name)==null) {
			scriptMap.put(name,script);
		}
	}
	
	public void enableScript(String name) {
		name=name.toLowerCase();
		Script plugin=scriptMap.get(name);
		if(plugin!=null&&plugin.enabled==false) {
			try {
				plugin.enable();
				javaPlugin.getLogger().info("开启脚本:"+name);
			} catch (Exception e) {
				e.printStackTrace();
				javaPlugin.getLogger().info("错误脚本:"+name);
			}
		}
	}
	
	public void disableScript(String name) {
		name=name.toLowerCase();
		Script script=scriptMap.get(name);
		if(script!=null&&script.enabled==true) {
			script.disable();
		}
	}
	
	public void loadScript(File file) {
		String name=PathUtil.getFileName(file.getPath());
		name=name.toLowerCase();
		if(scriptMap.containsKey(name)) {
			Script script=scriptMap.get(name);
			script.disable();
			scriptMap.remove(name);
		}
		
		ScriptLoader loader=new ScriptLoader(this.javaPlugin);
		loader.load(file);
		Script script=loader.getScript();
		addScript(name, script);
		if(enabled) {
			enableScript(name);
		}
	}

	public void enable() {
		if(enabled==false) {
			for (Entry<String, Script> entry : scriptMap.entrySet()) {
				enableScript(entry.getKey());
			}
			enabled=true;
		}
	}
	
	public void disable() {
		if(enabled!=false) {
			for (Entry<String, Script> entry : scriptMap.entrySet()) {
				disableScript(entry.getKey());
			}
			enabled=false;
		}
	}
}
