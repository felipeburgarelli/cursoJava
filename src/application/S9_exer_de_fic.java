package application;
import java.util.Locale;
import java.util.Scanner;

import entities.S9_exer_fic;
public class S9_exer_de_fic {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		S9_exer_fic s9_exer_de_fic;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			s9_exer_de_fic = new S9_exer_fic(number, holder, initialDeposit);
		}
		else {
			s9_exer_de_fic = new S9_exer_fic(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(s9_exer_de_fic);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		s9_exer_de_fic.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(s9_exer_de_fic);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		s9_exer_de_fic.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(s9_exer_de_fic);
	
		sc.close();
	}

}
