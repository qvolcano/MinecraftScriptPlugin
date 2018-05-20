package com.qvolcano.mcsp;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import com.qvolcano.mcsp.script.JSScript;
import com.qvolcano.mcsp.script.RecipeScript;
import com.qvolcano.utils.FileLoader;
import com.qvolcano.utils.PathUtil;

public class ScriptLoader {
	private Script plugin;
	private FileLoader loader=new FileLoader();
	private JavaPlugin javaPlugin;
	
	public ScriptLoader(JavaPlugin javaPlugin) {
		this.javaPlugin = javaPlugin;
	}
	
	public void load(String path) {load(new File(path));}
	public void load(File file) {
		if(file.exists()) {
			
			String content = loader.loadString(file);
			if(content!="") {
				String filename=file.getName();
				String filetype=PathUtil.getFullExte(filename);
				switch (filetype) {
				case ".js":
					plugin=new JSScript(content,javaPlugin);
					break;
				case ".recipe":
					plugin=new RecipeScript(content, javaPlugin);
					break;
				default:
					break;
				}
				
			}
		}
	}
	
	public Script getScript() {
		return plugin;
	}

	
}
