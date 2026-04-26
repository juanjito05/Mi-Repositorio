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

public class ListennerCombo implements ActionListener {

	View v4;
	Model model;
	CoConexion conx;

	public ListennerCombo(View v4, CoConexion conx, Model model) {

		this.v4 = v4;
		this.model = model;
		this.conx = conx;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == v4.getCombos().get(0)) {
			try {
				String consulta = conx.getMoDb().getConsultas().get(3) + "'" + v4.getCombos().get(0).getSelectedItem()
						+ "'";
				conx.setRs(3, consulta);
				while (conx.getRs().get(2).next()) {
					v4.getCombos().get(1).addItem(conx.getRs().get(2).getString(1));
				}

			} catch (SQLException e1) {

				System.out.println("Error de consulta" + e1.getMessage());
			}

		}

	}

}
