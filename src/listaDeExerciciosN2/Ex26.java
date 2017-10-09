package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner console= new Scanner(System.in);
		int x,y, aux=1;
		System.out.println("Informe X");
		x=console.nextInt();
		System.out.println("Informe Y");
		y=console.nextInt();
		
		for(int c=1;c<=y;c++){
			aux*=x;
			
			
			
		}
		System.out.println("Potência ="+aux);

	}

}
