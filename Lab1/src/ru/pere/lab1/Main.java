package ru.pere.lab1;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		int x1, x2;
		BufferedReader reader= new  BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите первое число:");
		// String s1 = reader.readLine();
		x1 = Integer.parseInt(reader.readLine());
		System.out.println("Введите второе число:");
		// String s2 = reader.readLine();
		x2 = Integer.parseInt(reader.readLine());
		
		System.out.println("Среднее арифметическое: "+(x1+x2)/2);

	}

}
