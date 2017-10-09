package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio14{

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double salario,lcdtv,lcd,led,plasma,cdtv,ledtv,plasmatv;
		
		
		System.out.println("informe salario");
		salario = console.nextDouble();
		
		System.out.println("informe qunatas LCD vendidas");
		lcdtv = console.nextDouble();
		
		System.out.println("informe quantas LED vendidas");
		ledtv = console.nextDouble();
		
		System.out.println("informe Quantas Plasmas vendidas");
		plasmatv = console.nextDouble();
		
		lcd = (lcdtv * 50);
		led = (ledtv * 60);
		plasma = (plasmatv * 75);
		
		System.out.println("O salario do funcionario é" + ((lcd + led + plasma) + (salario*2)));
		
		
		
		
		

	}

}