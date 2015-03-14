package ru.pere.lab10;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		
		String s="";
		int r=0;
		
		for (int i=1;i<=10;i++){
			for (int k=1;k<=10;k++){
				r=i*k;
				s=s+String.format("%2d*%2d=%3d  ", i, k, r);
			}
			out.println(s);
			s="";
		}

	}

}
