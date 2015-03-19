package ru.pere.lab18_2;

import static java.lang.System.out;

public class Circle extends Figure implements Scalable, Moveable {
	
	private Dot center;
	private int radius;
	//Inicialization constructor - the first constructor!
	{
		radius = 1;
	}
	
	public Dot getCenter() {
		return center;
	}

	public void setCenter(Dot center) {
		this.center = center;
	}
	
	public Circle(){
		
		center = new Dot();
		//out.println("Circle default constructor");
	}
	
	public Circle(int x, int y, int r){
		
		this();
		setX(x);
		setY(y);
		setRadius(r);
		//out.println("Circle constructor with three parameters x, y and r");
	}

	public Circle(Dot center, int r){
		this(center.x, center.y, r);
		//out.println("Circkle constructor with two parameters center and r");
	}
	
	public Circle(Circle c){
		this(c.getX(), c.getY(), c.getRadius());
		//out.println("Circkle constructor with one parameter circkle");
	}

	public void setRadius(int r) {
		
		if(r>0) this.radius = r;
	}

	public void setY(int y) {
		
		this.center.y = y;
	}

	public void setX(int x) {
		
		this.center.x = x;
	}

	public int getRadius() {
		
		return this.radius;
	}

	public int getY() {
		
		return this.center.y;
	}

	public int getX() {
		
		return this.center.x;
	}

	@Override
	public void drow() {
		out.println(this.toString());
		//super.drow();
	}

	@Override
	public String toString() {
		return String.format("Circle ("+getX()+","+getY()+")"+" radius: "+getRadius());
		//return super.toString();
	}

	@Override
	public void scale(double s) {
		
		radius *= s;
		
	}

	@Override
	public void Move(int x, int y) {
		
		center.Move(x, y);
			
	}

	

}
