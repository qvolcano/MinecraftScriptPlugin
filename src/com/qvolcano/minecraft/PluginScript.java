package com.qvolcano.minecraft;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class PluginScript {

	private Context context;
	private Scriptable scope;
	private Object script;

	public PluginScript(Context context,ScriptableObject parentScope) {
		this.context=context;
		this.scope=this.context.initStandardObjects(parentScope);
		
	}
	
	public void loadScript(String source) {
		try {
			this.context.evaluateString(this.scope, source, "script", 1, null);
			Object script=scope.get("script", scope);
			if(script!=null) {
				this.script=script;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
