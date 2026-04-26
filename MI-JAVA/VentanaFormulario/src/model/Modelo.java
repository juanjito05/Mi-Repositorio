package model;

import java.util.ArrayList;

public class Modelo {

	ArrayList<String> textos;
	ArrayList<Personas> personas;

	public Modelo() {

		textos = new ArrayList();
		textos.add("Nombre");
		textos.add("Teléfono");
		textos.add("Correo");
		textos.add("Guardar");

		personas = new ArrayList<>();

	}

	public ArrayList<String> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

	public ArrayList<Personas> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Personas> personas) {
		this.personas = personas;
	}

}
