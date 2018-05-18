package com.qvolcano.utils;


public class PathUtil {
	public static String escapePath(String path) {
        if (path==null)
            return "";
        path = path.replace("\\","/");
        return path;
    };
    
    public static String getFullExte(String path) {
    	return path.substring(path.indexOf(".", path.lastIndexOf("/")));
    }
    
    public static String getFileName(String path) {
    	path=escapePath(path);
    	int start=path.lastIndexOf("/")+1;
    	return path.substring(start,path.lastIndexOf("."));
    }
}
