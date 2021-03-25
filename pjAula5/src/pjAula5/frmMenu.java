package pjAula5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Exemplo de um Menu para Sistema
 * @author Paulo Barreto
 * @date 24/03/2021
 */
public class frmMenu extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu menuPrincipal, menuLogistica;
	JMenuItem itemVeiculo, itemNotaFiscal, itemRecebimento;
	
	public frmMenu() {
		setTitle("Sistema de Informação");
		setSize(800, 600);
		setLayout(new FlowLayout());
		
		menuBar = new JMenuBar();
		
		setJMenuBar(menuBar);
		
		menuPrincipal = new JMenu("Cadastro");
		menuBar.add(menuPrincipal);
		
		menuLogistica = new JMenu("Logística");
		menuBar.add(menuLogistica);
		
		itemVeiculo = new JMenuItem("Veículo");
		itemVeiculo.addActionListener(this);
		menuPrincipal.add(itemVeiculo);
		
		itemNotaFiscal = new JMenuItem("Nota Fiscal");
		itemNotaFiscal.addActionListener(this);
		menuPrincipal.add(itemNotaFiscal);
		
		itemRecebimento = new JMenuItem("Recebimento");
		itemRecebimento.addActionListener(this);
		menuLogistica.add(itemRecebimento);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == itemVeiculo) {
			frmVeiculo frm = new frmVeiculo();
		}
	}
	
	public static void main(String[] args) {
		frmMenu frm = new frmMenu();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
