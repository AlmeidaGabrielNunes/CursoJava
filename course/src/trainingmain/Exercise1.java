package trainingmain;
import java.util.Locale;
import java.util.Scanner;

import trainingclass.Rectangle;
public class Exercise1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x; //n era necessário, declarar assim só quando vão ser criados mais de um objeto de uma vez. 
		x = new Rectangle();
		System.out.println("Enter the height and the width of the rectangle: ");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		System.out.println(x);
		
		sc.close();
	}

}
