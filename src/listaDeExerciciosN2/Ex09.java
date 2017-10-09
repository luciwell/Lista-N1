package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int crescente = 0, decrescente=300;
		do {
			crescente++;
			System.out.println(crescente+",");
		} while (crescente != 300);
		
		do{
			decrescente--;
			System.out.println(decrescente);
		}while(decrescente!=1);
		
		
	}

}
