package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double preçoProduto, desconto;
		
		System.out.println("informe o preço do produto");
		preçoProduto = console.nextDouble();
		
		System.out.println("Informe desconto");
		desconto = console.nextDouble();
		
		System.out.println(" Preço " + (preçoProduto - (preçoProduto*(desconto/100))));

	}

}
