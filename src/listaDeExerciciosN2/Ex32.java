package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int idade, cd1 = 0, cd2 = 0, cd3 = 0, m = 0, h = 0, h1 = 0, h2 = 0, h3 = 0, id1 = 0, id2 = 0, id3 = 0,
				candidato, media;
		String genero, continuar;

		do {
			do {
				System.out.println("Informe sua idade");
				idade = console.nextInt();
				if (idade < 0) {
					System.out.println("Idade invalida");
				}
			} while (idade < 0);
			do {
				System.out.println("Informe se voce e homem(H) ou Mulher (M)");
				genero = console.next();
				if (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
					System.out.println("Infoeme (M) ou (H)");
				}
			} while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
			do {
				System.out.println("Informe candidato 1,2 ou 3");
				candidato = console.nextInt();
				if (candidato != 1 && candidato != 2 && candidato != 3) {
					System.out.println("Candidato invalido 1,2 ou 3");
				}
				if (candidato == 1) {
					cd1++;
					id1 = id1 + idade;
					if (genero.equalsIgnoreCase("H")) {
						h1++;
					}
				}
				if (candidato == 2) {
					cd2++;
					id2 = id2 + idade;
					if (genero.equalsIgnoreCase("H")) {
						h2++;
					}
				}
				if (candidato == 3) {
					id3 = id3 + idade;
					cd3++;
					if (genero.equalsIgnoreCase("H")) {
						h3++;
					}
				}

			} while (candidato != 1 && candidato != 2 && candidato != 3);
			do {
				System.out.println("Deseja continuar? SIM ou NÃO");
				continuar = console.next();
				if (!continuar.equalsIgnoreCase("SIM") && !continuar.equalsIgnoreCase("NÃO")) {
					System.out.println("Infoeme SIM ou NÃO");
				}
			} while (!continuar.equalsIgnoreCase("SIM") && !continuar.equalsIgnoreCase("NÃO"));

		} while (continuar.equalsIgnoreCase("SIM"));
		if (cd1 > cd2 && cd1 > cd3) {
			media = id1 / cd1;
			System.out.println("O candidato 1 foi o mais votado. com = " + cd1 + " Votos \n" + " Candidato 2 = " + cd2
					+ " Votos \n" + " Candidato 3 = " + cd3 + " Votos \n");
			System.out.println("Media de idade dos seus candidaros = " + media + "\n");
		} else if (cd2 > cd1 && cd2 > cd3) {
			media = id2 / cd2;
			System.out.println("O candidato 2 foi o mais votado. com = " + cd2 + " Votos \n" + " Candidato 1 = " + cd1
					+ " Votos \n" + " Candidato 3 = " + cd3 + " Votos \n");
			System.out.println("Media de idade dos seus candidaros = " + media + "\n");
		} else if (cd3 > cd1 && cd3 > cd2) {
			media = id3 / cd3;
			System.out.println("O candidato 3 foi o mais votado. com = " + cd3 + " Votos \n" + " Candidato 1 = " + cd1
					+ " Votos \n" + " Candidato 2 = " + cd2 + " Votos \n");
			System.out.println("Media de idade dos seus candidaros = " + media + "\n");
		} else {
			System.out.println("Empate");
		}
		if (h1 > h2 && h1 > h3) {
			System.out.println("O candidato 1 é preferido dos homens");
		} else if (h2 > h1 && h2 > h3) {
			System.out.println("O candidato 2 é preferido dos homens");
		} else if (h3 > h1 && h3 > h2) {
			System.out.println("O candidato 3 é preferido dos homens");
		} else {
			System.out.println("Empate");
		}

	}

}
