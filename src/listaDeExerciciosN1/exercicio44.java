package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio44 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int produto;

		System.out.println("Informe tipo do produto");
		produto = console.nextInt();

		if (produto == 1) {
			System.out.println("Alimento n�o-Perec�vel");
		} else if (produto >= 2 && produto <= 3) {
			System.out.println("Alimento Perec�vel");
		} else if (produto >= 5 && produto <= 6) {
			System.out.println("Vestu�rio");
		} else if (produto == 7) {
			System.out.println("Higiene pessoal");
		} else if (produto >= 8 && produto <= 15) {
			System.out.println("Limpeza e utens�lios dom�sticos");
		} else {
			System.out.println("Invalido");
		}

	}

}
