package pjAula7;

public class Teste {
	public static void main(String[] args) {
		PolimorfismoClasse exemplo = new PolimorfismoClasse();
		
		//Chamadas Polimorficas
		System.out.println(exemplo.soma(1, 2));
		System.out.println(exemplo.soma("1", 2));
		System.out.println(exemplo.soma(1));
		System.out.println(exemplo.soma(1, "2"));
		System.out.println(exemplo.soma("1", "2"));
		System.out.println(exemplo.soma("1", "2", "3", "8"));
		System.out.println(exemplo.soma("1", "2", "3", "8", "11"));
		
		String valores[] = {"1", "2", "3", "8", "11"};
		System.out.println(exemplo.soma(valores));
		
	}
}
