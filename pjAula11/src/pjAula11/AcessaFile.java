package pjAula11;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Introdução a classe File verificando, por exemplo, se o arquivo existe
 * @author Paulo Barreto
 * @data 05/05/2021
 */

public class AcessaFile {
	public static void main(String[] args) {
		File arquivo = new File("arquivo.txt");
		File diretorioRaiz= new File("c://");
		File diretorio = new File(diretorioRaiz, "paulo_barreto.txt");	

		//Verificar a existência do File
		if(diretorio.exists()) {
			System.out.println("O Arquivo Existe");
		}else {
			System.err.println("O Arquivo Não Existe");
			//System.out.println(diretorio.mkdirs() ? "Criado com sucesso" : "Não pode ser criado.");
		}
		
		//Comando para pegar o caminho completo do meu diretório
		try {
			System.out.println(diretorio.getCanonicalPath().toString());
		} catch (IOException e) {
			System.err.println("O caminho não pode ser alçado");
		}
		
		//Verificando tipo da estrutura File (true então isDirectory retorna false)
		if(!diretorio.isFile()) {
			System.out.println("O caminho da variável arquivo é um File.");
		}else {
			System.out.println("O caminho da variável arquivo é um Diretório.");
		}
		
		if(diretorio.canRead()) {
			System.out.println("O arquivo permite Leitura.");
		}else{
			System.out.println("O arquivo não permite Leitura.");
		}
		
		if(diretorio.canWrite()) {
			System.out.println("O arquivo permite Escrita.");
		}else{
			System.out.println("O arquivo não permite Escrita.");
		}
		
		System.out.println("Tamanho do meu arquivo " + (Double.valueOf((diretorio.length()/1024)).toString()) + " bytes");
		System.out.println(new Date(diretorio.lastModified()).toGMTString() 
				+ new Date(diretorio.lastModified()).toLocaleString());
		
		System.out.println(diretorio.getParent());
		
		for(String a : diretorioRaiz.list()) {
			System.out.println(a);
		}

	}
}