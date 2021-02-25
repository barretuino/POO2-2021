package br.fa4.view;

import javax.swing.JOptionPane;

/**
 * Exemplo de objetos gráficos do tipo GUI
 * @author Paulo Barreto
 *
 */

public class AloMundo {
	public static void main(String[] args) {
		String textoEntrada;
		
		//Entrada de Dados
		//textoEntrada = JOptionPane.showInputDialog("Informe um Texto", "Digite aqui....");
		
		//Saída de Dados
		//JOptionPane.showMessageDialog(null, "Você informou " + textoEntrada);
		
		JOptionPane.showMessageDialog(null, "Olá Mundo");
		JOptionPane.showMessageDialog(null, "Olá Mundo", "Aula 1 de POO 2", JOptionPane.WARNING_MESSAGE);
	}
}
