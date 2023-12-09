package application;
import java.util.Scanner;
import java.util.Locale;
public class Program {

	public static void main(String[] args) {
		// Define o Locale padrão para os Estados Unidos
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		double xA,xB,xC, yA,yB,yC;
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA +xB + xC)/2;
		double areaX = Math.sqrt(p * (p-xA) * (p-xB)* (p-xC));
		double py = (yA +yB + yC)/2;
		double areaY = Math.sqrt(py * (py-yA) * (py-yB)* (py-yC));
		
		System.out.printf("Triangle X area: %.4fn", areaX);
		System.out.printf("Triangle Y area: %.4fn", areaY);
		
		if (areaX > areaY) {
			System.out.println("The Larger area is: X");
		}else {
			System.out.println("The Larger area is: Y");
		}
		sc.close(); //fecha o scanner, não é obrigatório, mas faz parte das boas práticas
	}

}
