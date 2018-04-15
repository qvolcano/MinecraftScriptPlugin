package com.qvolcano.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.CharBuffer;

public class FileLoader {
	
	public FileLoader() {
		// TODO 自动生成的构造函数存根
	}
	
	public String loadString(File file) {
		StringBuilder result = new StringBuilder();
		if(file.exists()) {
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
				String s = null;
	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
	                result.append(System.lineSeparator()+s);
	            }
	            br.close();
			} catch (Exception  e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return result.toString();
	}
}
