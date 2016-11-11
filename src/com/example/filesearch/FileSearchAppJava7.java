package com.example.filesearch;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSearchAppJava7 {

	String path = "C:\\Users\\Patrick\\Documents\\java_pratice\\JavaConceptsByExample\\files";
	public static void main(String[] args) {

		FileSearchAppJava7 app = new FileSearchAppJava7();
		try {
			app.walkDirectoryJava7(app.getPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void walkDirectoryJava7(String path) throws IOException {
		Files.walkFileTree(Paths.get(path), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) 
					throws IOException {
				processFile(file.toFile());
				return FileVisitResult.CONTINUE;
			}
		});
	}
	
	public void processFile(File file) {
		System.out.println("processFile: " + file);
	} 
	
	public String getPath() {
		return path;
	}


}
