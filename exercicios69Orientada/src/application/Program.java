package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		Student name = new Student();
		name.name = sc.next();
		name.nota1 = sc.nextDouble();
		name.nota2 = sc.nextDouble();
		name.nota3 = sc.nextDouble();
		
		System.out.println("Saida:");
		System.out.printf("FINAL GRADE = %.2f%n" , name.finalGrade());
		if (name.finalGrade() > 60.00) {
			System.out.printf("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n ", name.missingPoints());
		}
		
		
		
		sc.close();
		
	}

}
