package application;
import java.util.Locale;
import java.util.Scanner;
import util.Poo4util;
public class Poo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		double result = Poo4util.dollarToReal(quantity, dollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
