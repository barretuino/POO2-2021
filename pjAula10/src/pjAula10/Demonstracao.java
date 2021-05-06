package pjAula10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Propagação da Exceção
 * @author Paulo Barreto
 * @data 28/04/2021
 */

public class Demonstracao {
	public static void main(String[] args) {
		NotaFiscal nota = new NotaFiscal();
		
		try {
			for(ItensNotaFiscal n :	nota.getItens()) {
			
			}
		}catch(IndexOutOfBoundsException e) {
			
		}
		
		
		
		
		//Bloco de tratamento por meio de
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new FileReader(new File("d://paulo.txt")));
			buffer.read();
			buffer.close();
			System.out.println(5/0);
			
		}catch( IOException e) {
			System.out.println("Ocorreu " + e);
		}
		catch(ArithmeticException e) {
			System.out.println("Você está divindo o número por zero. Verifique." + e);
		}
		//......
		finally {
			System.out.println("Comando que é executado no final");
		}
	
	}
}
