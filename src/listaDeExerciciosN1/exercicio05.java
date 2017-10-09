package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Float base, altura;
		
		System.out.println("Informe base");
		
		base = console.nextFloat();
		
		System.out.println("Informe altura");
		
		altura = console.nextFloat();
		
		System.out.println("Area do retangulo" + base * altura + "e perimetro" + (2 * base + 2 * altura));
	}

}
