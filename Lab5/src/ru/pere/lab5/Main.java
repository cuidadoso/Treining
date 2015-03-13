package ru.pere.lab5;

import java.io.*;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int a = 5;
		String name;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		out.print("Введите имя: ");
		name = reader.readLine();
		
		if (name.isEmpty()) name = "Незнакомец";
		out.printf("Привет %s!\n", name);
		
		if (a>0) {
			out.println("a больше нуля");
		} else {
			out.println("a не больше нуля");
		}
		
		

	}

}
