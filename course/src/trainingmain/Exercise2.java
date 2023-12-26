package trainingmain;
import java.util.Locale;
import java.util.Scanner;
import trainingclass.Employee;
public class Exercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Type the employee's name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println("Employee: " + emp);
		
		System.out.println("Which percentage do you want to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println(" Updated salary: " + emp);
		

	}

}
