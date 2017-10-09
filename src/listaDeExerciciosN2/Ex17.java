package listaDeExerciciosN2;

import java.util.Scanner;

import com.sun.webkit.dom.WheelEventImpl;

import jdk.nashorn.internal.ir.WhileNode;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		double media, nota1, nota2;
		String continuar, nome;

		do {
			System.out.println("Informe seu nome");
			nome = console.next();
			do {

				System.out.println("Informe a nota 1");
				nota1 = console.nextDouble();
				if (nota1 < 0 || nota1 > 10)
					System.out.println("Nota invalída");
			} while (nota1 < 0 || nota1 > 10);
			do {
				System.out.println("informe a nota 2");
				nota2 = console.nextDouble();
				if (nota2 < 0 || nota2 > 10)
					System.out.println("Nota invalída");
			} while (nota2 < 0 || nota2 > 10);

			media = (nota1 + nota2) / 2;
			System.out.println(nome);
			System.out.println("Nota A " + nota1);
			System.out.println("Nota B " + nota2);
			System.out.println("O aluno " + nome + ".Tem uma média " + media);
			do{
				System.out.println("Continuar SIM|NÃO ?");
				continuar = console.next();
				if (continuar.equalsIgnoreCase("sim") && continuar.equalsIgnoreCase("não")){
				System.out.println("Erro Sim ou Não");}
			} while (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("não"));
		} while (!continuar.equalsIgnoreCase("não"));

	}
}
