package application;
import java.util.Locale;
import java.util.Scanner;
import entities.exer3;
public class Poo3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		exer3 exe = new exer3();
		exe.name = sc.nextLine();
		exe.etapa1 = sc.nextDouble();
		exe.etapa2 = sc.nextDouble();
		exe.etapa3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", + exe.finalGrade());
		
		if (exe.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", exe.missingPoints());
			}
			else {
			System.out.println("PASS");
			}
		sc.close();
	}
}