package pjAula7;

import java.util.Collections;

/**
 * Exemplo de Sobrecarga de Métodos
 * Implementando Polimorfismo
 * @author Paulo Barreto
 * @data 14/04/2021
 */

/**
 * A sobrecarga ocorre quando:
 * 	 - Métodos exibem o mesmo nome
 *   - Porém com os argumentos diferentes (identidade de assinatura)
 *   	1) Variação no número de argumentos 
 *		2) O tipo dos argumentos
 *		3) A ordem dos argumentos
 */

public class PolimorfismoClasse {
	//Métodos Polimorficos
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
		return a + Double.parseDouble(b); //Parser (Casting Explicíto)
	}
	
	public double soma(String a, double b) {
		return Double.parseDouble(a) + b;
	}	
	
	//Exemplo de Polimorfismo com número variável de argumentos
	public double soma(String ... valores) {
		double acumulador = 0;
		//Otimizada
		for(String valor : valores) {
			acumulador += Double.parseDouble(valor);
		}				
		return acumulador;		
	}
}
