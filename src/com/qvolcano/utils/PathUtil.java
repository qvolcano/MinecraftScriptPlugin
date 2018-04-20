package com.qvolcano.utils;


public class PathUtil {
	public static String escapePath(String path) {
        if (path==null)
            return "";
        path = path.replaceAll("\\","/");
        return path;
    };
    
    public static String getFullExte(String path) {
    	return path.substring(path.indexOf(".", path.lastIndexOf("/")));
    }
}
