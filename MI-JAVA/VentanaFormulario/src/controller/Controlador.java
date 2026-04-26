package controller;

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

		vista.hacerVisible(true);

	}

	private void asignarEventosBoton() {

		for (int i = 0; i < vista.getBotones().size(); i++) {

			vista.getBotones().get(i).addActionListener(new Oyente(vista, modelo));
		}

	}

	private void inicio() {

		for (int i = 0; i < modelo.getTextos().size() - 1; i++) {

			vista.crearEtiquetas(i, modelo.getTextos().get(i));
			vista.crearCajas(i);

		}
		vista.crearBotones(2, modelo.getTextos().get(3));
		vista.crearBotones(1, modelo.getTextos().get(3));

		vista.pack();

	}

}
