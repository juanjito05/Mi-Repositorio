package controller;

import java.awt.Dimension;
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

public class Listenner implements ActionListener {

	View v1;
	Model model;
	CoConexion conx;

	public Listenner(View v1, Model model, CoConexion conx) {

		this.v1 = v1;
		this.model = model;
		this.conx = conx;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			conx.setRs(1, conx.getMoDb().getConsultas().get(1));
			
		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		if (e.getSource() == v1.getButtons().get(0)) {

			View v2 = new View(model.getTextButtons().get(0));

			v2.createLabels(0, model.getTextsForm().get(0));
			v2.createTexts(0);
			v2.createLabels(0, model.getTextsForm().get(1));
			v2.createTexts(0);
			v2.createLabels(1, model.getTextsForm().get(2));
			v2.createTexts(1);
			v2.createLabels(1, model.getTextsForm().get(3));
			v2.createTexts(1);
			v2.createLabels(2, model.getTextsForm().get(4));
			v2.createTexts(2);
			v2.createButtons(2, model.getTextsButtons().get(3));
			v2.getButtons().get(0).addActionListener(new InsertUser(v2, model, conx));
			v2.pack();
			v2.makeVisible(true);

		}
		if (e.getSource() == v1.getButtons().get(1)) {

			View v3 = new View(1);
			v3.createLabels(0, model.getTextsForm().get(5));
			v3.createCombos(0);

			try {
				while (conx.getRs().get(0).next()) {
					v3.getCombos().get(0).addItem(conx.getRs().get(0).getString(1));
				}

			} catch (SQLException e1) {

				System.out.println("Error de consulta" + e1.getMessage());
			}

			v3.createLabels(0, model.getTextsForm().get(6));
			v3.createTexts(0);
			v3.createLabels(1, model.getTextsForm().get(7));
			v3.createTexts(1);
			v3.createLabels(1, model.getTextsForm().get(8));
			v3.createTexts(1);
			v3.createButtons(2, model.getTextButtons().get(3));
			v3.getButtons().get(0).addActionListener(new InsertProduct(v3, model, conx));
			v3.pack();
			v3.makeVisible(true);

		}
		if (e.getSource() == v1.getButtons().get(2)) {

			View v4 = new View(model.getTextButtons().get(2), 1);
			v4.createLabels(0, model.getTextsForm().get(5));
			v4.createCombos(0);

			try {

				while (conx.getRs().get(1).next()) {
					v4.getCombos().get(0).addItem(conx.getRs().get(1).getString(1));
				}

			} catch (SQLException e1) {

				System.out.println("Error de consulta" + e1.getMessage());
			}

			v4.getCombos().get(0).addActionListener(new ListennerCombo(v4, conx, model));
			v4.createLabels(1, model.getTextsForm().get(9));
			v4.createCombos(1);

			v4.createLabels(2, model.getTextsForm().get(10));
			v4.createTextAreas(2);
			v4.createButtons(2, model.getTextButtons().get(3));
			v4.getButtons().get(0).addActionListener(new InsertExp(v4, conx, model));

			v4.pack();
			v4.makeVisible(true);
		}

	}

}
