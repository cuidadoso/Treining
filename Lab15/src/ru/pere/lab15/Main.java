package ru.pere.lab15;

import static java.lang.System.out;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		int[] m = new int[4];
		int min, max, summ = 0;
		String mass = "";
				
		out.println("������ ������ �����");
		
		for (int i=0; i<m.length; i++){
			out.printf("�����%d\n", i+1);
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
		out.println("�� ����� ��������� �����: "+mass);
		out.printf("����������� �����: %d\n"
				+ "������������ �����: %d\n"
				+ "������� �����: %g\n",
				min, max, (double)summ/m.length);
	}

}
