package com.qvolcano.minecraft;

public interface IPlugin {
	default void enable() {
		
	}
	
	default void disable() {
		
	}
	default void load(String content) {
	}
}
