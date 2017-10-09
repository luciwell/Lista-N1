package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int vetor[] = new int[10];
		int[] vetor2 = new int[10];
		int numero;

		for (int c = 0; c < vetor.length; c++) {
			do {
				System.out.println("informe um numero " + (c + 1));
				numero = console.nextInt();

			} while (numero % 2 == 0);
			if (numero % 2 != 0) {
				vetor[c] = numero;
			}
		}
		for (int c = 0; c < vetor2.length; c++) {
			do {
				System.out.println("Informe numero " + (c + 1));
				numero = console.nextInt();
			} while (numero % 2 == 0);
			if (numero % 2 != 0) {
				vetor2[c] = numero;
			}
		}
		for (int c = 0; c < vetor.length; c++) {
			System.out.println("Posição "+(c+1)+" "+vetor[c]);
		}
		for (int c = 0; c < vetor2.length; c++) {
			System.out.println("Posição "+(c+1)+" "+vetor2[c]);
		}
	}

}
