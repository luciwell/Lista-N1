package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double numero = 0, aux = 0;
		do {
			System.out.println("Informe um numero");
			numero = console.nextDouble();
			if (numero < 0) {
				System.out.println("Informe um numero positivo(+)\n");
			}
		} while (numero < 0);
		for (int c = 1; c <= numero; c++) {
			aux = 0;
			for (int cc = 1; cc < c; cc++) {
				if (c % cc == 0) {
					aux = aux + cc;

				}
			}
			if (aux == c) {
				System.out.println("O numero " + aux + "é perfeito");
			}

		}

	}

}
