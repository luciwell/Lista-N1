package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numero, maior = 0, menor = 0, c = 1, pos1 = 0, pos2 = 0, media = 0, total = 0;
		String continuar;
		do {
			do {
				System.out.println("informe um numero inteiro");
				numero = console.nextInt();
				total = total + numero;
				if (numero < 0) {
					System.out.println("Numero invalido tem que ser positivo!\n");
				}
			} while (numero < 0);
			if (c == 1) {
				maior = numero;
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;
				pos1 = c;
			}
			if (numero < menor) {
				menor = numero;
				pos2 = c;
			}
			System.out.println("Continuar? sim ou n�o?");
			continuar = console.next();
			if (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("n�o")) {
				System.out.println("Digite apenas sim ou n�o\n");
			}
			c++;
		} while (continuar.equalsIgnoreCase("sim"));
		media = (total / c);
		System.out.println("O mair numero �  = " + maior + " digitado na " + pos1 + "� vez \n");
		System.out.println("O menor numero � = " + menor + " digitado na " + pos2 + "� vez \n");
		System.out.println("quantidade de n�meros digitados = " + c);
		System.out.println("M�dia de n�meros digitados = " + media);

	}

}
