package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	int n1=0,n2=0,aux=0;
	do {
		System.out.println("Informe numero inicial");
	    n1=console.nextInt();
	    if(n1<0){
	    	System.out.println("Numero invalido");
	    }
	}while (n1<0); 
		do {
		System.out.println("Informe numero final");
	    n2=console.nextInt();
	    if(n2<0){
	    	System.out.println("Numero invalido");
	    }
	}while (n2<0);
		for(int c=n1; c<=n2;c++){
			aux =aux+c;
			
		}
		System.out.println(aux);

	}

}
