package ru.pere.lab17_2;

import static java.lang.System.out;

import java.io.PrintStream;

public class Person {
	
	private static long Totals = 0;
	
	private String Name;
	public int Age;
	
	public Person(){
		out.println("Person ctor ()");
		Totals++;
	}
	
	public Person(String Name, int Age){
		this();
		this.Name=Name;
		this.Age=Age;
		System.out.println("Staff ctor (name, age)");
	}
	
	public static void showTotal (){
		out.printf("Total pesons: %d\n", Totals);
	}
	
	public void show (PrintStream s){
		s.printf(this.toString());
	}
	
	public void show(){
		// System.out.printf("%s - %d\n", Name, Age);
		this.show(System.out);
	}
	
	@Override
	public String toString() {
		return String.format ("%s - %d\n", Name, Age);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name.toUpperCase();
	}

	public static long getTotals() {
		return Totals;
	}
}
