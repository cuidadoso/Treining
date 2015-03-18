package ru.pere.lab18_2;

import static java.lang.System.out;

import java.util.ArrayList;

public class Figure {
	
	private static ArrayList<Figure> figures = new   ArrayList<Figure>();
	
	public Figure(){
		figures.add(this);
		//out.println("Figure constructor without params");
	}
	
	public void drow(){
		out.println("Figure show (Method Figure.drow)");
	}
	
	public static void drowScene() {
		for (Figure f : figures) {
			f.drow();
			//out.println("Figure show list (Method drowScene)"+f.figures.indexOf(f));
		}
	}

}
