package ru.pere.lab22;

public class Main {
	
	public static final long STEPS = 1000000L;
	public static double Integral (double a, double b, MathFunction f){
		double h = (a-b)/STEPS;
		double summa = 0.0;
		for (long i = 0; i < STEPS; i++){
			double x = a+h*i+h/2;
			double y = f.F(x);
			summa += y*h;
		}
		return summa;
	}

	public static void main(String[] args) {
		double r = Integral(0, Math.PI/2);
		System.out.printf("Integral: %g", r);
	}

}
