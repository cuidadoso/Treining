package ru.pere.lab13;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		String s1="������";
		String s2="�����";
		s2 += "�";
		if (s1.equals(s2)) out.println("�����");
		else out.println("�� �����");

	}

}
