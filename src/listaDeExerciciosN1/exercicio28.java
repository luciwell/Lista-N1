package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio28 {

	public static void main(String[] args) {

		
		Scanner console = new Scanner(System.in);
		Double numero1, numero2, resultado;
		char operador;

		System.out.println("Informe primeiro n�mero");
		numero1 = console.nextDouble();

		System.out.println("Informe segundo n�mero");
		numero2 = console.nextDouble();

		System.out.println("Informe opera��o (+), (-),(*) ou (/)");
		operador = console.next().charAt(0);

		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			System.out.println(" Resultado " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println(" Resultado " + resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println(" Resultado " + resultado);
			break;
		case '/':
			if (numero2 == 0) {
				System.out.println("Opera��o impossivel");
			} else {
				resultado = numero1 / numero2;
				System.out.println(" Resultado " + resultado);
			}
			break;
		default:
			System.out.println("Opera��o invalida");
		}

	}

}