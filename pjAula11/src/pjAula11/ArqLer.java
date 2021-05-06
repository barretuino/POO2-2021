package pjAula11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

public class ArqLer {
	public static void main(String args[]) throws Exception {

		//Leitura do Arquivo
		int tamanho;
		// Se não houver "arquivo.txt": java.io.FileNotFoundException: arquivo.txt
		InputStream  f1 = new FileInputStream("C:\\8051\\LEIA_ME.txt");
		tamanho = f1.available();
		System.out.println("Lê arquivo usando: FileInputStream\ntotal de bytes: "+ tamanho);

		for (int i=0; i< tamanho; i++){
			System.out.print((char) f1.read());
		}
		System.out.println();
		f1.close();
		
		// Estrutura que permite identificar até caracteres especiais
		// Usando a classe BufferedReader
		tamanho = 0;
		// Se não houver "arquivo.txt": java.io.FileNotFoundException: arquivoSaida.txt

		String nome_arq = "C:\\8051\\LEIA_ME.txt";
		FileReader arq = new FileReader(nome_arq);
		BufferedReader buffer = new BufferedReader(arq);

		System.out.println("Lê arquivo usando: BufferedReader\nArquivo " + nome_arq );
		String linha = buffer.readLine( );
		while ( linha != null ) {
			System.out.println( ++tamanho + ": " + linha );
			linha = buffer.readLine( );
		}
		buffer.close();
	}  
}