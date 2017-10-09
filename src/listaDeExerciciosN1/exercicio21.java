package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int tempo, h, m, s;

		System.out.println("Informe tempo em segundos");
		tempo = console.nextInt();

		h = (tempo / 60) / 60;
		m = (tempo / 60) % 60;
		s = (tempo % 60);

		System.out.println(" Hora " + h + " minutos " + m + " segundos " + s);

	}

}
