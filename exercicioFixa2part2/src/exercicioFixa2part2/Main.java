package exercicioFixa2part2;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		// exercicio 4 Leia hora inicial e hora final de um jogo ... calcule a duração dp jogo min 1 hora e max 24 horas
		
				int horaInicial, horaFinal, dia;
				horaInicial = sc.nextInt();
				horaFinal = sc.nextInt();
				dia = 24;
				
				if (horaInicial < horaFinal){
					System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
				}
				else {
					System.out.println("O JOGO DUROU " + (dia - (horaInicial - horaFinal)) + " HORA(S)");
				}
				// exercicio 05 ler codigo e a quantidade de um produto, calcular e mostrar
				
				int codigo , quantidade;
				codigo = sc.nextInt();
				quantidade = sc.nextInt();
				
				
				if (codigo == 1) {
					System.out.printf("Total: R$ %.2f " , (4.00 * quantidade));
				}
				else if (codigo == 2) {
					System.out.printf("Total: R$ %.2f " , (4.50 * quantidade));
   				}
					else if (codigo == 3) {
						System.out.printf("Total: R$ %.2f " , (5.00 * quantidade));
				 	}
					else if (codigo == 4) {
						System.out.printf("Total: R$ %.2f " , (2.00 * quantidade));
				 	}
					else if (codigo == 5) {
						System.out.printf("Total: R$ %.2f " , (1.50 * quantidade));
				 	}
				
				// exercicio 6 ler valor qualquer e dizer em qual inervalo se encontra [0,25],[25,50],[50,75],[75,10]
				
				double intervalo;
				intervalo = sc.nextDouble();
				if (intervalo < 0 || intervalo > 100) {
					System.out.println("Fora de intervalo");
				}
					
				else if (intervalo >= 0 && intervalo <= 25) {
					System.out.println("Intervalo (0 ,25]");
				}
				else if (intervalo > 25 && intervalo <= 50) {
					System.out.println("Intervalo (25 ,50]");
				}
				else if (intervalo > 50  && intervalo <= 75) {
					System.out.println("Intervalo (50 ,75]");
				}
				else if (intervalo > 75  && intervalo <= 100) {
					System.out.println("Intervalo (75 ,100]");
				}
				
				
				// exercicio 07 ler 2 valores com uma casa decimal (X e Y)
				double x , y;
				x = sc.nextDouble();
				y = sc.nextDouble();
				
				if(x == y && y == 0) {
					System.out.println("Origem");
				}
				else if(x > 0 && y > 0) {
					System.out.println("Q1");
				}
				else if(x < 0 && y > 0) {
					System.out.println("Q2");
				}
				else if(x < 0 && y < 0) {
					System.out.println("Q3");
				}
				else if(x > 0 && y < 0) {
					System.out.println("Q4");
				}
				
				// exercicio 08 imposto de renda
				double renda;
				renda = sc.nextDouble();
				
				if (renda <= 2000.00) {
					System.out.println("Isento");
				}
				else if (renda >= 2000.01 && renda <= 3000.00) {
					System.out.println("Isento");
				}
				else if (renda >= 2000.01 && renda <= 3000.00) {
					System.out.printf("R$ %.2f " ,((renda - 2000) * 0.08)  );
				}
				else if (renda >= 3000.01 && renda <= 4500.00) {
					System.out.printf("R$ %.2f " ,((renda - 3000 ) *  0.18 + 1000 * 0.08 )) ;
				}
				else if (renda > 4500 ) {
					System.out.printf("R$ %.2f ", ( 1000 * 0.08) + ( 1500 * 0.18 )+((renda- 4500) * 0.28));
				}
				
				
				
				sc.close();
	}

}