package br.fa4.modelagem;

public class TestaCliente {
	public static void main(String[] args) {
		//Instânciando um Objeto do tipo Cliente
		Cliente bruno = new Cliente(1858522, "Bruno Rodrigues"); //Invocando o método construtor
	
		bruno.setValorMensalidade(1000);
		
		System.out.println("RA " + bruno.getRa() + " Nome " + bruno.getNome()
		+ " Mensalidade " + bruno.getValorMensalidade());
	}
}
