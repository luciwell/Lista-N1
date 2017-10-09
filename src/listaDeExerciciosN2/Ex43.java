package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		Scanner console =new Scanner(System.in);
		int vetor[]=new int[10],numero;
		
		for(int c =0;c<vetor.length;c++){
			System.out.println("informe um numero da posição "+(c+1));
			numero=console.nextInt();
			if(numero<0){
				vetor[c]=-1;
			}
			if(Math.sqrt(numero)>0){
				//Para ser exata o numero tem que ser double.
				vetor[c]= (int) Math.sqrt(numero);
			}
		}
		for(int c=0;c <vetor.length;c++ ){
			System.out.println("Vetor posição "+(c+1)+".Raiz"+vetor[c]);
		}

	}

}
