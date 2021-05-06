package pjAula11;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TelaSaida{

	public static void main(String args[]) throws Exception{

		ByteArrayOutputStream f0 = new ByteArrayOutputStream(12);
		System.out.println("Digite 11 caracteres e pressione <return>");   
		while (f0.size() != 11 ){
			f0.write(System.in.read());
		}
		System.out.println("Buffer como uma string");
		System.out.println( f0.toString() );
		System.out.println("Para um array");
		byte b[] = f0.toByteArray();
		for (int i=0; i < b.length; i++){
			System.out.println((char) b[i]);
		}
		System.out.println("Para um FileOutputStream ...");
		OutputStream f1 = new FileOutputStream("testando.txt");
		f0.writeTo(f1);
		System.out.println("Acabou ... ");
	}
}