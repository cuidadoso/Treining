package ru.pere.lab8;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		out.print("������� ����� ");
		String s = "";
		int a = Integer.parseInt(reader.readLine());
		
		switch (a) {
		case 0:
			s = "����";
			break;
		case 1:
			s = "����";
			break;
		case 2:
			s = "���";
			break;
		case 3:
			s = "���";
			break;
		case 4:
			s = "������";
			break;
		case 5:
			s = "����";
			break;
		case 6:
			s = "�����";
			break;
		case 7:
			s = "����";
			break;
		case 8:
			s = "������";
			break;
		case 9:
			s = "������";
			break;	
		default:
			s = "�� �����";
		}
		out.println(s);
	}

}
