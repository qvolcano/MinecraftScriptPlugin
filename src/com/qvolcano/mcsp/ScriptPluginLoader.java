package com.qvolcano.mcsp;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import com.qvolcano.mcsp.js.JSScript;
import com.qvolcano.utils.FileLoader;
import com.qvolcano.utils.PathUtil;

public class ScriptPluginLoader {
	private ScriptPlugin plugin;
	private FileLoader loader=new FileLoader();
	private JavaPlugin javaPlugin;
	
	public ScriptPluginLoader(JavaPlugin javaPlugin) {
		this.javaPlugin = javaPlugin;
	}
	
	public void load(String path) {load(new File(path));}
	public void load(File file) {
		if(file.exists()) {
			
			String content = loader.loadString(file);
			if(content!="") {
				String filename=file.getName();
				String filetype=PathUtil.getFullExte(filename);
				if(filetype.equals(".js")) {
					plugin=new JSScript(javaPlugin);
					plugin.load(content);
				}
				
			}
		}
	}
	
	public ScriptPlugin getPlugin() {
		return plugin;
	}

	
}
