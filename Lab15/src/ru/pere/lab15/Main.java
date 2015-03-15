package ru.pere.lab15;

import static java.lang.System.out;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		int[] m = new int[4];
		int min, max, summ = 0;
		String mass = "";
				
		out.println("Ведите четыре числа");
		
		for (int i=0; i<m.length; i++){
			out.printf("Число%d\n", i+1);
			m[i]=Integer.parseInt(reader.readLine());
			mass = mass+m[i]+" ";
		}
		min=m[0];
		max=m[0];
		for (int x : m){
			summ += x;
			if (min>x) min=x;
			if (max<x) max=x;
		}
		out.println("Вы ввели следующие числа: "+mass);
		out.printf("Минимальное число: %d\n"
				+ "Максимальное число: %d\n"
				+ "Среднее число: %g\n",
				min, max, (double)summ/m.length);
	}

}
