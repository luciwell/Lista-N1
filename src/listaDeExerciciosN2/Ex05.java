package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int numero, c = 0;
		float soma=0, media;
		String continuar;
		do {
			System.out.println("informe o numero");
			numero = console.nextInt();
			soma = soma + numero;
			do {
				System.out.println("deseja continuar? sim/n�o");
				continuar = console.next();
				if (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("n�o")) {
					System.out.println("Digite sim ou n�o");
				}
			} while (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("n�o"));
			c++;
		} while (!continuar.equalsIgnoreCase("n�o"));
		media = soma / c;
		System.out.println("total de numeros digitados = " + c);
		System.out.println("soma dos numeros digitados = " + soma);
		System.out.println("media = " + media);

	}

}
