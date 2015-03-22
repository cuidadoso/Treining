package ru.pere.lab26;

import java.io.*;

import static java.lang.System.out;

import java.util.Date;

public class Main {
	
	public static final String fileName1 = ".\\test.txt";
	public static final String dirName1 = ".";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		File f1 = new File(fileName1);
		if (!f1.exists()) out.printf("File %s doesn't exist", f1.getAbsolutePath());
		else {
			String fullName = f1.getCanonicalPath();
			Date lm = new Date(f1.lastModified());
			out.printf("File: %s Date: %s Size: %d\n", fullName, lm.toLocaleString(), f1.length());
		}
		
		File dir1 = new File(dirName1);
		out.println(dir1.getCanonicalPath());
		if (dir1.isDirectory()){
			File[] files = dir1.listFiles();
			for (File file : files){
				if(file.isFile()) out.println(file.getName().toLowerCase());
				else out.println(file.getName().toUpperCase());
			}
		}
		
		out.println("---======****************======---");
		showDir(".");		
		out.println("---======****************======---");
				
	}

	@SuppressWarnings("deprecation")
	public static void showDir(File f, int level) throws IOException{
		
		if(f.isDirectory()){
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < level; i++)	sb.append("  ");
			out.printf("%s%s\n", sb.toString(), f.getName().toUpperCase());
			File[] files = f.listFiles();
			for (File file : files){
				if(file.isDirectory()) showDir(file, level++);
			}
			
			for (File file : files){
				if(file.isFile()) out.printf("%s%s%s %s\n",
						sb.toString(), sb.toString(),
						file.getName().toLowerCase(),
						(new Date (file.lastModified())).toLocaleString());
				
			}
		}
		
	}
	
	public static void showDir(File f) throws IOException {
		showDir(f, 0);
	}
	
	public static void showDir(String path) throws IOException {
		File f = new File(path);
		if(f.exists())	showDir(new File(path));
	}
	
}
