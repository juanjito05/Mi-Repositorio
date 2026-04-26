package model;

import java.util.ArrayList;

public class Modelo {

	private ArrayList<String> textos;

	private ArrayList<String> nombreTablas;

	private ArrayList<String> nombreColumnas;

	public Modelo() {

		textos = new ArrayList<>();
		nombreTablas = new ArrayList<>();

		nombreColumnas = new ArrayList<>();

		textos.add("JAVA");
	}

	public ArrayList<String> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

	public ArrayList<String> getNombreTablas() {
		return nombreTablas;
	}

	public void setNombreTablas(ArrayList<String> nombreTablas) {
		this.nombreTablas = nombreTablas;
	}

	public ArrayList<String> getNombreColumnas() {
		return nombreColumnas;
	}

	public void setNombreColumnas(ArrayList<String> nombreColumnas) {
		this.nombreColumnas = nombreColumnas;
	}

}
