package model;

import java.util.ArrayList;

public class Datos {

	private ArrayList<String> textos;

	public Datos() {
		textos = new ArrayList<>();

		textos = rellenarTextos(textos);
	}

	private ArrayList<String> rellenarTextos(ArrayList<String> textos) {

		textos.add("RONDA");
		textos.add("Indica el numero de jugadores");
		textos.add("Introduce nombre para el jugador");
		textos.add("Turno de");

		return textos;
	}

	public ArrayList<String> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

}