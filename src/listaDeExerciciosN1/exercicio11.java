package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double raio;
		
		System.out.println("Qual o raio da esfera?");
		raio = console .nextDouble();
		
		System.out.println(" O volume da esfera é " + (4*Math.PI)*(Math.pow(raio, 3))/3);
		System.out.println(" Area da esfera é " + (Math.PI)*(Math.pow(raio, 2)));

	}

}
