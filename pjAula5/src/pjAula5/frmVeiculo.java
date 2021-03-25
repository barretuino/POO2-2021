package pjAula5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class frmVeiculo extends JFrame implements ActionListener{
	private Veiculo vetVeic[];
	private JPanel pnCampos, pnBotoes;
	private GridLayout gridCampos, gridBotoes;
	private JLabel lbPlaca, lbTransportadora, lbPesoB, lbPesoTara, lbPesoLiq, lbStatus;
	private JTextField txtPlaca, txtPesoB, txtPesoTara, txtPesoLiquido;
	private JComboBox cbxTransportadora;
	private JButton btCadastrar, btSair;
	
	public frmVeiculo(){
		super("Cadastro de Veículos");
		setSize(300,250);		
		setLocationRelativeTo(null);
		vetVeic = new Veiculo[100];
		
		pnCampos = new JPanel();
		pnBotoes = new JPanel();
		String vetTransp[] = {"Expresso Amparo", "Lubiani", "Três Irmãos"};
		
		lbPlaca = new JLabel("Placa");
		lbTransportadora = new JLabel("Transportadora");
		lbPesoB = new JLabel("Peso Bruto");
		lbPesoTara = new JLabel("Peso Tara");
		lbPesoLiq = new JLabel("Peso Líquido");
		
		//Aqui ficou fixa a posição
		lbStatus = new JLabel("LIBERADO");		
		//lbStatus.setBounds(ColunaX, LinhaY, ComprimentoX, AlturaY);
		lbStatus.setBounds(80, 165, 135, 22);
		lbStatus.setHorizontalAlignment(0);    	
		lbStatus.setFont(new java.awt.Font("Courier", 1, 24));
				
		//Cores dos campos
		int red, green, blue;
		red = 51;
		green = 51;
		blue = 153;

		lbStatus.setForeground(new Color(red,green,blue));
				
		txtPlaca = new JTextField(8);
		txtPesoB = new JTextField(8);
		txtPesoTara = new JTextField(8);
		txtPesoLiquido = new JTextField("12000",8);
		txtPesoLiquido.setEditable(false);
		cbxTransportadora = new JComboBox(vetTransp);
		
		btCadastrar = new JButton("Cadastrar");
		btCadastrar.setMnemonic('C');		
		btSair = new JButton("Sair");
		btSair.setMnemonic('S');
		
		gridCampos = new GridLayout(6,2);
		gridBotoes = new GridLayout(1,2);
		
		pnCampos.setLayout(gridCampos);
		pnBotoes.setLayout(gridBotoes);
		
		pnCampos.add(lbPlaca);
		pnCampos.add(txtPlaca);
		pnCampos.add(lbTransportadora);
		pnCampos.add(cbxTransportadora);
		pnCampos.add(lbPesoB);
		pnCampos.add(txtPesoB);
		pnCampos.add(lbPesoTara);
		pnCampos.add(txtPesoTara);
		pnCampos.add(lbPesoLiq);
		pnCampos.add(txtPesoLiquido);		
		add(lbStatus);
		
		pnBotoes.add(btCadastrar);
		pnBotoes.add(btSair);
		
		add(pnCampos,BorderLayout.CENTER);
		add(pnBotoes,BorderLayout.SOUTH);
		
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evento){
		
	}	
}