package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Modelo;
import model.Personas;
import view.Vista;

public class Oyente implements ActionListener {

	Vista vista;
	Modelo modelo;
	ArrayList<Integer> telefonos;

	public Oyente(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;

		telefonos = new ArrayList<Integer>();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getBotones().get(0)) {
			if (e.getSource() == vista.getBotones().get(1)) {
				rellenarTelefonos();
			}
			rellenarTelefonos();
			validarCampos();
		}

	}

	private void validarCampos() {

		String nombre = vista.getCajas().get(0).getText();
		String correo = vista.getCajas().get(2).getText();

		boolean correoUsado = validarCorreo(correo);

		if (nombre.isEmpty() || correo.isEmpty() || correoUsado) {
			vista.crearEtiquetas(2, "no");
		} else {
			modelo.getPersonas().add(new Personas(nombre, telefonos, correo));
			System.out.println(telefonos);

			vista.getCajas().get(0).setText(" ");
			vista.getCajas().get(1).setText(" ");
			vista.getCajas().get(2).setText(" ");

		}

		if (modelo.getPersonas().size() > 5) {
			Vista ventanaNueva = new Vista("Personas");
			for (int i = 0; i < modelo.getPersonas().size(); i++) {
				ventanaNueva.crearEtiquetas(0, modelo.getPersonas().get(i).getNombre());
				ventanaNueva.crearRadios(0);
			}
			ventanaNueva.pack();
			ventanaNueva.setVisible(true);

			System.out.println(modelo.getPersonas());
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

	private void rellenarTelefonos() {

		int telefono = Integer.parseInt(vista.getCajas().get(1).getText());
		telefonos.add(telefono);

	}

}
