import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class TesteFile {	
	public static void main(String[] args) {
		String texto = "Programa��o Orientada a Objetos II";	
		try {			
			FileWriter fileWriter = new FileWriter(new File("Ai.txt"));			
			fileWriter.write(texto);
			fileWriter.write("\nPaulo");
			fileWriter.close();					
			BufferedReader in = new BufferedReader(new FileReader("Ai.txt"));
			//L� 1� Linha
			System.out.println(in.readLine());
			//L� 2� Linha
			System.out.println(in.readLine());		
		}
		catch (IOException e) {	
			e.printStackTrace();
		}
	
	}	
}