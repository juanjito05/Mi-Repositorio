package controller;

import javax.swing.JOptionPane;

import model.Modelo;
import view.Vista;

public class Controlador {

	Vista vista;
	Modelo modelo;

	public Controlador() {

		vista = new Vista();
		modelo = new Modelo();

		inicio();

		asignarEventosBoton();
		
	}

	

	private void asignarEventosBoton() {

		vista.getBotones().get(0).addActionListener(new Oyente(vista, modelo));
		
	}

	private void inicio() {

		vista.crearEtiquetas(0);
		vista.getEtiquetas().get(0).setText(modelo.getTextos().get(6));

		vista.crearChecks(0);
		vista.crearJComboBox(0);

		for (int i = 0; i < modelo.getColores().size(); i++) {
			vista.getCombos().get(0).addItem(modelo.getColores().get(i));
		}

		vista.crearEtiquetas(1);
		vista.getEtiquetas().get(1).setText(modelo.getTextos().get(0));
		vista.crearCajas(1);
		vista.crearEtiquetas(1);
		vista.getEtiquetas().get(2).setText(modelo.getTextos().get(1));
		vista.crearCajas(1);

		vista.crearBotones(1);
		vista.getBotones().get(0).setText(modelo.getTextos().get(2));
		
		vista.crearBotones(2);
		vista.getBotones().get(1).setText(modelo.getTextos().get(7));
		vista.getBotones().get(1).setEnabled(false);

		vista.pack();
		vista.hacerVisible(true);
	}

}
