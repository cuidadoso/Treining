package ru.pere.lab27;

import java.io.*;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new  FileInputStream("test.txt");
		FileOutputStream fo = new FileOutputStream("out.txt");
		
		while (fs.available()!=0){
			int b = fs.read();
			char ch = (char)b;
			out.print(ch);
		}
		
		String s = "Hola";
		
		byte[] bytes = s.getBytes("UTF-8");
		
		fo.write(bytes);
		
		fs.close();
		fo.close();
		
		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		
		out.println("\n************************");
		
		while((s = reader.readLine()) != null){
			out.println(s);
		}
		
		reader.close();
		
		PrintWriter writer = new PrintWriter("test2.txt");
		
		writer.printf("%s %d %c", "string", 100, 'c');
		
		writer.close();

	}

}
