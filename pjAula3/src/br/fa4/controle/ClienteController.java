package br.fa4.controle;

import br.fa4.modelagem.Cliente;

public class ClienteController {
	private Cliente entity = new Cliente();
	
	public void cadastrar(Cliente cliente) {
		setEntity(cliente);
	}
	
	public Cliente pesquisar() {
		return getEntity();
	}
	
	public void excluir() {
		//TODO: desenvolver
	}
	
	public void alterar(Cliente cliente) {
		setEntity(cliente);
	}
	
	public void imprimir() {
		System.out.println("Nome " + getEntity().getNome() + " Telefone " + getEntity().getTelefone()
				+ " Email " + getEntity().getEmail());
	}

	public Cliente getEntity() {
		return entity;
	}

	public void setEntity(Cliente entity) {
		this.entity = entity;
	}
}	
