package primeira_aula;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int y = 32; // Declarando Variavel inteira
		double x = 10.35784; //Declarando Variavel ponto flutuante
		System.out.println(x);
		System.out.printf("%.2f%n",x);// Apenas 2 casas decimais
		System.out.println(y);
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);// Configurar localização, para usar ponto e não virgula.
		System.out.printf("%.4f%n",x);
		System.out.println("Resultado = " + x + "Metros");
		System.out.printf("Resultado = %.2f metros%n" , x);
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf(" %s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
