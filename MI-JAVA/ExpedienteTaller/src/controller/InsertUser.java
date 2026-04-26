package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import DataBase.CoConexion;
import model.Model;
import view.View;

/*
 * @author Juan Jose Ortiz Jimenez
 * 16/04/2026
 */

public class InsertUser implements ActionListener {

	View v2;
	Model model;
	CoConexion conx;

	public InsertUser(View v2, Model model, CoConexion conx) {

		this.v2 = v2;
		this.model = model;
		this.conx = conx;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == v2.getButtons().get(0)) {

			try {
				validarCampos();
			} catch (SQLException e1) {

				System.out.println(e1.getMessage());
			}

		}

	}

	private void validarCampos() throws SQLException {

		String insert = conx.getMoDb().getConsultas().get(0) + "('" + v2.getFields().get(0).getText() + "','"
				+ v2.getFields().get(1).getText() + "','" + v2.getFields().get(2).getText() + "','"
				+ v2.getFields().get(3).getText() + "','" + v2.getFields().get(4).getText() + "')";

		if (!v2.getFields().get(0).getText().isEmpty() && !v2.getFields().get(1).getText().isEmpty()
				&& !v2.getFields().get(2).getText().isEmpty() && !v2.getFields().get(3).getText().isEmpty()) {
			System.out.println("Insertado");
			conx.setRsInsert(0, insert);
		} else {
			System.out.println("No se ha insertado");
		}

	}

}
