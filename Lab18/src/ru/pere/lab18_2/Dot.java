package ru.pere.lab18_2;

import static java.lang.System.out;

public class Dot extends Figure implements  Moveable{
	
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
	
	@Override
	public void drow() {
		//out.println(this.toString());
		//super.drow();
	}

	@Override
	public void Move(int x, int y) {
		
		this.x += x;
		this.y += y;
		
		class Local{
			
			private int x;
			
			Local(int x){
				this.x = x;
			}

			public int getX() {
				return x;
			}
			
		}
		
		Local l = new Local(10);
		int abc = l.getX();
		
		Scalable s = new Scalable(){

			@Override
			public void scale(double s) {
				System.out.println("Anonymous class");
				
			}
			
		}
		
	}

}
