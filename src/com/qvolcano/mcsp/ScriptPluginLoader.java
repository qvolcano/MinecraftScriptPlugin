package com.qvolcano.mcsp;

import java.io.File;

import com.qvolcano.io.FileLoader;
import com.qvolcano.mcsp.js.JSScript;
import com.qvolcano.mcsp.njs.JSNScript;
import com.qvolcano.utils.PathUtil;

public class ScriptPluginLoader {
	private ScriptPlugin plugin;
	private FileLoader loader=new FileLoader();
	
	public void load(String path) {load(new File(path));}
	public void load(File file) {
		if(file.exists()) {
			
			String content = loader.loadString(file);
			if(content!="") {
				String filename=file.getName();
				String filetype=PathUtil.getFullExte(filename);
				if(filetype.equals(".js")) {
					plugin=new JSScript(content);
				}else if(filetype.equals(".n.js")) {
					plugin=new JSNScript(content);
				}
				
			}
		}
	}
	
	public ScriptPlugin getPlugin() {
		return plugin;
	}

	
}
