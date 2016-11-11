package com.example.filesearch;

import java.io.File;

public class FileSearchAppJava6 {

	String path = "C:\\Users\\Patrick\\Documents\\java_pratice\\JavaConceptsByExample\\files";
		
	public static void main(String[] args) {
		FileSearchAppJava6 app = new FileSearchAppJava6();
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
