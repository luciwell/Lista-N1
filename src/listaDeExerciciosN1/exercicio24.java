package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double numero;

		System.out.println("Informe numero");
		numero = console.nextDouble();

		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");

		}

	}

}
