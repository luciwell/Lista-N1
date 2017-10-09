package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String letra;
		int somaG = 0, somaV = 0, somaO = 0, c = 0,pessoas=0;
		do {
			System.out.println("informe o time G-goias V-Vila Nova O-Outros e F-Fim");
			letra = console.next();
			if (letra.equalsIgnoreCase("G"))
				somaG++;
			else if (letra.equalsIgnoreCase("V")) {
				somaV++;
			} else if (letra.equalsIgnoreCase("O")) {
				somaO++;
			} else if (letra.equalsIgnoreCase("F")) {
				System.out.println("FIM!");
			} else {
				System.out.println("Letra invalida");
			}

			c++;

		} while (!letra.equalsIgnoreCase("F"));
		pessoas=somaG+somaV+somaO;
	System.out.println("Torcedores do Goias = "+ somaG);
	System.out.println("Torcedores do Vila Nova = "+somaV);
	System.out.println("Torcedores de outros times = "+somaO);
	System.out.println("Torcedores entrevistados = "+pessoas);

	}

}
