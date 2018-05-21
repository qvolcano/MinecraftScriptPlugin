package com.qvolcano.mcsp;
import java.util.logging.Logger;

import com.qvolcano.mcsp.events.EventManager;
import com.qvolcano.mcsp.script.ScriptManager;
public class Facade {
	static public Logger logger;
	static public EventManager eventManager;
	public static ScriptManager pluginManager;
	public static MinecraftScriptPlugin main;
}
