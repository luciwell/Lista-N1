package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner console= new Scanner(System.in);
		String nome;
		
		System.out.println("Informe seu nome");
		nome= console.next();
		
		for(int c =1;c <= 100;c++){
			System.out.println(nome);
		}
		
		
		

	}
}
