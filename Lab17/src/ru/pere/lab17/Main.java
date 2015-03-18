package ru.pere.lab17;

import static java.lang.System.out;
import ru.pere.lab17_2.*;

public class Main {

	public static void main(String[] args) {
				
		Person p1 = new Person("Alejandro", 39);
		Person p2 = p1;
		//p1.name="Alejandro";
		//p1.Age=39;
		//p2.Age = 4;
		out.printf("%s - %d\n", p1.getName(), p1.Age);
		Person.showTotal();
		
		int a = 5;
		int b = a;
		b = 7;
		
		out.printf("a = %d, b = %d\n", a, b);

		out.println("-=*************=-");
		Staff s1 = new Staff("Andry", 30, 45, 3000D);
		
		s1.setName("alexander");
		//s1.show();
		//Person p = new Person("Andry", 30);
		Object p = s1;
		out.println(p.toString());
		p = p1;
		out.println(p.toString());
		p = new Object();
		out.println(p.toString());
		//Person.Totals=100;
		out.println(Person.getTotals());
		
		SingleTone st1 = SingleTone.getInstance();
		SingleTone st2 = SingleTone.getInstance();
		st1.data="Hello";
		out.println(st2.data);
		
	}

}
