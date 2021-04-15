package pjAula7;

import java.util.List;

import javax.swing.JFrame;

/**
 * Classe Base para cadastros
 * @author Paulo Barreto
 * @date 14/04/2021
 */

public abstract class AbstractCRUD extends JFrame{
	public abstract void inserir(Object objeto);
	public abstract Object pesquisar(int chave);
	public abstract void alterar(Object objeto);
	public abstract boolean excluir(int chave);
	public abstract List<Object> exportar(Object ... filtro);
	
	public String getDescricao(Object object) {
		return "Tipo: " + object.getClass().getTypeName()
				+ " Nome Simples " + object.getClass().getSimpleName();
	}
}
