package ru.pere.lab12;

import static java.lang.System.out;

import java.io.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		Random r = new Random();
		int n = r.nextInt(100)+1;
		int k;
		out.println(n);
		out.println("�������� ����� �� 1 �� 100. ��� ������ 5 �������. ���� �� ������ �������, �� 0");
		int i = 5;
		do {
			k = Integer.parseInt(reader.readLine());
			i--;
			if (k==0) break;
			if (n>k) out.printf("������. �������� %d �������\n", i);
			if (n<k) out.printf("������. �������� %d �������\n", i);
		}
		 while(n!=k&&i!=0);
		if (i==0 && n!=k || k==0) out.println("�� ���������!");
		else out.printf("�� ��������. ����� ������� %d.", 5-i);

	}

}
