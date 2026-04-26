package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Modelo;
import view.Vista;

public class OyenteEliminar implements ActionListener{
	
	Vista vista;

	public OyenteEliminar(Vista vistaEmergente) {
		
		this.vista=vistaEmergente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==vista.getBotones().get(0)) {
			vista.dispose();
		}
		
	}

}
