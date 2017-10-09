package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double terreno, contrido;

		System.out.println("Informe tamanho do terreno");
		terreno = console.nextDouble();

		System.out.println("Informe tamanho contrido");
		contrido = console.nextDouble();

		System.out.println("Valor do importo " + (((terreno - contrido) * 3.80) + (contrido * 5.00)));

	}

}
