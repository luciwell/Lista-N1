package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numero;

		System.out.println("informe número");
		numero = console.nextInt();

		if (numero < 0) {
			System.out.println("Negativo");
		} else if (numero > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Neutro");

		}

	}

}
