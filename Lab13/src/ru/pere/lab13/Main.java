package ru.pere.lab13;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		String s1="Привет";
		String s2="Приве";
		s2 += "т";
		if (s1.equals(s2)) out.println("Верно");
		else out.println("Не верно");

	}

}
