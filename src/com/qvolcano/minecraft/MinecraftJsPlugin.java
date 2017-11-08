package com.qvolcano.minecraft;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.bukkit.plugin.java.JavaPlugin;
public class MinecraftJsPlugin extends JavaPlugin {
	
	
	
	public MinecraftJsPlugin() {
		// TODO 自动生成的构造函数存根
		ScriptEngineManager factory = new ScriptEngineManager();//step 1
        ScriptEngine engine = factory.getEngineByName("JavaScript");//Step 2    
	}
	
	@Override
	public void onEnable() {
		// TODO 自动生成的方法存根
		super.onEnable();
		Logger logger=this.getLogger();
		logger.info("！！！！！！！！！！！");
		//loadJS
		
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
	}
}
