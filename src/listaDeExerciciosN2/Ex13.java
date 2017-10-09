package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Digite um numero de 1 a 5");
			numero = console.nextInt();
			if (numero >= 1 && numero <= 5) {
				System.out.println("Parabéns!");
				System.out.println("Número digitado foi " + numero);
			} else {
				System.out.println("Entrada invalida");
			}

		} while (numero < 1 || numero > 5);

	}

}
