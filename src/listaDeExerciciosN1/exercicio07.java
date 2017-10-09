package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Float valorDoProduto, desconto;
		
		System.out.println("Informe valor do rpoduto");
		
		valorDoProduto = console.nextFloat();
		
		System.out.println("Informe desconto");
		
		desconto = console.nextFloat();
		
		System.out.println(valorDoProduto - (desconto * valorDoProduto/100) + " Produto com desconto " );
		

	}

}
