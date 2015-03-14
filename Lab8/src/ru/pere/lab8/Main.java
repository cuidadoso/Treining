package ru.pere.lab8;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		out.print("Введите цифру ");
		String s = "";
		int a = Integer.parseInt(reader.readLine());
		
		switch (a) {
		case 0:
			s = "Нуль";
			break;
		case 1:
			s = "Один";
			break;
		case 2:
			s = "Два";
			break;
		case 3:
			s = "Три";
			break;
		case 4:
			s = "Четыре";
			break;
		case 5:
			s = "Пять";
			break;
		case 6:
			s = "Шесть";
			break;
		case 7:
			s = "Семь";
			break;
		case 8:
			s = "Восемь";
			break;
		case 9:
			s = "Девять";
			break;	
		default:
			s = "Не цифра";
		}
		out.println(s);
	}

}
