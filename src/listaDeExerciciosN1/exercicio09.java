package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Double pre�oProduto, desconto;
		
		System.out.println("informe o pre�o do produto");
		pre�oProduto = console.nextDouble();
		
		System.out.println("Informe desconto");
		desconto = console.nextDouble();
		
		System.out.println(" Pre�o " + (pre�oProduto - (pre�oProduto*(desconto/100))));

	}

}
