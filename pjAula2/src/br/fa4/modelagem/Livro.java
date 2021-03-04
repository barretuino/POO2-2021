package br.fa4.modelagem;

/**
 * Modelagem Conceitual de Livro
 * @author Paulo Barreto
 * @date 03/03/2021
 */

public class Livro {
	//Atributos
	private int codigo;
	private String titulo;
	private float preco;
	private boolean status;
	private String autor;
	
	//Métodos
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
