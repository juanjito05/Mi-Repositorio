package controller;

import java.sql.SQLException;

import DataBase.CoConexion;
import model.Model;
import view.View;

/*
 * @author Juan Jose Ortiz Jimenez
 * 16/04/2026
 */

public class Controller {

	View v1;
	Model model;
	CoConexion conx;

	public Controller() throws SQLException {

		v1 = new View();
		model = new Model();
		conx = new CoConexion();

		v1.createButtons(0, model.getTextButtons().get(0));
		v1.createButtons(1, model.getTextButtons().get(1));
		v1.createButtons(2, model.getTextButtons().get(2));

		assignEventButtons();

		v1.pack();
		v1.makeVisible(true);
	}

	private void assignEventButtons() {

		for (int i = 0; i < v1.getButtons().size(); i++) {
			v1.getButtons().get(i).addActionListener(new Listenner(v1, model, conx));
		}
	}

}
