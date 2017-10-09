package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int vetor1[] = new int[10];
		int vetor2[] = new int[5];
		int numero;
		for (int c = 0; c < vetor1.length; c++) {
			System.out.println("Informe numeros para divider" + (c + 1));
			numero = console.nextInt();
			vetor1[c] = numero;
		}
		for (int c = 0; c < vetor2.length; c++) {
			System.out.println("Informe numeros divisores" + (c + 1));
			numero = console.nextInt();
			vetor2[c] = numero;
		}
		for (int cc = 0; cc < vetor2.length; cc++) {
					for (int c = 0; c < vetor1.length; c++) {
				if (vetor1[c] % vetor2[cc] == 0) {
					System.out.println("O " + vetor1[c] + " è divisivel pelo vetor " + vetor2[cc] + " na posição " + (cc+1));
				}
			}
		}

	}

}
