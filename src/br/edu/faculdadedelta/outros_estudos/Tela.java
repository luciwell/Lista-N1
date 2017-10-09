package br.edu.faculdadedelta.outros_estudos;

import javax.swing.JOptionPane;

public class Tela {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		String entrada = JOptionPane.showInputDialog("Informe o primeiro n�mero");

		int num1 = new Integer(entrada);

		entrada = JOptionPane.showInputDialog("Informe o segundo n�mero");

		int num2 = new Integer(entrada);

		JOptionPane.showMessageDialog(null, "A soma dos dois n�meros � " + calc.somar(num1, num2));
		JOptionPane.showMessageDialog(null, "A divis�o dos dois n�meros � " + calc.dividir(num1, num2));

		String nome = JOptionPane.showInputDialog("Informe o primeiro nome");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome");

		String nomeCompleto = calc.montarNomeCompleto(nome, sobrenome);

		JOptionPane.showMessageDialog(null, nomeCompleto);

		int acaoDoUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?");

		// verifica se o usu�rio cliclou em "YES"
		if (acaoDoUsuario == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Banco de dados exclu�do");
		} else if (acaoDoUsuario == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Opera��o n�o foi executada");
		} else if (acaoDoUsuario == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Opera��o cancelada");
		}

		calc.exercicio28();
	}
}
