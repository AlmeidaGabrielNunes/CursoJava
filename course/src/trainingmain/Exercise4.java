package trainingmain;
import java.util.Locale;
import java.util.Scanner;
import trainingclass.CurrencyConverter;
public class Exercise4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double coin = sc.nextDouble();
		System.out.println("How many dollar will be bought?");
		double value = sc.nextDouble();
		double price = CurrencyConverter.convert(coin, value);
		
		System.out.printf("Amount to be paid in reais: %.2f%n " + price);
	}

}
