package br.fa4.threads;

import java.util.ArrayList;
import java.util.List;
  
public class ExemploBlocoSincronizado {
  
	private static int varCompartilhada = 0;
    private static final Integer QUANTIDADE = 10000;
    private static final List<Integer> VALORES = new ArrayList<>();
  
    public static void main(String[] args) {
    	
    	 Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < QUANTIDADE; i++) {
                     synchronized (VALORES) {
                         VALORES.add(++varCompartilhada);
                     }
                 }
             }
         });
   
         Thread t2 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < QUANTIDADE; i++) {
                     synchronized (VALORES) {
                         VALORES.add(++varCompartilhada);
                     }
                 }
             }
         });
   
         Thread t3 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < QUANTIDADE; i++) {
                     synchronized (VALORES) {
                         VALORES.add(++varCompartilhada);
                     }
                 }
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
    }  
  
}
