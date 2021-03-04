package br.fa4.modelagem;

public enum Status {
	ATIVO		(1, "Ativo"), 
	INATIVO		(2, "Inativo"), 
	RESERVADO	(3, "Reservado"), 
	CANCELADO	(4, "Cancelado"),
	DESCONHECIDO(5, "Desconhecido");
	
	private int codigo;
	private String descricao;
		
	private Status(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
