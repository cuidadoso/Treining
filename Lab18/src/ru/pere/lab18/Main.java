package ru.pere.lab18;

import ru.pere.lab18_2.*;

public class Main {

	public static void main(String[] args) {
		Dot d1 = new Dot(100, 200);
		Circle c1 = new Circle(d1, 50);
		Figure.drowScene();
		c1.Move(10, 20);
		Figure.drowScene();
		//c1.scale(2);
		//Figure.drowScene();
		Figure.scaleScene(2);
	}

}
