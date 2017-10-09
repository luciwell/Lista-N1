package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int numero;
		float media, par = 0, imparporcento = 0, impar = 0, acumolado = 0, acumuladorpar = 0, maior = 0,
				menor = 0, mediapar, c = 0;

		do {
			System.out.println("Informe um numero inteiro");
			numero = console.nextInt();
			if (numero == 0) {
				System.out.println("FIM");
			} else if (numero > 0) {
				acumolado = acumolado + numero;
				if (numero > maior) {
					maior = numero;
					if (numero < 99999999) {
						menor = numero;
					}
				}

				if (numero % 2 == 0) {
					par++;
					acumuladorpar = acumuladorpar + numero;
				} else {
					impar++;
				}
				c++;
			} else {
				System.out.println("Numro invalido");
			}
		} while (numero != 0);
		media = acumolado / c;
		mediapar = (acumuladorpar / par);
		imparporcento = ((100 / c) * impar);
		System.out.println("A soma dos numeros digitados = " + acumolado);
		System.out.println("A quantidade de numeros digitados = " + c);
		System.out.println("A media dos numeros digitados = " + media);
		System.out.println("O maior numero digitado = " + maior);
		System.out.println("O menor numero digitado = " + menor);
		System.out.println("A media dos numeros par = " + mediapar);
		System.out.println("A porcentagem dos numeros impar digitados = " + imparporcento);

	}

}