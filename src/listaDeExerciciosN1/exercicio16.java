package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double x1,x2,y1,y2;
		
		System.out.println("Informe valor distancia inicial X1");
		x1 = console.nextDouble();
		
		System.out.println("Informe valor distancia final X2");
		x2 = console.nextDouble();
		
		System.out.println("Informe valor distancia inicial Y1");
		y1 = console.nextDouble();
		
		System.out.println("Informe valor distancia Final Y2");
		y2 = console.nextDouble();
		
		System.out.println("A distancia é " + (Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2))));
		

	}

}
