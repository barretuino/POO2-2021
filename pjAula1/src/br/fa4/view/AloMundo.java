package br.fa4.view;

import javax.swing.JOptionPane;

/**
 * Exemplo de objetos gr�ficos do tipo GUI
 * @author Paulo Barreto
 *
 */

public class AloMundo {
	public static void main(String[] args) {
		String textoEntrada;
		
		//Entrada de Dados
		//textoEntrada = JOptionPane.showInputDialog("Informe um Texto", "Digite aqui....");
		
		//Sa�da de Dados
		//JOptionPane.showMessageDialog(null, "Voc� informou " + textoEntrada);
		
		JOptionPane.showMessageDialog(null, "Ol� Mundo");
		JOptionPane.showMessageDialog(null, "Ol� Mundo", "Aula 1 de POO 2", JOptionPane.WARNING_MESSAGE);
	}
}
