package listaDeExerciciosN2;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		double n1, n2, media, total = 0;
		int c = 0, apro = 0, exa = 0, repro = 0;
		String cont;

		do {
			do {
				System.out.println("Informe N1");
				n1 = console.nextDouble();
				if (n1 < 0 || n1 > 10) {
					System.out.println("Nota invalida");
				}
			} while (n1 < 0 || n1 > 10);
			do {
				System.out.println("Informe N2");
				n2 = console.nextDouble();
				if (n2 < 0 || n2 > 10) {
					System.out.println("Nota invalida");
				}
			} while (n2 < 0 || n2 > 10);
			media = (n1 + n2) / 2;
			total = total + media;
			System.out.println("Média = " + media);
			if (media < 3) {
				System.out.println("Reprovado");
				repro++;
			} else if (media >= 3 && media <= 7) {
				System.out.println("Exame");
				exa++;
			} else {
				System.out.println("Aprovado");
				apro++;
			}
			do {
				System.out.println("Continuar? SIM||NÂO");
				cont = console.next();
				if (!cont.equalsIgnoreCase("sim") && !cont.equalsIgnoreCase("não")) {
					System.out.println("Digite SIM ou NÂO?");
				}
			} while (!cont.equalsIgnoreCase("sim") && !cont.equalsIgnoreCase("não"));
			c++;
		} while (!cont.equalsIgnoreCase("não"));
		System.out.println("Total de alunos " + c+"\n");
		System.out.println("Quantidade de alunos :");
		System.out.println("Aprovados = " + apro);
		System.out.println("Exame = " + exa);
		System.out.println("Reprovados  = " + repro + "\n");
		System.out.println("Média da turma =" + total / c);

	}
}
