package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int A, B, C, maior = 0, menor = 0, inter = 0;

		System.out.println("Informe primeiro número");
		A = console.nextInt();
		System.out.println("Informe segundo número");
		B = console.nextInt();
		System.out.println("Informe terceiro número");
		C = console.nextInt();

		// menor//
		if (A < B && A < C) {
			menor = A;
		} else if (B < A && B < C) {
			menor = B;
		} else if (C < A && C < B) {
			menor = C;
		}

		// maior//
		if (A > B && A > C) {
			maior = A;
		} else if (B > A && B > C) {
			maior = B;
		} else if (C > B && C > A) {
			maior = C;
		}

		if ((A < B && A > C) || (A > B && A < C)) {
			inter = A;
		} else if ((B < A && B > C) || (B > A && B < C)) {
			inter = B;
		} else if ((C < A && C > B) || (C > A && C < B)) {
			inter = C;
		}
		System.out.println(" menor " + menor + " Inter " + inter + " Maior " + maior);
	}

}
