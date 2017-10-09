package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Informe numero");
			n = console.nextInt();
			if (n < 0) {
				System.out.println("Numero invalido");
			}
		} while (n < 0);
		for (int c = 1; c <= n; c++) {
			if (c % 2 == 0) {
				System.out.println(c + " Par");
			} else {
				System.out.println(c + " Impar");
			}
		}
	}

}
