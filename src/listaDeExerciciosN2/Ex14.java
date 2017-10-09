package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int idade = 0, maior = 0, menor = 150, c = 0;
		float media, acumulador = 0;

		do {
			System.out.println("Informe a idade");
			idade = console.nextInt();

			if (idade == 0) {
				System.out.println("Fim");
			} else if (idade > 0) {

				acumulador = acumulador + idade;
				c++;
				if (idade > maior)
					maior = idade;
				if (idade < menor)
					menor = idade;
			} else {
				System.out.println("Idade invalida");
			}

		} while (idade != 0);
		media = acumulador / c;

		System.out.println("Numero de pessoas " + c);
		System.out.println("Maior idade " + maior);
		System.out.println("Menor idade " + menor);
		System.out.println("Média " + media);
	}
}
