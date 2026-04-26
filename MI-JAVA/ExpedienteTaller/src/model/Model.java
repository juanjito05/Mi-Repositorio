package model;

import java.util.ArrayList;

/*
 * @author Juan Jose Ortiz Jimenez
 * 16/04/2026
 */

public class Model {

	private ArrayList<String> textsButtons;
	private ArrayList<String> textsForm;

	public Model() {

		textsButtons = new ArrayList<>();
		textsForm = new ArrayList<>();

		textsButtons.add("Introducir cliente");
		textsButtons.add("Introducir dispositivo");
		textsButtons.add("Insertar historico");
		textsButtons.add("Guardar");
		textsButtons.add("Ingresar parte");

		textsForm.add("DNI:");
		textsForm.add("Nombre:");
		textsForm.add("Apellidos:");
		textsForm.add("Telefono:");
		textsForm.add("E_mail:");

		textsForm.add("DNI del cliente:");
		textsForm.add("Nombre:");
		textsForm.add("Modelo:");
		textsForm.add("Problema:");

		textsForm.add("Id del roducto:");
		textsForm.add("Parte:");

	}

	public ArrayList<String> getTextButtons() {
		return textsButtons;
	}

	public void setTextButtons(ArrayList<String> textButtons) {
		this.textsButtons = textButtons;
	}

	public ArrayList<String> getTextsButtons() {
		return textsButtons;
	}

	public void setTextsButtons(ArrayList<String> textsButtons) {
		this.textsButtons = textsButtons;
	}

	public ArrayList<String> getTextsForm() {
		return textsForm;
	}

	public void setTextsForm(ArrayList<String> textsForm) {
		this.textsForm = textsForm;
	}

}
