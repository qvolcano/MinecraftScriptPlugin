package com.qvolcano.mcsp.js;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import com.qvolcano.mcsp.Plugin;

public class JSPlugin extends Plugin {
	String source="";
	Object script=null;
	
	public JSPlugin(String source) {
		this.source=source;
	}

	@Override
	public void onEnable() {
		this.script=createScript();
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private Object createScript() {
		Object script=null;
		try {
			Context context=Context.enter();
			Scriptable scope=context.initStandardObjects(null);
			context.evaluateString(scope, source, "script", 1, null);
			script=scope.get("script", scope);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return script;
	}
}
