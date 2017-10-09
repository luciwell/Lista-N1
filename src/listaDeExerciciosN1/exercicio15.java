package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio15{

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		float x,y;
		
		System.out.println("informe valor de (x)");
		x = console.nextFloat();
		System.out.println("informe valor de (y)");
		y = console.nextFloat();
		
		System.out.println("Resultado" + (2 * ((Math.sqrt(3*x + 30))/3) + (Math.pow(y-32, 4))));

	}

}
