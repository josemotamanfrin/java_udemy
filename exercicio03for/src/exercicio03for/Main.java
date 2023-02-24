package exercicio03for;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
									
			for (int i=0; i<N; i++) {
				double in1 = sc.nextDouble();
				double in2 = sc.nextDouble();
				double in3 = sc.nextDouble();
				double media = ((in1*2) + (in2*3) + (in3*5))/10 ;
				System.out.printf("%.1f%n" ,media);
				
			}
			
			
			
			sc.close();
	}

}
