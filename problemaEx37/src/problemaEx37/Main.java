package problemaEx37;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int minutos;
		minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0; // ou conta += (minutos -100)*2
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}

}
