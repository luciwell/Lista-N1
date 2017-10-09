package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		double media, n1 = 0, n2 = 0;

		for (int c = 1; c <= 5; c++) {
			do {
				System.out.println("Informe nota 1");
				n1 = console.nextDouble();
				if (n1 < 0 || n1 > 10) {
					System.out.println("Nota invalida");
				}
			} while (n1 < 0 || n1 > 10);
			do {
				System.out.println("Informe nota 2");
				n2 = console.nextDouble();
				if (n2 < 0 || n2 > 10) {
					System.out.println("Nota invalida");
				}
			} while (n2 < 0 || n2 > 10);
			media = (n1 + n2) / 2;
			System.out.println("Aluno tem nota de = " + media);
			if(c==5){
				System.out.println("\n Fim");
			}

		}

	}

}
