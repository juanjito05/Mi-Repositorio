package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.concurrent.ForkJoinPool;

import controllerBd.CoConexionBD;
import view.Vista;

public class Listenner implements ActionListener {

	Vista vista;
	CoConexionBD conexion;

	public Listenner(Vista vista, CoConexionBD conexion) {
		this.vista = vista;
		this.conexion = conexion;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String tabla = (String) vista.getCombos().get(0).getSelectedItem();
		String columna = conexion.getModelo().getConsultas().get(1) + tabla;
		String registro = conexion.getModelo().getConsultas().get(2) + tabla;

		vista.setVisible(false);

		int contador = 0;

		try {
			conexion.setSt(conexion.getConn());
			conexion.setRs(1, columna);
			System.out.println(tabla);
			try {
				// conexion.setRs(1, columna);
				Vista tablaSQL = new Vista(tabla);

				while (conexion.saltarRegistro(1)) {

					tablaSQL.getColumnas().add(conexion.getRs().get(1).getString(1));

				}

				conexion.setRs(2, registro);


				while (conexion.saltarRegistro(2)) {

					tablaSQL.getDatos().add(new Object[] {conexion.getRs().get(2).getString(1),
							conexion.getRs().get(2).getString(2),
							conexion.getRs().get(2).getString(3),
							conexion.getRs().get(2).getString(4),
							conexion.getRs().get(2).getString(5),
							conexion.getRs().get(2).getString(6)});

				}

				tablaSQL.crearTabla();
				tablaSQL.setVisible(true);

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

		} catch (SQLException e1) {

		}

	}

}
