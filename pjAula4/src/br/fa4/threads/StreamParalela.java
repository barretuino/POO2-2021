package br.fa4.threads;


import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamParalela {

	public static void main(String[] args) {
		long num = 60_000_000_000L;
		//somaFor(num);
		//somaStreamIterate(num);
		
		//Número de Processadores em uso
		System.out.println("Número de Processadores em uso " + Runtime.getRuntime().availableProcessors());
		
		//Modificar o número de threads a serem utilizadas
		System.setProperty("java.util.concurrent.ForkJoinPool.common.paralelism", "8");

		//Método que derruma a JVM
		//somaParalellStreamIterate(num);
		
		//somaRangeClosedStreamIterate(num);
		
		somaRangeClosedParalellStreamIterate(num);
	}
	
	public static void somaFor(long num) {
		System.out.println("For");
		long result = 0;
		long init = System.currentTimeMillis();
		for(long i=1L; i<=num; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms");		
	}
	
	public static void somaStreamIterate(long num) {
		System.out.println("Stream Sequencial");
		long result = 0;
		long init = System.currentTimeMillis();
		result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);		
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms");
	}
	
	public static void somaParalellStreamIterate(long num) {
		System.out.println("Stream Paralela");
		long result = 0;
		long init = System.currentTimeMillis();
		result = Stream.iterate(1L, i -> i+1).limit(num).parallel().reduce(0L, Long::sum);		
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms");
	}
	
	public static void somaRangeClosedStreamIterate(long num) {
		System.out.println("Range Closed Sequencial");
		long result = 0;
		long init = System.currentTimeMillis();
		result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);		
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms");
	}
	
	public static void somaRangeClosedParalellStreamIterate(long num) {
		System.out.println("Range Closed Parallel");
		long result = 0;
		long init = System.currentTimeMillis();
		result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);		
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms");
	}
}
