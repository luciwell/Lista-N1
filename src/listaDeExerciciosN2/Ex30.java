package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		double numero, aux = 0, n = 0;

		do {
			System.out.println("Informe numero");
			numero = console.nextDouble();
			if (numero < 0) {
				System.out.println("Numero invalido (+)");
			}
		} while (numero < 0);

		for (int c = 0; c <= numero; c++) {

			if (numero % c == 0) {
				aux = aux + c;
			}
		}
		if (aux == (numero + 1)) {
			System.out.println("Primo");
		} else {
			System.out.println("Não é primo");
		}

	}

}
