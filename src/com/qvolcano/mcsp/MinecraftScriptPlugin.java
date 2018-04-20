package com.qvolcano.mcsp;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.qvolcano.utils.PathUtil;

public class MinecraftScriptPlugin extends JavaPlugin{
	ScriptPluginManager pluginManager;
	
	public MinecraftScriptPlugin(){
		pluginManager=new ScriptPluginManager(this);
	}
	
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
		//if(scriptFolder.exists()==false) {
			this.saveResource("scripts/Templet.js",false);
			this.saveResource("scripts/Templet.n.js",false);
		//}else {
			this.loadScriptFiles();
		//}
	}
	
	private void loadScriptFiles() {
		File scriptFolder=new File(this.getDataFolder().getAbsolutePath()+"/scripts");
		if(scriptFolder.exists()) {
			File[] files=scriptFolder.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					String exte=PathUtil.getFullExte(name);
					return !(exte==".js"||exte==".n.js");
				}
			});
			for (int i = 0; i < files.length; i++) {
				File file=files[i];
				this.pluginManager.loadScript(file);
			}
		}
	}
}
