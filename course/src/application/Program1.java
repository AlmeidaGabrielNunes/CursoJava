package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Products;
public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products products = new Products();
		System.out.println("Enter product Data: ");
		System.out.println("Name: ");
		products.name = sc.nextLine();
		System.out.println("Price: ");
		products.price = sc.nextDouble();
		System.out.println("Quantity: ");
		products.quantity = sc.nextInt();
		
	}

}
