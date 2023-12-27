package trainingclass;

public class Aluno {
	public double grade1;
	public double grade2;
	public double grade3;
	public double media;
	public String name;
	
	public void calculate() {
		media = grade1 + grade2 + grade3;
	}
	
	public void cheking() {
		if (media >= 60) {
			System.out.println("Final Grade: " + media);
			System.out.println("Pass");
		}
		else {

			System.out.println("Final Grade: " + media);
			System.out.println("FAILED");
			System.out.println("MISSING: " + (60 - media));
		}
	}
	
}
