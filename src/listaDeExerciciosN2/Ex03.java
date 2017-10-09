package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int maior = 0, menor = 999999, numero = 0, c = 1, soma = 0, media;

		do {
			System.out.println("Informe um numero");
			numero = console.nextInt();
			soma = soma + numero;

			if (numero < menor) {
				menor = numero;
			} else if (numero > maior) {
				maior = numero;
			}

			c++;
		} while (c <= 10);
		media = soma / (c - 1);

		System.out.println("Maior " + maior);
		System.out.println("Menor " + menor);
		System.out.println("media " + media);
	}

}
