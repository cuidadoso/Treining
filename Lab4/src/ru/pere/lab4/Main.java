package ru.pere.lab4;

import static java.lang.System.out;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		out.print("Ведите имя: ");
		//String name = reader.readLine();
		//String helo = String.format("Привет, %s", name);
		//out.println(helo);
		//out.printf("Привет, %s", name);
		//out.printf("Привет, %s", reader.readLine());
		StringBuffer sb = new StringBuffer();
		sb.append("Привет, ");
		sb.append(reader.readLine());
		sb.append("!");
		out.println(sb.toString());


	}

}
