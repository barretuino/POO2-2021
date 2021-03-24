package br.fa4.view;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.views.AbstractView;

import br.fa4.controller.TratamentoController;

/**
 * Tratamento de eventos em uma classe especializada
 * @author Paulo Barreto
 * @data 17/03/2020
 */

public class frmTratamentoEvento extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtTexto;
	
	public frmTratamentoEvento() {
		setTitle("Exemplo de Tratador de Ações");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		txtTexto = new JTextField(20);
		
		txtTexto.addActionListener(new TratamentoController());
		
		add(txtTexto);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmTratamentoEvento teste = new frmTratamentoEvento();
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}