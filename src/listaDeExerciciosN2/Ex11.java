package listaDeExerciciosN2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int N, c = 0;
		float media, acumulador=0;
		String decidir;
		do {
			System.out.println("informe o valor de N");
			N = console.nextInt();
			acumulador = acumulador + N;
			c++;
			do {
				System.out.println("Deseja informar mais valores de N? sim / n�o");
				decidir = console.next();
				
				if (!decidir.equalsIgnoreCase("n�o") && !decidir.equalsIgnoreCase("sim")) {
					System.out.println("Digite sim ou n�o");
				}
			} while (!decidir.equalsIgnoreCase("n�o") && !decidir.equalsIgnoreCase("sim"));
			
		} while (!decidir.equalsIgnoreCase("n�o"));
		media = acumulador / c;
		System.out.println("Valores de N acumulados =" + acumulador);
		System.out.println("Media de N =" + media);
	}

}
