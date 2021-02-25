package br.fa4.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Conceito de Heran�a que existe de uma instancia de JFrame
 * @author Paulo Barreto
 * @date 24/02/2021
 */
public class frmEntrada extends JFrame{//� um
	private static final long serialVersionUID = 1L;
	
	//1� Passo - Declarar o objeto
	JButton btOk, btCancelar, btPesquisar; //Tem um

	public frmEntrada() {
		//Propriedades Visuais b�sicas
		setSize(300, 300);		
		setTitle("T�tulo do Frame");
		setLayout(new FlowLayout());
		
		//2� Passo - Instanciar o objeto
		btOk = new JButton("Confirmar");
		btCancelar = new JButton("Cancelar");
		btPesquisar = new JButton("Pesquisar");
		
		//3� Passo - Adicionar o Objeto ao JFrame
		add(btOk);
		add(btCancelar);
		add(btPesquisar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmEntrada formulario = new frmEntrada();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
