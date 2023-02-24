package Program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		Rectangle size = new Rectangle();
		size.height = sc.nextDouble();
		size.width = sc.nextDouble();
		System.out.printf("Area = %.2f%n" , size.area());
		System.out.printf("Perimetro = %.2f%n" , size.perimeter());
		System.out.printf("Diagonal = %.2f%n" , size.diagonal());
		
		
		sc.close();
	}

}
