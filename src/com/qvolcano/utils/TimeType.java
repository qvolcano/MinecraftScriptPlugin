package com.qvolcano.utils;

public class TimeType {

	
	
	public static int getType(Long time) {
		return (int) (time%2400);
	}
}
