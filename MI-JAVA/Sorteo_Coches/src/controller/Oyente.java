package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Modelo;
import model.Persona;
import view.Vista;

public class Oyente implements ActionListener {

	Vista vista;
	Modelo modelo;

	public Oyente(Vista vista, Modelo modelo) {

		this.vista = vista;
		this.modelo = modelo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getBotones().get(0)) {
			validarCampos();

		}

	}

	private void validarCampos() {

		String nombre = vista.getCajas().get(0).getText();
		String correo = vista.getCajas().get(1).getText();
		String color = (String) vista.getCombos().get(0).getSelectedItem();
		boolean participa = vista.getChecks().get(0).isSelected();

		boolean correoUsado = validarCorreo(correo);

		if (nombre.isEmpty() || correo.isEmpty() || !correo.contains("@") || color.isEmpty() || correoUsado) {

			Vista vistaEmergente = new Vista(modelo.getTextos().get(3));
			vistaEmergente.getEtiquetas().get(0).setText(modelo.getTextos().get(4));
			vistaEmergente.getBotones().get(0).setText(modelo.getTextos().get(5));
			vistaEmergente.pack();
			vistaEmergente.hacerVisible(true);
			vistaEmergente.getBotones().get(0).addActionListener(new OyenteEliminar(vistaEmergente));

		} else {

			modelo.getPersonas().add(new Persona(nombre, correo, color, participa));

			System.out.println(modelo.getPersonas());

			vista.getCajas().get(0).setText("");
			vista.getCajas().get(1).setText("");

			inciarSorteo();

		}

	}

	private boolean validarCorreo(String correo) {

		for (int i = 0; i < modelo.getPersonas().size(); i++) {
			if (correo.equals(modelo.getPersonas().get(i).getCorreo())) {
				return true;
			}

		}

		return false;

	}

	private void inciarSorteo() {

		int personasParticipantes = 0;

		for (int i = 0; i < modelo.getPersonas().size(); i++) {
			if (modelo.getPersonas().get(i).isParticipar() == true) {
				personasParticipantes++;
				if (personasParticipantes >= 5) {
					vista.getBotones().get(1).setEnabled(true);
				}

			}

		}

	}

}
