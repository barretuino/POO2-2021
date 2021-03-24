package br.fa4.threads;

import java.util.ArrayList;
import java.util.List;

public class ExemploAssincrono {

	private static int varCompartilhada = 0;
	private static final Integer QUANTIDADE = 10000;
	private static final List<Integer> VALORES = new ArrayList<>();

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Exibe mensagem");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				//Action
			}
		});

		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				//Action
			}
		});

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		int soma = 0;
		for (Integer valor : VALORES) {
			soma += valor;
		}
		System.out.println("Soma: " + soma);
		System.out.println("Dura��o " + ((System.currentTimeMillis() - inicio)) + " ms");
	}
}
