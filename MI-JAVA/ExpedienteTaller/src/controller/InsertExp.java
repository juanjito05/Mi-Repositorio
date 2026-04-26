package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.CoConexion;
import model.Model;
import view.View;

public class InsertExp implements ActionListener {

	View v4;
	Model model;
	CoConexion conx;

	public InsertExp(View v4, CoConexion conx, Model model) {

		this.v4 = v4;
		this.model = model;
		this.conx = conx;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String insert = conx.getMoDb().getConsultas().get(4) + "('" + v4.getCombos().get(1).getSelectedItem() + "','"
				+ v4.getCombos().get(0).getSelectedItem() + "','" + v4.getAreas().get(0).getText() + "')";

		if (!v4.getAreas().get(0).getText().isEmpty()) {
			conx.setRsInsert(4, insert);
			System.out.println("Expediente insertado");

		} else {

		}
	}

}
