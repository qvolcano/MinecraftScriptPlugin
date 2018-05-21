package com.qvolcano.mcsp;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.qvolcano.mcsp.events.EventManager;
import com.qvolcano.mcsp.script.ScriptManager;
import com.qvolcano.utils.PathUtil;

public class MinecraftScriptPlugin extends JavaPlugin{
	ScriptManager scriptManager;
	EventManager eventManager;
	
	public MinecraftScriptPlugin(){
		scriptManager=new ScriptManager(this);
		eventManager=new EventManager(this);
	}
	
	@Override
	public void onEnable() {
		super.onEnable();
		scriptManager.enable();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		scriptManager.disable();
	}
	
	@Override
	public void  onLoad() {
		super.onLoad();
		Facade.main=this;
		Facade.logger=this.getLogger();
		Facade.pluginManager=this.scriptManager;
		Facade.eventManager=this.eventManager;
		//loadJS
		File dataFolder=this.getDataFolder();
		if(dataFolder.exists()==false) {
			dataFolder.mkdir();
		}
		
		File scriptFolder=new File(dataFolder.getAbsolutePath()+"/scripts");
		this.saveResource("scripts/Templet.js",true);
		this.loadScriptFiles();
	}
	
	private void loadScriptFiles() {
		File scriptFolder=new File(this.getDataFolder().getAbsolutePath()+"/scripts");
		if(scriptFolder.exists()) {
			File[] files=scriptFolder.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					String exte=PathUtil.getFullExte(name);
					return true;
//					return !(exte==".js"||exte==".n.js");
				}
			});
			for (int i = 0; i < files.length; i++) {
				File file=files[i];
				this.scriptManager.loadScript(file);
			}
		}
	}
	
	private void loadScript(String path) {
		File file=new File(path);
		if(file.exists()) {
			this.scriptManager.loadScript(file);
		}
	}
	
	private void enableScript(String name) {
		scriptManager.enableScript(name);
	}
	
	private void disbledScript(String name) {
		scriptManager.disableScript(name);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if (cmd.getName().equalsIgnoreCase("mscp")) { // 如果玩家输入了/basic则执行如下内容...
	    // 所需要执行的事（此处略）
	    	String optName=args[0];
	    	String optParam=args[1];
	    	switch (optName) {
			case "load":
				loadScript(this.getDataFolder().getAbsolutePath()+"/scripts/"+args[1]+".js");
				break;
			case "enable":
				enableScript(args[1]);
				break;
			case "disable":
				disbledScript(args[1]);
				break;
			default:
				break;
			}
	    	
	        return true;
	    } //如果以上内容成功执行，则返回true 
	    // 如果执行失败，则返回false.
	    return false;
	}
}
