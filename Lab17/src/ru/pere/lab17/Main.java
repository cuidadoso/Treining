package ru.pere.lab17;

import static java.lang.System.out;
import ru.pere.lab17_2.*;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = p1;
		p1.name="Alejandro";
		p1.Age=39;
		p2.Age = 4;
		out.printf("%s - %d\n", p1.name, p1.Age);
		
		int a = 5;
		int b = a;
		b = 7;
		
		out.printf("a = %d, b = %d\n", a, b);

	}

}
