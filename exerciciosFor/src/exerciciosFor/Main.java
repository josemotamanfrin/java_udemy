package exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		// exercicio 02
		
		int N = sc.nextInt();
				
		int in = 0;
		int out = 0;
		
		for (int i= 0 ; i <= N ; i++) {
			int X = sc.nextInt();
			if (X >= 10 && X <=20) {
				in += 1;
				
			}
			else {
			out += 1;
			
				}
			System.out.println(in + " in");
			System.out.println(out + " out");
			}
		
		
			
		sc.close();
		}

		
		
	}


