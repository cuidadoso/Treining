package ru.pere.lab14;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] m = new int[3];
		
		m[0] = 7;
		m[1] = 8;
		m[2] = 3;
		
		//String[] names = new String[3];
		
		String[] names = {"Сергей", "Константин", "Александр"};
		
		int[][] matrix = {{1, 2, 3},{4, 5}};
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++){
				out.printf("%3d",matrix[i][j]);
			}
			out.println();
		}
		
		for (int i=0; i<m.length; i++) {
			m[i]*=2;
		}
		
		for (int i=0; i<m.length; i++) {
			out.println(m[i]);
		}
		
		Arrays.sort(names);
		
		String[] names2 =	Arrays.copyOf(names, 2);
		String[] names3 =	Arrays.copyOfRange(names, 1, names.length);
				
		for (int i=0; i<names.length; i++) {
			if (!names[i].isEmpty()) out.println(names[i]);
		}
		out.println("   names2");
		for (String s : names2){
			out.println(s);
		}
		out.println("   names3");
		for (String s : names3){
			out.println(s);
		}
		out.println("  Коллекция");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		
		for (Integer o : list){
			out.println(o);
		}
	}

}
