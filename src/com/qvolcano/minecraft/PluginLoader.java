package com.qvolcano.minecraft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.CharBuffer;

import com.qvolcano.io.FileLoader;

public class PluginLoader {

	private IPlugin _plugin;
	public void loadPlugin(File file) {
		if(file.exists()) {
			FileLoader loader=new FileLoader();
			try {
				String content=loader.loadString(file);
				
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
