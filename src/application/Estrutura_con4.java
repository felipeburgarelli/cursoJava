package application;
import java.util.Scanner;

public class Estrutura_con4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y > x ) {
			int duracao = y - x;
			System.out.println("O jogo durou " + duracao + "Horas(s)");
		}
		else {
			int duracao = 24 - x + y;
			System.out.println("O jogo durou " + duracao + "Horas(s)");
		}
		sc.close();
	}

}
