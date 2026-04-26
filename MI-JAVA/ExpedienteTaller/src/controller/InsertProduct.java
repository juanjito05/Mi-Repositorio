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

public class InsertProduct implements ActionListener {

	View v3;
	Model model;
	CoConexion conx;

	public InsertProduct(View v3, Model model, CoConexion conx) {

		this.v3 = v3;
		this.model = model;
		this.conx = conx;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == v3.getButtons().get(0)) {

			validarCampos();
		}
	}

	private void validarCampos() {

		String insert = conx.getMoDb().getConsultas().get(2) + "('" + v3.getFields().get(0).getText() + "','"
				+ v3.getFields().get(1).getText() + "','" + v3.getCombos().get(0).getSelectedItem() + "','"
				+ v3.getFields().get(2).getText() + "')";

		if (!v3.getFields().get(0).getText().isEmpty() && !v3.getFields().get(0).getText().isEmpty()
				&& !v3.getFields().get(1).getText().isEmpty() && !v3.getFields().get(2).getText().isEmpty()) {
			conx.setRsInsert(2, insert);
			System.out.println("Producto insertado");

		} else {

		}
	}

}
