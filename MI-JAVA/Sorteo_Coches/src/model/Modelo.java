package model;

import java.util.ArrayList;

public class Modelo {

	private ArrayList<String> textos;
	private ArrayList<String> colores;
	private ArrayList<Persona> personas;

	public Modelo() {

		textos = new ArrayList<>();
		colores = new ArrayList<>();
		personas = new ArrayList<>();

		colores.add("Rojo");
		colores.add("Azul");
		colores.add("Blanco");
		colores.add("Azul");

		textos.add("Nombre");
		textos.add("Correo");
		textos.add("Añadir");
		textos.add("¡Error!");
		textos.add("Los campos deben de rellenarse correctamente y sin estar vacíos");
		textos.add("Aceptar");
		textos.add("Participo en este sorteo");
		textos.add("Sorteo");
	}

	public ArrayList<String> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

	public ArrayList<String> getColores() {
		return colores;
	}

	public void setColores(ArrayList<String> colores) {
		this.colores = colores;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

}
