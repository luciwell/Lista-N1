package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int numero, qtd = 0;

		do {
			System.out.println("Informe número");
			numero = console.nextInt();
			if (numero > 0)

				qtd++;
		} while (numero > -1);
		System.out.println("Numeros digitados =" + qtd);

	}

}
