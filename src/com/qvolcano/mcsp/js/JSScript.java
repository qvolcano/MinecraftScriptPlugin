package com.qvolcano.mcsp.js;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Scriptable;

import com.qvolcano.mcsp.ScriptPlugin;

public class JSScript extends ScriptPlugin {
	String source="";
	Object script=null;
	
	public JSScript(String source) {
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
			Context jcontext = Context.enter();  
			Scriptable scope=jcontext.initStandardObjects(null);
			jcontext.evaluateString(scope, source, "script", 1, null);
			script=scope.get("script", scope);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return script;
	}
}
