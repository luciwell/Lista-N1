package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int numero = 0, par = 0, impar = 0;

		do {
			System.out.println("Informe o numero");
			numero = console.nextInt();

			if (numero == 0) {
				System.out.println("Fim");
			} else if (numero > 0) {
				if (numero % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} else {
				System.out.println("Numero invalido");
			}
		} while (numero != 0);
		System.out.println("Pares = "+par+" Impar = "+ impar);
		
	}
}
