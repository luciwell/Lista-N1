package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String nome, continuar;
		int idade = 0, c = 1;

		do {
			System.out.println("Informe seu nome");
			nome = console.next();
			do {
				System.out.println("Informe sua idade");
				idade = console.nextInt();
				if (idade < 0 || idade > 150) {
					System.out.println("Idade invalida");
				}

			} while (idade < 0 || idade > 150);
			do {
				System.out.println("Deseja continuar?  sim / n�o");
				continuar = console.next();
				if (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("n�o")) {
					System.out.println("Digite sim ou n�o");
				}
			} while (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("n�o"));
			System.out.println("O usuario "+nome+" tem "+idade+" anos");
		} while (!continuar.equalsIgnoreCase("n�o"));
	}

}
