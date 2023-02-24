package exercicio47;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002){
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		//exercicio02
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 || y != 0 ) {
			if (x > 0 && y > 0 ) {
				System.out.println("primeiro");
			}
			
			else if (x > 0 && y < 0 ) {
				System.out.println("quarto");
			}
			else if (x < 0 && y > 0 ) {
				System.out.println("segundo");
		    }
			else if (x < 0 && y < 0 ) {
				System.out.println("terceiro");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
		
		sc.close();
		
		
	}

}
