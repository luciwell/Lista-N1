package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Float temperaturaFahrenheit;
		
		System.out.println(" Informe temperatura  Fahrenheit");
		temperaturaFahrenheit = console.nextFloat();
		
		System.out.println("Temperatura Celsius" + ((temperaturaFahrenheit-32)*5/9));

	}

}
