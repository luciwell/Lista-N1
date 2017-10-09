package br.edu.faculdadedelta.outros_estudos;

import javax.swing.JOptionPane;

public class Tela {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		String entrada = JOptionPane.showInputDialog("Informe o primeiro número");

		int num1 = new Integer(entrada);

		entrada = JOptionPane.showInputDialog("Informe o segundo número");

		int num2 = new Integer(entrada);

		JOptionPane.showMessageDialog(null, "A soma dos dois números é " + calc.somar(num1, num2));
		JOptionPane.showMessageDialog(null, "A divisão dos dois números é " + calc.dividir(num1, num2));

		String nome = JOptionPane.showInputDialog("Informe o primeiro nome");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome");

		String nomeCompleto = calc.montarNomeCompleto(nome, sobrenome);

		JOptionPane.showMessageDialog(null, nomeCompleto);

		int acaoDoUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?");

		// verifica se o usuário cliclou em "YES"
		if (acaoDoUsuario == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Banco de dados excluído");
		} else if (acaoDoUsuario == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Operação não foi executada");
		} else if (acaoDoUsuario == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Operação cancelada");
		}

		calc.exercicio28();
	}
}
