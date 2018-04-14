package com.qvolcano.minecraft;
import java.io.File;
import java.io.FilenameFilter;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.bukkit.plugin.java.JavaPlugin;
public class MinecraftJsPlugin extends JavaPlugin {
	
	PluginManager pluginManager;
	
	public MinecraftJsPlugin() {
//		// TODO 自动生成的构造函数存根
//		ScriptEngineManager factory = new ScriptEngineManager();//step 1
//        ScriptEngine engine = factory.getEngineByName("JavaScript");//Step 2
        pluginManager=new PluginManager();

        
	}
	
	@Override
	public void onEnable() {
		// TODO 自动生成的方法存根
		super.onEnable();
		
		
	}
	
	@Override
	public void onDisable() {
		// TODO 自动生成的方法存根
		super.onDisable();
	}
	
	@Override
	public void  onLoad() {
		// TODO 自动生成的方法存根
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
			
		}
		this.loadJsPlugins();
	}
	
	private void loadJsPlugins() {
		File scriptFolder=new File(this.getDataFolder().getAbsolutePath()+"/scripts");
		if(scriptFolder.exists()) {
			File[] files=scriptFolder.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO 自动生成的方法存根
					return name.lastIndexOf(".js")==name.length()-3;
				}
			});
//			PluginLoader[] pluginLoaders=new PluginLoader[files.length];
			for (int i = 0; i < files.length; i++) {
				File file=files[i];
				this.pluginManager.loadPlugin(file);
//				PluginLoader loader=new PluginLoader();
//				loader.loadPlugin(file.getAbsolutePath());
//				pluginLoaders[i]=loader;
			}
		}
	}
	
}
