package ru.pere.lab9;

import static java.lang.System.out;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		//reader.readLine();
		
		
		for (int i=1; i<=1024; i*=2) out.println(i);
		
		for (int i = 0; i < 10; i++) {
			if (i==3) continue;
			out.println(i);
			if (i==6) break;
		}
		
		

	}

}
