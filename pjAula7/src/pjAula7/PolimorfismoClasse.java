package pjAula7;

import java.util.Collections;

/**
 * Exemplo de Sobrecarga de M�todos
 * Implementando Polimorfismo
 * @author Paulo Barreto
 * @data 14/04/2021
 */

/**
 * A sobrecarga ocorre quando:
 * 	 - M�todos exibem o mesmo nome
 *   - Por�m com os argumentos diferentes (identidade de assinatura)
 *   	1) Varia��o no n�mero de argumentos 
 *		2) O tipo dos argumentos
 *		3) A ordem dos argumentos
 */

public class PolimorfismoClasse {
	//M�todos Polimorficos
	public double soma(double a) {
		return a + 10;
	}
	
	public double soma(double a, double b) {
		return a + b;
	}
	
	public double soma(String a, String b) {
		return Double.parseDouble(a) + Double.parseDouble(b);
	}

	public double soma(double a, String b) {
		return a + Double.parseDouble(b); //Parser (Casting Explic�to)
	}
	
	public double soma(String a, double b) {
		return Double.parseDouble(a) + b;
	}	
	
	//Exemplo de Polimorfismo com n�mero vari�vel de argumentos
	public double soma(String ... valores) {
		double acumulador = 0;
		//Otimizada
		for(String valor : valores) {
			acumulador += Double.parseDouble(valor);
		}				
		return acumulador;		
	}
}
