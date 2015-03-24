package ru.pere.Lab30;

import static java.lang.System.out;

import java.io.Serializable;

public class PersonInfo implements Serializable {
	
	String name;
	int age;
	
	//{
	//	out.println("PersonInfo initialize");
	//}
	
	public PersonInfo(){
		out.println("PersonInfo DEFAULY constructor");
	}
	
	public PersonInfo(String name, int age){
		this.name = name;
		this.age = age;
		//out.println("Extended PersonInfo constructor");
	}
	
	public void showInfo(){
		out.printf("Name: %s. Age: %d.\n", this.name, this.age);
	}

}
