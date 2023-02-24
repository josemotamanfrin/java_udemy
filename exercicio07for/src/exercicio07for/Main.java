package exercicio07for;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i<=N ; i++) {
			int cont = i;
			int cont1 = i*i;
			int cont2 = i*i*i;
			System.out.printf("%d %d %d%n", cont , cont1 , cont2);
			
		}
	}

}
