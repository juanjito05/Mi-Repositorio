package model;

import java.util.ArrayList;

public class Modelo {

	private ArrayList<String> datos;

	public Modelo() {

		datos = new ArrayList<>();
		datos = rellenarDatos(datos);

	}

	private ArrayList<String> rellenarDatos(ArrayList<String> datos2) {

		datos.add("0");
		datos.add("1");
		datos.add("2");
		datos.add("3");
		datos.add("4");
		datos.add("5");
		datos.add("6");
		datos.add("7");
		datos.add("8");
		
		return datos;
	}

	public ArrayList<String> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<String> datos) {
		this.datos = datos;
	}

}
