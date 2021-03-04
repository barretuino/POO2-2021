package br.fa4.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Tratamento de A��o
 * @author Paulo Barreto
 * @date 03/03/2021
 */

public class frmAcao extends JFrame implements ActionListener {
	private static final long serialVersionUID = -1566910940802206606L;
	
	//1� Passo - Declara��o
	JButton btAcao, btReacao;
	JTextField txtEntrada;
	
	public frmAcao() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		//2� Passo - Constru��o
		btAcao = new JButton("A��o");
		btReacao = new JButton("Rea��o");
		txtEntrada = new JTextField("Entre com os dados");
		
		//3� Passo - Adi��o na Frame
		add(txtEntrada);
		add(btAcao);
		add(btReacao);
		
		//4� Passo - Delegar a��o
		btAcao.addActionListener(this);
		btReacao.addActionListener(this);
		txtEntrada.addActionListener(this);
		
		setVisible(true);
	}

	//M�todo que recebe as invoca��es de a��o
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btAcao) {
			JOptionPane.showConfirmDialog(null, "Voc� invocou uma a��o ");
		}else if(e.getSource() == txtEntrada){
			System.out.println(txtEntrada.getText());
		}else {
			JOptionPane.showMessageDialog(null, "Outra A��o", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void main(String[] args) {
		frmAcao acao = new frmAcao();
		acao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
