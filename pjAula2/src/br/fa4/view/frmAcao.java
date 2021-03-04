package br.fa4.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Tratamento de Ação
 * @author Paulo Barreto
 * @date 03/03/2021
 */

public class frmAcao extends JFrame implements ActionListener {
	private static final long serialVersionUID = -1566910940802206606L;
	
	//1º Passo - Declaração
	JButton btAcao, btReacao;
	JTextField txtEntrada;
	
	public frmAcao() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		//2º Passo - Construção
		btAcao = new JButton("Ação");
		btReacao = new JButton("Reação");
		txtEntrada = new JTextField("Entre com os dados");
		
		//3º Passo - Adição na Frame
		add(txtEntrada);
		add(btAcao);
		add(btReacao);
		
		//4º Passo - Delegar ação
		btAcao.addActionListener(this);
		btReacao.addActionListener(this);
		txtEntrada.addActionListener(this);
		
		setVisible(true);
	}

	//Método que recebe as invocações de ação
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btAcao) {
			JOptionPane.showConfirmDialog(null, "Você invocou uma ação ");
		}else if(e.getSource() == txtEntrada){
			System.out.println(txtEntrada.getText());
		}else {
			JOptionPane.showMessageDialog(null, "Outra Ação", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void main(String[] args) {
		frmAcao acao = new frmAcao();
		acao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
