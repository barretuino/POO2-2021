package pjAula5;

public class Professor extends Pessoa {
	
	private static int numerador = 0;
	
	private int codigo = ++numerador;
	
	//Sobreescrita
	@Override
	public float calcular(float valorA, float valorB) {
		return (valorA * 2) + valorB;
	}
	
	//Sobrecarregando o calcular
	public float calcular(float valorA, float valorB, int pesoA, int pesoB) {
		return calcular(valorA * pesoA, valorB * pesoB);
	}
	
	public static void main(String[] args) {
		Professor paulo = new Professor();
		Professor adriano = new Professor();
		Professor murilo = new Professor();
		
		System.out.println(paulo.getCodigo());
		System.out.println(adriano.getCodigo());
		System.out.println(murilo.getCodigo());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
