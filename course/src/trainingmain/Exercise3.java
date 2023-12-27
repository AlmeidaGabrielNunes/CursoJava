package trainingmain;
import java.util.Scanner;
import trainingclass.Aluno;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Student name :");
		aluno.name = sc.nextLine();
		System.out.println("Insert first grade (should be between 0 and 30");
		aluno.grade1 = sc.nextDouble();
		System.out.println("Insert second grade (should be between 0 and 35");
		aluno.grade2 = sc.nextDouble();
		System.out.println("Insert third grade (should be between 0 and 35");
		aluno.grade3 = sc.nextDouble();
		
		aluno.calculate();
		aluno.cheking();
		
		sc.close();
	}

}
