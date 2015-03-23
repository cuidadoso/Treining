package ru.pere.lab28;

import java.io.*;

import static java.lang.System.out;

public class Main {
	
	public static final String sourceFileName = "source.txt";
	public static final String destFileName = "dest.txt";

	public static void main(String[] args) throws IOException {
		
		File sourceFile = new File(sourceFileName);
		
		if (!sourceFile.exists()){
			out.printf("There is %s file! ", sourceFileName);
		} else {
			BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
			PrintWriter writer = new PrintWriter(destFileName);
			String line = null;
			int chars = 0, words = 0, lines = 0;
			while ((line = reader.readLine())!=null){
				lines++;
				
				String[] ws = line.trim().split("\\s+");
				words += ws.length;
				for (String s : ws) chars += s.length();
				//chars += line.length();
				//words += line.split(" ").length;
				writer.println(line.toUpperCase());
			}
			reader.close();
			writer.close();
			out.printf("Chars: %d\nWords: %d\nLines: %d\n", chars, words, lines);
			out.println("*************************************************");
			
			RandomAccessFile raf = new RandomAccessFile(sourceFile, "rw");
			
			//out.println(raf.length());
			raf.seek(raf.length());
			String s = "\nLa Fine";
			raf.write(s.getBytes("UTF-8"));
			//raf.seek(2L);
			//out.println(raf.readUTF());
			
			raf.close();
		}
		
		
		/*
		int charCount = 0;
		int wordCount = 0;
		String s = "";

		File f1 = new File(reader.readLine());
		
		out.print("Type file name: ");

		if (f1.exists()){
			
			FileInputStream fi = new  FileInputStream(f1.getName());
			FileOutputStream fo = new FileOutputStream("out.txt");
			
			while (fi.available()!=0){
				char ch = (char)fi.read();
				if (ch==' ')  wordCount++;
				s += ch;
				charCount++;
			}
			
			fo.write(s.toUpperCase().getBytes());
			
			out.printf("In file out.txt has been saved datas: %s\nChars: %d\nWords: %d\n",
					s.toUpperCase(), charCount, wordCount);
			
			fi.close();
			fo.close();
		} else out.println("There is no such file!");
		
		*/
	}

}
