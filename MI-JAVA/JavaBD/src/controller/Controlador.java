package controller;

import java.sql.SQLException;

import controllerBd.CoConexionBD;
import model.ModeloBD;
import view.Vista;

public class Controlador {

	CoConexionBD conexion;
	Vista vista;

	public Controlador() throws SQLException {

		conexion = new CoConexionBD();
		vista = new Vista();

		vista.hacerVisible(true);

		crearStatement();
		crearStatement();
		crearStatement();
		
		listarTablas();
	}

	public void listarTablas() throws SQLException {

		/*
		 * while (conexion.saltarRegistro(0)) {
		 * System.out.println(conexion.getRs().get(0).getString(1)+"--"+conexion.getRs()
		 * .get(0).getString(2)); } System.out.println("----------------------------");
		 * while (conexion.saltarRegistro(1)) {
		 * System.out.println(conexion.getRs().get(1).getString(1)+"--"+conexion.getRs()
		 * .get(1).getString(2)); }
		 */

		vista.crearCombos();
		

		conexion.setRs(0, 0);

		while (conexion.saltarRegistro(0)) {
			vista.getCombos().get(0).addItem(conexion.getRs().get(0).getString(1));
			// conexion.setRs(1, 0);

		}
		
		vista.getCombos().get(0).addActionListener(new Listenner(vista, conexion));

	}

	public void crearStatement() throws SQLException {

		conexion.setSt(conexion.getConn());
		

	}

}
