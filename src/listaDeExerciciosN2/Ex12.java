package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner console= new Scanner(System.in);
int numero1=0 ,numero2=0,c;
System.out.println("Informe primeiro numero (Maior)");
numero1=console.nextInt();
System.out.println("informe segundo numero (Menor)");
numero2=console.nextInt();
do{
	if(numero1>numero2){
		numero1--;
		System.out.println(numero1);
	}else{
		System.out.println("Numero 1 menor que numero 2");
	}
	
}while(numero1>numero2);
	}

}
