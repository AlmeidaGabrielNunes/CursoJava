package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
public class Program {

	public static void main(String[] args) {
		// Define o Locale padrão para os Estados Unidos
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		Triangle x,y; //declarando classe
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();
		
		double p = (x.a +x.b + x.c)/2;
		double areaX = Math.sqrt(p * (p-x.a) * (p-x.b)* (p-x.c));
		double py = (y.a +y.b + y.c)/2;
		double areaY = Math.sqrt(py * (py-y.a) * (py-y.b)* (py-y.c));
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("The Larger area is: X");
		}else {
			System.out.println("The Larger area is: Y");
		}
		sc.close();
	}

}
