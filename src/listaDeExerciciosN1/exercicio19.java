package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double tempo,velocidade,distancia;
		
	System.out.println("Informe o tempo da viagem em Horas");
	tempo = console.nextDouble();
	
	System.out.println("Informe a velocidade em Km/h");
	velocidade = console.nextDouble();
	
	distancia = tempo * velocidade;
	
	System.out.println(" A viagem gastara " + distancia/12 + " Litros ");
	

	

	}

}
