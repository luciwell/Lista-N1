package br.edu.faculdadedelta.outros_estudos;

import java.util.Scanner;

public class Calculadora {

	/**
	 * Soma os dois n�meros recebidos
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	/**
	 * Divide o primeiro n�mero pelo segundo, desde que nenhum n�mero seja zero
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double dividir(double num1, double num2) {
		if (num1 == 0 || num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}
	
	/**
	 * Junta o nome com o sobrenome
	 * 
	 * @param nome
	 * @param sobrenome
	 * @return
	 */
	public String montarNomeCompleto(String nome, String sobrenome) {
		if (nome != null && sobrenome != null) {
			return nome + " " + sobrenome;
		} else {
			return "Nenhum nome definido";
		}
	}
	
	/**
	 * executa calculadora do exercicio28
	 */
	public void exercicio28 (){
		Scanner console = new Scanner(System.in);
		Double numero1, numero2, resultado;
		char operador;

		System.out.println("Informe primeiro n�mero");
		numero1 = console.nextDouble();

		System.out.println("Informe segundo n�mero");
		numero2 = console.nextDouble();

		System.out.println("Informe opera��o (+), (-),(*) ou (/)");
		operador = console.next().charAt(0);

		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			System.out.println(" Resultado " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println(" Resultado " + resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println(" Resultado " + resultado);
			break;
		case '/':
			if (numero2 == 0) {
				System.out.println("Opera��o impossivel");
			} else {
				resultado = numero1 / numero2;
				System.out.println(" Resultado " + resultado);
			}
			break;
		default:
			System.out.println("Opera��o invalida");
		}
	}
}
