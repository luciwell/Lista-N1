package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numero, aux;

		System.out.println("Informe o numero");
		numero = console.nextInt();
		aux = numero;
		do {
			numero--;
			aux *= numero;

		} while (numero != 1);
		System.out.println(aux);

	}

}
