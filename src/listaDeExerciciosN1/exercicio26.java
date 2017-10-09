package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int A, B;

		System.out.println("Informe número");
		A = console.nextInt();

		System.out.println("Informe divizor");
		B = console.nextInt();

		if (A % B == 0) {
			System.out.println("O numero e divizivel");
		} else {
			System.out.println("Divizão impossivel");
		}

	}

}
