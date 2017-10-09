package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int c = 1, idade = 0, menorIdade = 0, meiaIadade = 0, maiorIdade = 0;

		do {
			System.out.println("Informe sua idade");
			idade = console.nextInt();
			if (idade <= 18)
				menorIdade++;
			else if (idade > 18 && idade <= 65) {
				meiaIadade++;
			} else if (idade > 65) {
				maiorIdade++;
			} else {
				System.out.println("Idade invalida");
			}

			c++;

		} while (c <= 10);

		System.out.println("Até 18 anos " + menorIdade);
		System.out.println("Entre 18 e 65 anos " + meiaIadade);
		System.out.println("Mais de 65 anos " + maiorIdade);

	}

}
