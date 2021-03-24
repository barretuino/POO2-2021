package br.fa4.threads;



import java.util.HashSet;
import java.util.Set;
  
public class ExemploAssincronoPlus {
  
    private static int varCompartilhada = 0;
    private static final Integer QUANTIDADE = 10000;
    private static final Set<Integer> VALORES = new HashSet<>();
  
    public static void main(String[] args) {
    	long inicio = System.currentTimeMillis();
  
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < QUANTIDADE; i++) {
                    boolean novo = VALORES.add(++varCompartilhada);
                    if (!novo) {
                        System.out.println("JÃ¡ existe: " + varCompartilhada);
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < QUANTIDADE; i++) {
                    boolean novo = VALORES.add(++varCompartilhada);
                    if (!novo) {
                        System.out.println("JÃ¡ existe: " + varCompartilhada);
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < QUANTIDADE; i++) {
                    boolean novo = VALORES.add(++varCompartilhada);
                    if (!novo) {
                        System.out.println("JÃ¡ existe: " + varCompartilhada);
                    }
                }
            }
        }).start();
        
        System.out.println("Duração " + ((System.currentTimeMillis() - inicio)) + " ms");
    }
}