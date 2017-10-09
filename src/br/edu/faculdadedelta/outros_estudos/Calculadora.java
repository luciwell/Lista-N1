package br.edu.faculdadedelta.outros_estudos;

import java.util.Scanner;

public class Calculadora {

	/**
	 * Soma os dois números recebidos
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	/**
	 * Divide o primeiro número pelo segundo, desde que nenhum número seja zero
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

		System.out.println("Informe primeiro número");
		numero1 = console.nextDouble();

		System.out.println("Informe segundo número");
		numero2 = console.nextDouble();

		System.out.println("Informe operação (+), (-),(*) ou (/)");
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
				System.out.println("Operação impossivel");
			} else {
				resultado = numero1 / numero2;
				System.out.println(" Resultado " + resultado);
			}
			break;
		default:
			System.out.println("Operação invalida");
		}
	}
}
