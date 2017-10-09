package listaDeExerciciosN1;

import java.io.Console;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

import com.sun.media.sound.SimpleInstrument;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		 int numero , divisor ;
			
		System.out.println("Informe primeiro numero");
		
		 numero = console.nextInt();
		 
		System.out.println("Informe divisor");
		
		divisor = console.nextInt();
		
		int resto = numero % divisor;
			
		System.out.println(" Quociete " + numero / divisor + " Resto " + resto);					
				
		
		
		
				

	}

}
