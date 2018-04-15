package com.qvolcano.mcsp;

import java.io.File;

public class PluginLoader {
	private Plugin plugin;
	
	public void load(String path) {load(new File(path));}
	public void load(File file) {
		if(file.exists()) {
			
		}
	}
	
	public Plugin getPlugin() {
		return null;
	}

	
}
