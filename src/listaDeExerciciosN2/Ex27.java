package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int peso, numero = 0, maior = 0, menor = 0;

		for (int c = 1; c <= 5; c++) {
			do {
				System.out.println("Informe numero do boi");
				numero = console.nextInt();
				if (numero < 0) {
					System.out.println("Numero invalido não pode ser negativo");
				}
			} while (numero < 0);
			do {
				System.out.println("Informe peso");
				peso = console.nextInt();
				if (peso < 0) {
					System.out.println("Numero invalido não pode ser negativo");
				}
			} while (peso < 0);

			if (c == 1) {
				maior = peso;
				menor = peso;
			}
			if (peso < menor) {
				menor = peso;
			}
			if (peso > maior) {
				maior = peso;
			}

		}
		System.out.println(" Boi mais pesado = " + maior + "\n Boi mais magro = " + menor);
	}

}
