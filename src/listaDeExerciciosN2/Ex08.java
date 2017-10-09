package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double divisor, inicio, fim;
		System.out.println("informe divisor");
		divisor = console.nextDouble();
		System.out.println("informe numero inicial");
		inicio = console.nextInt();
		System.out.println("informe numero final");
		fim = console.nextDouble();
		do {
			if (inicio % divisor == 0)
				System.out.print(inicio + " ");

			inicio++;
		} while (inicio != fim);

	}

}
