package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double dolar,cota��o;
		
		System.out.println("Informe quantos d�lares");
		dolar = console.nextDouble();
		
		System.out.println("Informe cota��o do d�lar em reais");
		cota��o = console.nextDouble();
		
		System.out.println("O volor de d�lar em reais � " + dolar*cota��o);
		
		

	}

}
