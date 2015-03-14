/**
 * 
 */
package ru.pere.lab11;

import static java.lang.System.out;

import java.io.*;

/**
 * @author Alejandro
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		String name = "";
		
		while ( name.isEmpty() ) {
			out.print("Введите имя: ");
			name = reader.readLine();
		}
		
		out.printf("Привет %s!\n", name);
		
		/*
		int a = 1;
		
		while (a <1000) {
			a*=2;
			if (a==32) continue;
			if (a==256) break;
			out.println(a);
			
		}
		*/
		int a1 = 0, a2 = 1, f = a1 + a2;
		String fibo = "";
				//String.format("%3d %3d", a1, a2);
		while (f<1000) {
			fibo=String.format("%s %3d", fibo, f);
			f=a1+a2;
			a1=a2;
			a2=f;
			
		}
		
		out.print(fibo);
	}

}
