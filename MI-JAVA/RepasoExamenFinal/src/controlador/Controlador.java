package controlador;

import java.sql.SQLException;

import DataBase.CoBD;
import model.Modelo;
import vista.Vista;

public class Controlador {

	Vista v1;
	CoBD conn;
	Modelo modelo;

	public Controlador() throws SQLException {

		conn = new CoBD();

		modelo = new Modelo();
		v1 = new Vista();

		inicio();

	}

	private void inicio() throws SQLException {

		conn.setRs(0, conn.getBd().getConsultas().get(0));

		while (conn.saltarRegistro(0)) {
			modelo.getNombreTablas().add(conn.getRs().get(0).getString(1));
		}

		for (int i = 0; i < modelo.getNombreTablas().size()-5; i++) {
			int roll = (int) (Math.random() * modelo.getNombreTablas().size() - 1) + 1;
			v1.crearEtiquetas(0, modelo.getNombreTablas().get(roll));
		}

		v1.crearBotones(1, modelo.getTextos().get(0));

		asignarEventoBotones();

		v1.pack();
		v1.hacerVisible(true);

	}

	private void asignarEventoBotones() {

		v1.getBotones().get(0).addActionListener(new Oyente(v1, conn, modelo));

	}

}
