package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Float salarioMinuimo,salarioEmpregado;
		
		System.out.println("Informe salario minimo");
		
		salarioMinuimo = console.nextFloat();
		
		System.out.println("Informe salario do empregado");
		
		salarioEmpregado = console.nextFloat();
		
		System.out.println(" O empregado recebe " + salarioEmpregado/ salarioMinuimo + " salario(s)minimo(s) ");
	}

}
