package model;

import java.util.ArrayList;

public class Modelo {

	private ArrayList<String> pisos;
//	private ArrayList<String> datos;
	private int piso;
	private ArrayList<String> direcciones;
	private int pisoActual;

	public Modelo() {

//		datos = new ArrayList<>();

		direcciones = new ArrayList<>();
		direcciones=rellenarDirecciones(direcciones);
		piso = 9;
		pisos = new ArrayList<>();
		pisos = rellenarDatos(pisos, piso);
		pisoActual = 0;

	}

	private ArrayList<String> rellenarDirecciones(ArrayList<String> direcciones) {
		
		direcciones.add("Subiendo");
		direcciones.add("Bajando");
		return direcciones;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;

	}

	private ArrayList<String> rellenarDatos(ArrayList<String> pisos, int piso) {

		for (int i = 0; i < piso; i++) {
			pisos.add("" + i);
		}

		return pisos;
	}

	public ArrayList<String> getPisos() {
		return pisos;
	}

	public void setDatos(ArrayList<String> datos) {
		this.pisos = datos;
	}

	public void setPisos(ArrayList<String> pisos) {
		this.pisos = pisos;
	}

	public ArrayList<String> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(ArrayList<String> direcciones) {
		this.direcciones = direcciones;
	}

	public int getPisoActual() {
		return pisoActual;
	}

}