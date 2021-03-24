package br.fa4.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Tratar as ações de eventos externos
 * @author Paulo Barreto
 * @date 17/03/2021
 */

public class TratamentoController implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());		
	}
}
