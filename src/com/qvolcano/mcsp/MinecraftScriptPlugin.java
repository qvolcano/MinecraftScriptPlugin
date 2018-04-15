package com.qvolcano.mcsp;

import java.io.File;
import java.io.FilenameFilter;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftScriptPlugin extends JavaPlugin{
	PluginManager pluginManager=new PluginManager();
	
	@Override
	public void onEnable() {
		super.onEnable();
		pluginManager.enable();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		pluginManager.disable();
	}
	
	@Override
	public void  onLoad() {
		super.onLoad();
		Logger logger=this.getLogger();
		//loadJS
		File dataFolder=this.getDataFolder();
		if(dataFolder.exists()==false) {
			dataFolder.mkdir();
		}
		
		File scriptFolder=new File(dataFolder.getAbsolutePath()+"/scripts");
		if(scriptFolder.exists()==false) {
			this.saveResource("scripts/Templet.js",false);
		}else {
			this.loadJsPlugins();
		}
	}
	
	private void loadJsPlugins() {
		File scriptFolder=new File(this.getDataFolder().getAbsolutePath()+"/scripts");
		if(scriptFolder.exists()) {
			File[] files=scriptFolder.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.lastIndexOf(".js")==name.length()-3;
				}
			});
			for (int i = 0; i < files.length; i++) {
				File file=files[i];
				this.pluginManager.loadPlugin(file);
			}
		}
	}
}
