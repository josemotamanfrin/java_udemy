package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// exercicio 01 exibir soma
		int x;
		int y;
		int z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
					
		System.out.println("SOMA = " + z );
		System.out.println();
		
		//exercicio 02 area  circulo
		 double p;
		 double r;
		 double Area;
		 p = 3.14159;
		 r = sc.nextDouble();
		 Area = (Math.pow(r, 2) * p);
		 
		 System.out.printf("A = %.4f" , Area);
		 System.out.println();
		 
		 // exercicio 3 DIFERENCA (A*B-C*D)
		 
		 int a;
		 int b;
		 int c;
		 int d;
		 int dif;
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 d = sc.nextInt();
		 dif = (a*b-c*d);
		 
		 System.out.println("DIFERENCA = " + dif);
		 System.out.println();
		 
		 //exercicio 4 Ler num de um funconario ,horas,  valor/hora e calcula salario. moste num e salario com 2 casas decimais
		 
		 int n ;
		 int h ;
		 double v ;
		 double s ;
		 n = sc.nextInt();
		 h = sc.nextInt();
		 v = sc.nextDouble();
		 s = (h * v);
		 
		 System.out.println("NUMBER = "+ n);
		 System.out.printf("SALARY = U$ %.2f%n" , s );
		 
		 // Exercicio 5 ler codigo de uma peca, numero de pecas, valor da peca...
		 
		 int c1 , p1;
		 int c2 , p2; 
		 double v1, v2;
		 double valor;
		 c1 = sc.nextInt();
		 p1 = sc.nextInt();
		 v1 = sc.nextDouble();
		 c2 = sc.nextInt();
		 p2 = sc.nextInt();
		 v2 = sc.nextDouble();
		 valor = ((p1 * v1)+(p2*v2));
		 
		 System.out.printf("VALOR A APAGAR: R$ %.2f%n", valor);
		 System.out.println();
		 
		 // Exercicio 6 ler 3 valores double/float  A,B,C e mostre area Triangulo, circulo, trapezio, quadrado, retangulo.
		 
		 double A, B, C;
		 A = sc.nextDouble();
		 B = sc.nextDouble();
		 C = sc.nextDouble();
		 double triangulo, circulo, trapezio, quadrado, retangulo;
		 
		 triangulo = ((A*C)/2) ;
		 circulo = (3.14156*(Math.pow(C, 2)));
		 trapezio = (((A + B)*C)/2);
		 quadrado = Math.pow(A, 2);
		 retangulo = (A*B);
		 
		 System.out.printf("TRIANGULO: %.3f%n", triangulo);
		 System.out.printf("CIRCULO: %.3f%n", circulo);
		 System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		 System.out.printf("QUADRADO: %.3f%n", quadrado);
		 System.out.printf("RETANGULO: %.3f%n", retangulo );
		 System.out.println();
		 
		 
		 
		 
		 
				
		 
		
		
		sc.close();

	}

}
