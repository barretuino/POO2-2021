package br.fa4.modelagem;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Demonstracao {
	public static void main(String[] args) {
		try {
			for ( LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
				UIManager.setLookAndFeel( info.getClassName() );
				System.out.println(info.getName());
			}
		} catch ( Exception exc ) {
			exc.printStackTrace();
		} 
	}
}
