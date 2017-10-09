package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio45 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double dvd, tipo;
		char dia;

		System.out.println("Informe o valor do DVD em reais");
		dvd = console.nextDouble();
		System.out.println("Informe dia 1,2,3,4,5,6 ou 7");
		dia = console.next().charAt(0);
		System.out.println("Informe tipo de DVD 1-normal 2-Lançamento");
		tipo = console.nextDouble();
		if (tipo == 1) {
			tipo = dvd * 0;
		} else if (tipo == 2) {
			tipo = dvd * 0.15;
		} else {
			System.out.println("invalido");
		}
		switch (dia) {
		case '2':
		case '3':
		case '5':
			System.out.println("R$ = "+((dvd + tipo) - (dvd * 0.4)));
			break;
		case '1':
		case '4':
		case '6':
		case '7':
			System.out.println("R$ =" + (dvd + tipo));
			break;
		default:
			System.out.println("Dia invalido");
			break;
		}

	}

}
