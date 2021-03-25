package pjAula5;

import java.util.Date;

public class Pessoa {
	private int codigo;	
	private String nome;
	private Date dataNascimento;
	private Pessoa mae;
	private Endereco endereco;
	
	//Construtor v�zio
	public Pessoa() {
		
	}
	public Pessoa(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	/**
	 * Uma Assinatura de m�todo � caracterizada por tr�s condi��es identificadas nos par�metros e
	 * argumentos.
	 * 1. Quantidade de Argumentos
	 * 2. Tipos dos Argumentos
	 * 3. Ordem dos Argumentos
	 */
	
	//T�cnica Sobrecarga de M�todos
	//� a t�nica de implementar mais do que uma versao do mesmo m�todo
	//variando a sua assinatura, ou seja, os argumentos, no que tange, quantidade, tipo e ordem.
	public float calcular(float valorA, float valorB) {
		return valorA + valorB;
	}
	
	public float calcular(String valorA, String valorB) {
		return Float.parseFloat(valorA) + Float.parseFloat(valorB);
	}
	
	public float calcular(float valorA, String valorB) {
		return valorA + Float.parseFloat(valorB);
	}
	
	public float calcular(String valorB, float valorA) {
		return valorA + Float.parseFloat(valorB);
	}
	
	//Tecnica de sobrecarga que permite implementar o Polimorfismo
	public static void main(String[] args) {
		Pessoa voce = new Pessoa();
		System.out.println(voce.calcular(10.5f, 5.5f));
		System.out.println(voce.calcular("10.5", "5.5"));
		System.out.println(voce.calcular("10.5", 5.5f));
		System.out.println(voce.calcular(10.5f, "5.5"));		
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Pessoa getMae() {
		return mae;
	}
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
