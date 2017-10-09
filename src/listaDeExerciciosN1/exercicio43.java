package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio43 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double salario;
		char aumento;

		System.out.println("Informe o salário");
		salario = console.nextDouble();
		System.out.println("Informe tipo de almeto qe acordo com o quadro(1,2,3,4ou5)");
		aumento = console.next().charAt(0);

		switch (aumento) {
		case '1':
			System.out
					.println("Escrituario " + salario + " Aumento de 50% =" + (salario * 0.5) + " Aumento sobre salario");
			break;
		case '2':
			System.out
					.println("Secretario " + salario + " Aumento de 35% =" + (salario * 0.35) + " Aumento sobre salario");
			break;
		case '3':
			System.out.println("Caixa " + salario + " Aumento de 20% =" + (salario * 0.20) + " Aumento sobre salario");
			break;
		case '4':
			System.out.println("Gerente " + salario + " Aumento de 10% =" + (salario * 0.10) + " Aumento sobre salario");
			break;
		case '5':
			System.out.println("Diretor " + salario + " Aumento de 00% =" + (salario * 0.0) + " Aumento sobre salario");
			break;

		default:
			System.out.println("Cargo invalido");
			break;
		}

	}

}
