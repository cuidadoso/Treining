package ru.pere.lab18_2;

import static java.lang.System.out;

public class Dot extends Figure {
	
	public static final int MAX_X = 1024;
	
	int x,y;

	// Dot is default constructor for class Dot. It initialize variables  x and y.
	public Dot(){
		x = 0;
		y = 0;
		//out.println("Dot default constructor");
	}
	
	public Dot(int x, int y){
		this.x=x;
		this.y=y;
		//out.println("Dot constructor with parameters x and y");
	}
	
	public Dot(Dot dot){
		this(dot.x, dot.y);
		//out.println("Dot constructor with parameter Dot");
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}
