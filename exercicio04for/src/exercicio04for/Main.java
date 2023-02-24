package exercicio04for;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			int in1 = sc.nextInt();
			int in2 = sc.nextInt();
			
				if (in2 != 0) {
					double div = in1 / in2;
					System.out.printf("%.1f%n" ,div);
				
			}
				else if (in2 ==0){
					
					System.out.println("divisão impossivel");
			}
		}
	
		
		sc.close();
	}

}
