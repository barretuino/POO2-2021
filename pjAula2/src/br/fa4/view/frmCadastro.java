package br.fa4.view;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
//Para organizar os import CRTL+SHIFT+O
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.fa4.modelagem.Status;

public class frmCadastro extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//1� Passo - Declara��o do componentes
	JLabel lbCodigo, lbTitulo, lbPreco, lbStatus, lbAutor;
	JTextField txtCodigo, txtTitulo, txtPreco, txtAutor;
	JButton btCadastrar, btAlterar, btExcluir, btPesquisar;
	JComboBox<String> cbxStatus;
	JTextArea txaMensagem;
	JScrollPane scrPane;
	JPanel panel;

	public frmCadastro() {
		//Largura e do Comprimento
		setSize(500,180);
		//Defini��o do T�tulo
		setTitle("Cadastro de Livros");		
		//Determinar o Gerenciador de Layout
		setLayout(new FlowLayout());
				
		//2� Passo - Construir o componentes
		lbCodigo = new JLabel("C�digo");
		txtCodigo = new JTextField(10);
		lbTitulo = new JLabel("T�tulo");
		txtTitulo = new JTextField(10);
		lbPreco = new JLabel("Pre�o");
		txtPreco = new JTextField(10);
		lbAutor = new JLabel("Autor");
		txtAutor = new JTextField(10);
		lbStatus = new JLabel("Status");
		txaMensagem = new JTextArea(25,100);
		scrPane = new JScrollPane(txaMensagem);
		panel = new JPanel();
		
		List<Status> status = new ArrayList<Status>(EnumSet.allOf(Status.class));
		String opcoes[] = new String[status.size()];
		for(int i=0; i<status.size(); i++) {
			opcoes[i] = status.get(i).getDescricao();
		}
		cbxStatus = new JComboBox<String>(opcoes);
		
		btCadastrar = new JButton("Cadastrar");
		btAlterar = new JButton("Alterar");
		btExcluir = new JButton("Excluir");
		btPesquisar = new JButton("Pesquisar");
							
		//3� Passo - Adicionar o componente � JFrame
		add(lbCodigo);
		add(txtCodigo);
		add(lbTitulo);
		add(txtTitulo);
		add(lbPreco);
		add(txtPreco);		
		add(lbAutor);
		add(txtAutor);
		add(lbStatus);
		add(cbxStatus);
		add(btCadastrar);
		add(btAlterar);
		add(btExcluir);
		add(btPesquisar);
		add(scrPane);
		
		btPesquisar.setEnabled(false);
		btExcluir.setEnabled(false);
		
		btCadastrar.setToolTipText("Executa a��o de Cadastrar um Livro");
		btAlterar.setToolTipText("Executa a a��o de Alterar um Livro");
		
		btAlterar.setMnemonic('A');
		btCadastrar.setMnemonic('C');
		
		//Status de exibi��o
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmCadastro frm = new frmCadastro();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
