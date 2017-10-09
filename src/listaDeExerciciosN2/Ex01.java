package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int numero1 = 0, numero2 = 0, c = 0;

		System.out.println("Informe numero inicial");
		numero1 = console.nextInt();
		System.out.println("Informe numero final");
		numero2 = console.nextInt();
		c = numero1;

		do {
			if (numero1 >= numero2){
				System.out.println("numero invalido");}
			else {
				System.out.println(c);
			}

			c++;
		}while (c <= numero2);

	}

}
