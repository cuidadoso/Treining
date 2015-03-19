package ru.pere.lab19;

import static java.lang.System.out;

public class MyTest {
	
	public static class MyNested {
		public String nestedField = "Nested class";
		public void nestedShow(){
			out.println(nestedField);
		}
	}

	public class MyInner {
		public String innerField = "Inner class";
		public void innerShow(){
			out.println(innerField);
		}
	}
	
	public String outerField = "Test class (outer)";
	public void show(){
		out.println(outerField);
	}

}
