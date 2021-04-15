package pjAula7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestaCliente {
	public static void main(String[] args) {
		List<Cliente> lista = new ArrayList<Cliente>();
		
		lista.add(new Cliente(1, "Paulo", 70));
		lista.add(new Cliente(2, "João", 65));
		lista.add(new Cliente(3, "Maria", 85));
		lista.add(new Cliente(4, "Luiz", 108));
						
		Predicate<Cliente> filtro = p -> p.getPeso() > 75;
		Object filtrados[] = lista.stream().filter(filtro).toArray();
		
		for(Object c : filtrados) {
			System.out.println(((Cliente)c).getNome());
		}
	}
}
