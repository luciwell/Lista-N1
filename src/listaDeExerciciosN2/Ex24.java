package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		int n;
		do{System.out.println("Informe numero");
		n=console.nextInt();
		if(n<0||n>10){
			System.out.println("Numero invalido");
		}
		}while(n<0||n>10);
		for(int c=1;c<=10;c++){
			System.out.println(n +" X "+ c +" = "+ n*c);
		}
		

	}

}
