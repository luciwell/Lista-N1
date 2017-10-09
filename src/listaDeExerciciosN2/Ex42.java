package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int vetor[] = new int[10], maior = 0, menor = 0, p1 = 0, p2 = 0;

		for (int c = 0; c < vetor.length; c++) {
			System.out.println("Informe o numero " + (c + 1));
			vetor[c] = console.nextInt();
			if (c == 0) {
				menor = vetor[c];
				maior = vetor[c];
			}
			if (vetor[c] <= menor) {
				menor = vetor[c];
				p1 = (c + 1);
			}
			if (vetor[c] >= maior) {
				maior = vetor[c];
				p2 = (c + 1);
			}
		}
		System.out.println("O vetor maior é " + maior + " Posição " + p2 + '\n');
		System.out.println("O vetor menor é " + menor + " Posição " + p1 + '\n');

	}

}
