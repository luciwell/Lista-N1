package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double prešoFabrica1,prešoFabrica2;
		
		System.out.println(" Qual o prešo da fabrica? ");
		prešoFabrica1 = console.nextDouble();
		
		prešoFabrica2 = prešoFabrica1* 0.30 + prešoFabrica1;
		
		System.out.println("Prešo do distribuidor " + (prešoFabrica2 + (prešoFabrica2 * 0.12)));

	}

}
