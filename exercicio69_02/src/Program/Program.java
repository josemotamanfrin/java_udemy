package Program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee salario = new Employee();
		System.out.println("Name:");
		salario.name = sc.next();
		System.out.println("Gross Salary:");
		salario.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		salario.tax = sc.nextDouble();
		
		System.out.printf("Employee: " + salario.name + ", $ " + salario.netSalary() );
		System.out.println();
		System.out.println("Witch percentage to increase salary? ");
		salario.percentage = sc.nextDouble();
		System.out.printf(" Updated data: " + salario);
		
		
		
		sc.close();

	}

}
