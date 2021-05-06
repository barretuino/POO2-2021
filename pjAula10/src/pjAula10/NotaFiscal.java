package pjAula10;

import java.io.Serializable;
import java.util.List;

/**
 * Exemplo de Serialização de Classe
 * @author Paulo Barreto
 * @data 28/04/2021
 */

public class NotaFiscal implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int numero;
	List<ItensNotaFiscal> itens;
	private transient boolean estado;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<ItensNotaFiscal> getItens() throws IndexOutOfBoundsException{
		return itens;
	}
	public void setItens(List<ItensNotaFiscal> itens) {
		this.itens = itens;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
