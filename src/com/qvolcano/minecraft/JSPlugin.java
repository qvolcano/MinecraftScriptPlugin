package com.qvolcano.minecraft;

public class JSPlugin implements IPlugin {
	private String _content;
	private PluginContext _context;
	public JSPlugin(PluginContext context) {
		_context=context;
	}
	
	public void enable() {
		
	}
	
	public void disable() {
		
	}
	
	public void load(String content) {
		_content=content;
	}
}
