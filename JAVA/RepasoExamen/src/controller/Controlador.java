package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Modelo;
import view.Vista;

public class Controlador {
	
	Vista vista;
	Modelo modelo;
	
	public Controlador() {
		
		vista = new Vista();
		modelo= new Modelo();
		
		hacerVotones();
		asignarEventoBotones();
		
		vista.hacerVisible(true);
	}




	private void asignarEventoBotones() {
		
		  for (int i = 0; i < vista.getBotones().size(); i++) {
			  vista.getBotones().get(i).addActionListener(new Oyente(vista,modelo));
		  }
		
	}


	private void hacerVotones() {
		
		for (int i = 0; i < modelo.getDatos().size(); i++) {
			
			vista.hacerBotones(modelo.getDatos().get(i));
		}
		
	}



}
