package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int s1 = 0, s2 = 0, s3 = 0, ano, livro, maior = 0, rednao = 0, totallivro = 0, media, porred;
		String gosta, continuar;
		do {
			do {
				System.out.println("Informe o ano em que você está: 1,2 ou 3 !");
				ano = console.nextInt();
				if (ano != 1 && ano != 2 && ano != 3) {
					System.out.println("Ano invalido! Digite 1,2 ou 3 !\n");
				}
			} while (ano != 1 && ano != 2 && ano != 3);
			do {
				System.out.println("Informe quantos livros você le !");
				livro = console.nextInt();
				if (livro < 0) {
					System.out.println("Invalido valor tem que ser positivo (+)\n");
				}
				totallivro = totallivro + livro;
			} while (livro < 0);
			do {
				System.out.println("Você gosta de fazer redação ? sim ou não");
				gosta = console.next();
				if (!gosta.equalsIgnoreCase("sim") && !gosta.equalsIgnoreCase("não")) {
					System.out.println("Digite sim ou não\n");
				}
			} while (!gosta.equalsIgnoreCase("sim") && !gosta.equalsIgnoreCase("não"));
			if (ano == 1) {
				s1++;
				if (gosta.equalsIgnoreCase("não")) {
					rednao++;
				}
			}
			if (ano == 2) {
				s2++;
				if (livro > maior) {
					maior = livro;
				}
			}
			if (ano == 3) {
				s3++;
			}
			do {
				System.out.println("Deseja continuar? sim ou não");
				continuar = console.next();
				if (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("não")) {
					System.out.println("Digite sim ou não!\n");
				}
			} while (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("não"));
		} while (continuar.equalsIgnoreCase("sim"));
		//medias e %.
		media = (totallivro / (s1 + s2 + s3));
		porred = (100 / s1) * rednao;
		System.out.println("A quantidade de alunos que está no terceiro ano = " + s3 + "\n");
		System.out
				.println("A maior quantidade de livros lidos por um aluno que está na segunda série = " + maior + "\n");
		System.out.println("A média de livros lidos pelos alunos (considerando todas as séries) = " + media + "\n");
		System.out.println(
				"A porcentagem de alunos que não gostam de fazer redação e que estão no primeiro ano = " + porred + " %\n");

	}

}
