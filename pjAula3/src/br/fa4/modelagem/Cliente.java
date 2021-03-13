package br.fa4.modelagem;

/**
 * Modelagem Conceitual de Cliente
 * @author Paulo Barreto
 * @date 10/03/20201
 */

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	
	public Cliente() {		
	}
	
	public Cliente(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
