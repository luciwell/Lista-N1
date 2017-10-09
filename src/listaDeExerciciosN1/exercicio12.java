package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double numero1 , numero2 , numero3 , numero4;
		
		System.out.println("Informe preimeiro numero (Peso 1)");
		numero1 = console.nextDouble();
		System.out.println("Informe preimeiro numero (Peso 2)");
		numero2 = console.nextDouble();
		System.out.println("Informe preimeiro numero (Peso 3)");
		numero3 = console.nextDouble();
		System.out.println("Informe preimeiro numero (Peso 4)");
		numero4 = console.nextDouble();
		
		System.out.println("A media é " + numero1);
		System.out.println("A media é " + numero2*2);
		System.out.println("A media é " + numero3*3);
		System.out.println("A media é " + numero4*4);
		
		
		
		

	}

}
