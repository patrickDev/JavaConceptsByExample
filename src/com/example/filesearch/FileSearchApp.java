package com.example.filesearch;

import java.io.File;

public class FileSearchApp {

	String path = "C:\\Users\\Patrick\\Documents\\java_pratice\\JavaConceptsByExample\\files";
	String regex;
	String zipFileName; 
	
	public static void main(String[] args) {
		FileSearchApp app = new FileSearchApp();
		try {
			app.walkDirectoryJava6(app.getPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void walkDirectoryJava6(String path) {
		File dir = new File(path);
		File[] files = dir.listFiles();		
		for (File file : files) {
			if(file.isDirectory()){
				walkDirectoryJava6(file.getAbsolutePath());
			}else{
				processFile(file);
			}
		}
	}
	
	public void processFile(File file) {
		System.out.println("processFile: " + file);
	} 
	
	public String getPath() {
		return path;
	}

}
