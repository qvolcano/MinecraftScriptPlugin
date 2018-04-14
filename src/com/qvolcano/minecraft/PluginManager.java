package com.qvolcano.minecraft;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;

import com.qvolcano.io.FileLoader;
public class PluginManager {

	ArrayList<PluginScript> pluginLoaders=new ArrayList<PluginScript>();
	Context context;
	public PluginManager() {
		this.context=Context.enter();
	}
	
	public void loadPlugin(File file) {
		if(file.exists()) {
			FileLoader loader=new FileLoader();
			try {
				String content=loader.loadString(file);
				PluginScript pluginScript=new PluginScript(context, null);
				pluginScript.loadScript(content);
				pluginLoaders.add(pluginScript);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
