package pjAula7;

import java.util.List;

import javax.swing.JFrame;

public class frmCliente extends AbstractCRUD {
	
	public frmCliente() {
		setTitle("Tela de exemplo");
		setSize(300,300);
		setVisible(true);
	}
	
	public void algoCliente() {
		//TODO: não faz nada
	}
	
	public static void main(String[] args) {
		frmCliente c = new frmCliente();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void inserir(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object pesquisar(int chave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterar(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean excluir(int chave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object> exportar(Object... filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
