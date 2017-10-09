package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int numero,cc1=0,cc2=0;
		for (int c = 0; c < vetor1.length; c++) {
			System.out.println("Informe numero da posição " + (c + 1));
			numero = console.nextInt();
			vetor1[c]=numero;
		}
		for (int c = 0; c < vetor2.length; c++) {
			System.out.println("Informe numero da posição " + (c + 1));
			numero=console.nextInt();
			vetor2[c]=numero;
		}
		for (int c = 1; c <= 20; c++) {
			if (c % 2 == 0) {
				System.out.println(vetor1[cc1]+" Posiçãp "+c);
				cc1++;
			} else {
				System.out.println(vetor2[cc2]+" Posição "+c);
				cc2++;
			}
		}

	}

}
