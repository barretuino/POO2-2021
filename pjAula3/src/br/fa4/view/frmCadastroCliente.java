package br.fa4.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe de View que representa a GUI de Cadastro de Cliente
 * Versão em FlowLayout
 * @author Paulo Barreto
 * @date 10/03/2021
 */

public class frmCadastroCliente extends JFrame implements ActionListener{
	
	//1 Passo - Declaração dos Componentes
	JPanel painelForm, painelBotoes; //Container
	JLabel lbNome;
	JTextField txtNome;
	JButton btCadastrar;

	public frmCadastroCliente() {
		setSize(400,200);
		setTitle("Cadastro de Clientes");
		
		FlowLayout gerenciador = new FlowLayout();		
		setLayout(gerenciador);
		
		//2 Passo - Construção dos Componentes
		painelForm = new JPanel(); //FlowLayout está implicito
		painelBotoes = new JPanel();
		lbNome = new JLabel("Nome");
		txtNome = new JTextField(20);
		btCadastrar = new JButton("Cadastrar");
					
		//3 Passo - Adição dos componentes ao Container
		painelForm.add(lbNome);
		painelForm.add(txtNome);
		
		painelBotoes.add(btCadastrar);
		
		add(painelForm);
		add(painelBotoes);
		
		painelForm.setBackground(new Color(253, 151, 151));
		painelBotoes.setBackground(Color.blue);
		
		//Exemplo de modificação de Color
		txtNome.setBackground(new Color(255,222,173));
		
		setVisible(true);		
	}
	
	
	
	public static void main(String[] args) {
		frmCadastroCliente frm = new frmCadastroCliente();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("passou por aqui");
	}
}
