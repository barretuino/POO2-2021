package br.fa4.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.fa4.controle.ClienteController;
import br.fa4.modelagem.Cliente;

/**
 * Exemplo de GUI com Gerenciador de Layout BorderLayout
 * @author Paulo Barreto
 * @date 10/03/2021
 */

public class frmCadastroClientePlus extends JFrame implements ActionListener{
	//1 Passo - Declaração dos Componentes
		JPanel painelForm, painelBotoes; //Container
		JLabel lbNome, lbTelefone, lbEmail;
		JTextField txtNome, txtTelefone, txtEmail;
		JButton btCadastrar, btAlterar, btExcluir, btPesquisar, btImprimir;

		public frmCadastroClientePlus() {
			setSize(400,160);
			setTitle("Cadastro de Clientes plus");
			
			BorderLayout gerenciador = new BorderLayout();		
			setLayout(gerenciador);
			
			//2 Passo - Construção dos Componentes
			GridLayout gerenciadorPainel = new GridLayout(3, 2, 5, 5);
			painelForm = new JPanel(gerenciadorPainel); 
			
			GridLayout gridLayout = new GridLayout(1, 4, 5, 5);
			painelBotoes = new JPanel(gridLayout);			
			
			lbNome = new JLabel("Nome");
			
			lbTelefone = new JLabel("Telefone");
			lbEmail = new JLabel("Email");
			
			txtNome = new JTextField(20);
			txtTelefone = new JTextField(20);
			txtEmail = new JTextField(20);
			
			btCadastrar = new JButton("Cadastrar");
			btAlterar = new JButton("Alterar");
			btExcluir = new JButton("Excluir");
			btPesquisar = new JButton("Pesquisar");
			btImprimir = new JButton("Imprimir");
						
			//3 Passo - Adição dos componentes ao Container
			painelForm.add(lbNome);
			painelForm.add(txtNome);
			painelForm.add(lbTelefone);
			painelForm.add(txtTelefone);
			painelForm.add(lbEmail);
			painelForm.add(txtEmail);			
			
			painelBotoes.add(btCadastrar);
			painelBotoes.add(btAlterar);
			painelBotoes.add(btExcluir);
			painelBotoes.add(btPesquisar);
			painelBotoes.add(btImprimir);
			
			//4 Passo - Utilizado para delegar ações que desem ser tratadas
			btCadastrar.addActionListener(this);
			btAlterar.addActionListener(this);
			btExcluir.addActionListener(this);
			btPesquisar.addActionListener(this);
			btImprimir.addActionListener(this);
			
			add(painelForm, BorderLayout.CENTER);
			add(painelBotoes, BorderLayout.SOUTH);
			
			//painelForm.setBackground(new Color(253, 151, 151));
			//painelBotoes.setBackground(Color.blue);
			
			//Exemplo de modificação de Color
			//txtNome.setBackground(new Color(255,222,173));
			
			setVisible(true);		
		}
		
		public static void main(String[] args) {
			frmCadastroClientePlus frm = new frmCadastroClientePlus();
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public void actionPerformed(ActionEvent e) {
			ClienteController controller = new ClienteController();
			
			if(e.getSource() == btCadastrar) {
				Cliente entity = new Cliente();
				entity.setNome(txtNome.getText());
				entity.setTelefone(txtTelefone.getText());
				entity.setEmail(txtEmail.getText());
				
				controller.cadastrar(entity);
				JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
			}
			if(e.getSource() == btAlterar) {
				Cliente entity = new Cliente();
				entity.setNome(txtNome.getText());
				entity.setTelefone(txtTelefone.getText());
				entity.setEmail(txtEmail.getText());
				
				controller.alterar(entity);
				JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
			}
			if(e.getSource() == btExcluir) {
				JOptionPane.showMessageDialog(null, "Excluir método a desenvolver");
			}
			if(e.getSource() == btPesquisar) {
				JOptionPane.showMessageDialog(null, "Pesquisar método a desenvolver");
			}
			if(e.getSource() == btImprimir) {
				controller.imprimir();
			}
		}
}
