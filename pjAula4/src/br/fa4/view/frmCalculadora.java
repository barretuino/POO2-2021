package br.fa4.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmCalculadora extends JFrame implements ActionListener{
	JTextField txtValor;
	JButton [] vetBotoes = new JButton[5];
	String[] titulos = { "0", "1", "2", "+", "="};
	JPanel pnValor, pnBotoes;
	Double total = 0d;
	
	public frmCalculadora() {
		setTitle("Calculadora");
		setSize(500,500);
		setLayout(new BorderLayout());
		
		txtValor = new JTextField(20);
		pnValor = new JPanel(new FlowLayout());
		txtValor.setAlignmentX(RIGHT_ALIGNMENT);
		pnValor.add(txtValor);
		
		pnBotoes = new JPanel(new GridLayout(4,4));
		
		for(int i=0; i<5; i++) {
			vetBotoes[i] = new JButton(titulos[i]);
			vetBotoes[i].addActionListener(this);
			pnBotoes.add(vetBotoes[i]);
		}
		
		add(pnValor, BorderLayout.NORTH);
		add(pnBotoes, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<5;i++) {
			if(e.getSource() == vetBotoes[i]) {
				if(e.getActionCommand().equals("+") ){
					total += Double.parseDouble(txtValor.getText());
					txtValor.setText("");
				}else if(e.getActionCommand() == "=") {
					total += Double.parseDouble(txtValor.getText());
					txtValor.setText(Double.toString(total));
				}else{
					txtValor.setText(txtValor.getText() + titulos[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		frmCalculadora calc = new frmCalculadora();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
