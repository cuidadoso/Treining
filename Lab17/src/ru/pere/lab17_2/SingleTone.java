package ru.pere.lab17_2;

public class SingleTone {
	
	public String data;
	private static SingleTone instance;
	
	private SingleTone(){
		this.data="Hola";
	}
	
	public static SingleTone getInstance(){
		
		if (instance==null)
			instance = new SingleTone();
		return instance;
	}

}
