package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int idade, ano;
		String sexo, continuar, cidade;
		double pormulher = 0, porcidade = 0, pormenor = 0, menor = 0, pessoas = 0, condutores = 0, cid = 0, h = 0,
				m = 0, sp = 0, outro = 0;
		do {
			do {
				System.out.println("Informe ano de nascimento");
				ano = console.nextInt();
				idade = (2017 - ano);
				System.out.println("Sua idade é = " + idade);
				if (ano < 0 || ano > 2017) {
					System.out.println("Ano invalido");
				} else {
					condutores++;
				}
				if (idade < 25) {
					menor++;
				}

			} while (ano < 0 || ano > 2017);
			do {
				System.out.println("Inforeme Homem ou Mulher");
				sexo = console.next();
				if (!sexo.equalsIgnoreCase("Homem") && !sexo.equalsIgnoreCase("Mulher")) {
					System.out.println("Informe se é homem ou mullher");
				} else {
					pessoas++;
				}
				if (sexo.equalsIgnoreCase("Homem")) {
					h++;
				}
				if (sexo.equalsIgnoreCase("Mulher")) {
					m++;
				}

			} while (!sexo.equalsIgnoreCase("Homem") && !sexo.equalsIgnoreCase("Mulher"));

			do {
				System.out.println("Informe cidade- SP ou Outro");
				cidade = console.next();
				if (!cidade.equalsIgnoreCase("SP") && !cidade.equalsIgnoreCase("Outro")) {
					System.out.println("Informe apenas São Paulo ou Outro");
				} else {
					cid++;
				}
				if (cidade.equalsIgnoreCase("SP")) {
					sp++;
				}
				if (cidade.equalsIgnoreCase("Outro")) {
					outro++;
				}

			} while (!cidade.equalsIgnoreCase("SP") && !cidade.equalsIgnoreCase("Outro"));

			do {
				System.out.println("Deseja parar? Sim/Não");
				continuar = console.next();
				if (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("não")) {
					System.out.println("Informe apenas sim ou não");
				}
			} while (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("não"));

		} while (!continuar.equalsIgnoreCase("sim"));

		pormenor = ((100 / condutores) * menor);
		// pode usar os condutores ou cid no lugar de pessoas.
		pormulher = ((100 / pessoas) * m);
		// apenas valor de outros.
		porcidade = ((100 / cid) * outro);
		System.out.println(" Percentagem de motoristas com menos de 25 anos = " + pormenor+"%");
		System.out.println(" Percentagem de mulheres = " + pormulher+"%");
		System.out.println(" Percentagem de motoristas com registro fora de São Paulo = " + porcidade+"%");

	}

}
