package ru.pere.lab14;

import static java.lang.System.out;

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
		
		for (int i=0; i<names.length; i++) {
			if (!names[i].isEmpty()) out.println(names[i]);
		}

	}

}
