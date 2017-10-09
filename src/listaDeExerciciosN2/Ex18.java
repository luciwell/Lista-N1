package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner console= new Scanner(System.in);
int senha1,senha2;


	System.out.println("Criar senha");
	senha1=console.nextInt();
	do{System.out.println("Senha?");
	senha2=console.nextInt();
	if(senha1==senha2){
		System.out.println("Senha correta!Bem vindo ao sistema");
	}else{
			System.out.println("Senha invalida tente novamente");
		}
	
}while(senha1!=senha2);
	}

}
