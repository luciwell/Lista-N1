package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double preçoFabrica1,preçoFabrica2;
		
		System.out.println(" Qual o preço da fabrica? ");
		preçoFabrica1 = console.nextDouble();
		
		preçoFabrica2 = preçoFabrica1* 0.30 + preçoFabrica1;
		
		System.out.println("Preço do distribuidor " + (preçoFabrica2 + (preçoFabrica2 * 0.12)));

	}

}
