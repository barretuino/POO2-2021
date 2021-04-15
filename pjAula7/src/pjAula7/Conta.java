package pjAula7;

public class Conta {
	public static double calcular(OperacaoMatematica operacao, double x, double y) {
		double resultado = operacao.calcular(x, y);
		System.out.println("O Resultado é " + resultado 
					+ " Tipo " + operacao.getClass().getSimpleName());
		return resultado;
	}

	public static void main(String[] args) {
		Conta.calcular(new Soma(), 10, 5);
		Conta.calcular(new Subtracao(), 10, 5);
		Conta.calcular(new Multiplicacao(), 10, 5);
		Conta.calcular(new Divisao(), 10, 5);
		Conta.calcular(new CalculoEstranho(), 10, 5);
	}
}
