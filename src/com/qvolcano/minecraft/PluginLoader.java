package com.qvolcano.minecraft;

import java.io.File;

import com.qvolcano.io.FileLoader;

public class PluginLoader {

	private IPlugin _plugin;
	public void loadPlugin(File file) {
		if(file.exists()) {
			FileLoader loader=new FileLoader();
			try {
				IPlugin plugin = null;
				String filetype = file.getName().substring(file.getName().lastIndexOf(".") + 1);
				String content=loader.loadString(file);
				if(filetype=="js") {
					PluginContext context=new PluginContext();
					plugin=new JSPlugin(context);
					plugin.load(content);
				}
				_plugin=plugin;
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public IPlugin getPlugin() {
		return _plugin;
	}
}
