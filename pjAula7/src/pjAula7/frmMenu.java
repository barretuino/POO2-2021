package pjAula7;

import java.util.ArrayList;
import java.util.List;

public class frmMenu {
	public static void main(String[] args) {
		List<AbstractCRUD> itensMenu = new ArrayList<AbstractCRUD>();
		itensMenu.add(new frmCliente());
		itensMenu.add(new frmCliente());
		itensMenu.add(new frmFornecedor());
		itensMenu.add(null);	
		List<Object> exportar = new ArrayList<Object>();
		
		for(AbstractCRUD frame : itensMenu) {
			if(frame instanceof frmCliente) {
				((frmCliente)frame).algoCliente();
				((frmCliente)frame).inserir(null);
				exportar = ((frmCliente)frame).exportar(null);
			}else if(frame instanceof frmFornecedor) {
				((frmFornecedor)frame).inserir(null);
				exportar = ((frmFornecedor)frame).exportar(null);
			}else if(frame instanceof Object) {
				System.out.println("Foi passado object"); 
			}else {
				System.out.println("Contém null");
			}
			
			System.out.println(exportar.toString());
		}
	}
}
