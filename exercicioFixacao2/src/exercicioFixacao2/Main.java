package exercicioFixacao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//exercicio1 numero negativo
		int numero;
		numero = sc.nextInt();
		
		if (numero<0 ) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}

		// exercicio 02 ler inteiro e dizer se é par ou impar
		int numero2;
		numero2 = sc.nextInt();
		
		if (numero2 % 2 == 0) {
			System.out.println("PAR");
			}
		else {
			System.out.println("IMPAR");
		}
		
		//exercicio 3 ler inteiros A e B e mostrar se sao multiplos ou não sao multiplos
		
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A ==0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
		
		
		
	} 

}
