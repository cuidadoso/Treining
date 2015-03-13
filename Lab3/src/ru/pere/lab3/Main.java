package ru.pere.lab3;

import static java.lang.System.out;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		out.println("T(F) = ");
		double tf = Double.parseDouble(reader.readLine());
		double tc = (tf-32)*5/9;
		
		out.printf("T(c)= %g\n", tc);
		

	}

}
