package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double pre�oFabrica1,pre�oFabrica2;
		
		System.out.println(" Qual o pre�o da fabrica? ");
		pre�oFabrica1 = console.nextDouble();
		
		pre�oFabrica2 = pre�oFabrica1* 0.30 + pre�oFabrica1;
		
		System.out.println("Pre�o do distribuidor " + (pre�oFabrica2 + (pre�oFabrica2 * 0.12)));

	}

}
