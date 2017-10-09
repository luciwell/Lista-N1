package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int vetor[] = new int[10], numero;
		boolean op = false;

		for (int c = 0; c < vetor.length; c++) {
			System.out.println("Informe numero " + (c + 1));
			vetor[c] = console.nextInt();
		}
		System.out.println("Informe numero procurado");
		numero = console.nextInt();
		for (int c = 0; c < vetor.length; c++) {
			if (vetor[c] == numero) {
				System.out.println("O numero " + numero + " Está na posição " + (c + 1));
				op = true;

			}
		}
		if (!op) {
			System.out.println("O numero " + numero + " Não está no vetor");
		}

	}

}
