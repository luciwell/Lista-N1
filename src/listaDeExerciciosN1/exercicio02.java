package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
	
		String nome;
		
		System.out.println("Informe seu nome");

		nome = console.nextLine();
		
		int idade;
		
		System.out.println("Informe sua idade");
		
		idade = console.nextInt();
		
		System.out.println(" O usuario " + nome + " informou que tem " + idade + " anos ");
	}

}
