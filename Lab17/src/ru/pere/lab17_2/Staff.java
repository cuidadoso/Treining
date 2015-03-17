package ru.pere.lab17_2;

public class Staff extends Person {
	
	public int Number;
	public double Salary;
	
	public Staff (String name, int age, int number, double salary) {
		super(name, age);
		this.Number = number;
		this.Salary = salary;
		System.out.println("Staff ctor");
	}
	/*
	@Override
	public void show() {
		System.out.printf(this.toString());
		//super.show();
	}
	*/
	@Override
	public String toString() {
		return String.format("%d - %g %s", this.Number, this.Salary, super.toString());
		
	}

}
