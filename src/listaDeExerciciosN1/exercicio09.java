package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double prešoProduto, desconto;
		
		System.out.println("informe o prešo do produto");
		prešoProduto = console.nextDouble();
		
		System.out.println("Informe desconto");
		desconto = console.nextDouble();
		
		System.out.println(" Prešo " + (prešoProduto - (prešoProduto*(desconto/100))));

	}

}
