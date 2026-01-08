package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Modelo;
import view.Vista;

public class Oyente implements ActionListener {

	Vista vista;
	Modelo modelo;
	int pisoActual = -1;

	public Oyente(Vista vista, Modelo modelo) {

		this.vista = vista;
		this.modelo = modelo;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < vista.getBotones().size(); i++) {

			if (e.getSource() == vista.getBotones().get(i)) {
				vista.actualizarPantalla(modelo.getPisos().get(i), 0);

				if (pisoActual != -1) {

					if (i > pisoActual) {
					    vista.actualizarPantalla(modelo.getDirecciones().get(1), 1);
					} else if (i < pisoActual) {
					    vista.actualizarPantalla(modelo.getDirecciones().get(0), 1);
					}

				}
				

				pisoActual = i;

			}

		}

	}

}