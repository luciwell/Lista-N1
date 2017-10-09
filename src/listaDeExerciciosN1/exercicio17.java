package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double dolar,cotação;
		
		System.out.println("Informe quantos dólares");
		dolar = console.nextDouble();
		
		System.out.println("Informe cotação do dólar em reais");
		cotação = console.nextDouble();
		
		System.out.println("O volor de dólar em reais é " + dolar*cotação);
		
		

	}

}
