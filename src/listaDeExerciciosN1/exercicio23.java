package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int h, hd;

		System.out.println("Informe hora");
		h = console.nextInt();

		hd = ((h * 60) - 1460) + 1460;

		System.out.println("ja se passaram " + hd + " Minutos");

	}

}
