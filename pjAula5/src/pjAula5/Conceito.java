package pjAula5;

/**
 * Relembrando o conceito de m�todo
 * @author Paulo Barreto
 * @24/03/2021
 */

public class Conceito {
	//M�todos s�o definidos por
	//Qualificador de Acesso: public
	//Retorno: void
	//Alias (nome): acao
	//Argumentos (assinatura): int, String
	public void acao(int valor, String texto) {
		
	}
	
	public static void main(String[] args) {
		Conceito instancia = new Conceito();
		
		instancia.acao(10, "Paulo");
		
	}
}
