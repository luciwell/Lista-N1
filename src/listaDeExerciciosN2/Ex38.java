package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double numero, aux = 0;
		do {
			System.out.println("informe numero");
			numero = console.nextDouble();
			if (numero < 0) {
				System.out.println("Informe numero positivo(+)\n");
			}
		} while (numero < 0);

		for (int c = 1; c <= numero; c++) {
			aux = 0;
			for (int cc = 1; cc <= c; cc++) {
				if (c % cc == 0) {
					aux = aux + cc;
				}
			}
			if (aux == (c + 1)) {
				System.out.println("Numero primo = " + c);
			}

		}

	}

}
