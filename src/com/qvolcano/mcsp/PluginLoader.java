package com.qvolcano.mcsp;

import java.io.File;

import com.qvolcano.io.FileLoader;
import com.qvolcano.mcsp.js.JSPlugin;

public class PluginLoader {
	private Plugin plugin;
	private FileLoader loader=new FileLoader();
	
	public void load(String path) {load(new File(path));}
	public void load(File file) {
		if(file.exists()) {
			
			String content = loader.loadString(file);
			if(content!="") {
				String filename=file.getName();
				String filetype=filename.substring(filename.lastIndexOf("."),filename.length());
				if(filetype==".js") {
					plugin=new JSPlugin(content);
				}
			}
		}
	}
	
	public Plugin getPlugin() {
		return null;
	}

	
}
