package br.fa4.modelagem;

/**
 * Modelagem Conceitual de uma Classe
 * @author Paulo Barreto
 * @date 24/02/2020
 */
public class Cliente {
	//Atributos
	private int ra;
	private String nome;
	private float valorMensalidade; 
	
	//Métodos
	public Cliente(int ra, String nome) {
		this.ra = ra;
		this.nome = nome;
	}
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorMensalidade() {
		return valorMensalidade;
	}
	public void setValorMensalidade(float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
}
