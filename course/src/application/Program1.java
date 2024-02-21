package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Products;
public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product Data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		Double price = sc.nextDouble();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		Products products = new Products(name, price, quantity);
		System.out.println("Product data: "  +products);
		
		System.out.println("Enter the number of products to be added in  stock ");
		quantity = sc.nextInt();
		products.addProducts(quantity);
		
		System.out.println("Updated product data: " + products);
		
		System.out.println("Enter the number of products to be removed in stock");
		quantity = sc.nextInt();
		products.removeProducts(quantity);
		System.out.println("Updated product data: " + products);
		
		sc.close();
	}

}
