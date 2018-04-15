package com.qvolcano.mcsp.dom;

import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class DomObject{

	public static DomObject parseObject(Object target) {
		DomObject object=getDomObject(target);
		
		return object;
	}
	
	public static DomObject getDomObject(Object target) {
		if(target instanceof Player) {
			return new DPlayer((Player) target);
		}
		if(target instanceof World) {
			return new DWorld((World)target);
		}
		
		
		return null;
	}
}

class DServer extends DomObject {
	
	public Server target;
	
	public DServer(Server target) {
		this.target=target;
	}
	
	public DWorld getWorldByName(String name) {
		return new DWorld(target.getWorld(name));
	}
	
}


class DWorld extends DomObject {
	private World target;
	public DWorld(World target) {
		this.target=target;
	}
}


class DPlayer extends DomObject{
	private Player target;

	public DPlayer(Player target) {
		this.target=target;
	}
}
