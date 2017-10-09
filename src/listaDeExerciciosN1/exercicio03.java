package listaDeExerciciosN1;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Nome e sobrenome marido");
		
		String nomeDoMarido = console.nextLine();
				
		System.out.println(" Nome e sobrenome esposa");
		
		String nomeDaEsposa = console.nextLine();
		
		System.out.println("Ano do casamento");
		
		int anoCasamento = console.nextInt();
		
		int anosTotalCasamento = 2017 - anoCasamento;
		
		System.out.println(nomeDoMarido + " e casado com " + nomeDaEsposa + " há " + anosTotalCasamento + " ano(s) ");
		
	}

}
