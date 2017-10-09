package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double n = 0, aux = 0;
		do {
			System.out.println("Informe um numero(+)");
			n = console.nextDouble();
						if (n < 0) {
				System.out.println("Numero invalido (+)");
			}
		} while (n < 0);

		for (int c = 0; c < n; c++) {
			
			if (n % c == 0) {
				aux = aux + c;
			}
		}
		if (aux == n) {
			System.out.println("Numero perfeito " + aux);
		} else {
			System.out.println("Numero imperfeito " + aux);
		}
	}

}
