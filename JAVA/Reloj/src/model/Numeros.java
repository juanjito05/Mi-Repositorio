package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Numeros {

	private ArrayList<String> centenas;
	private ArrayList<String> decenas;
	private ArrayList<String> dieci;
	private ArrayList<String> unidades;

	public Numeros() {

		centenas = new ArrayList<>(Arrays.asList("", "ciento ", "doscientos ", "trescientos ", "cuatrocientos ",
				"quinientos ", "seiscientos ", "setecientos ", "ochocientos ", "novecientos "));

		decenas = new ArrayList<>(Arrays.asList("", "diez ", "veinte ", "treinta ", "cuarenta ", "cincuenta ",
				"sesenta ", "setenta ", "ochenta ", "noventa "));

		dieci = new ArrayList<>(Arrays.asList("", "once", "doce", "trece", "catorce", "quince", "dieciséis",
				"diecisiete", "dieciocho", "diecinueve"));

		unidades = new ArrayList<>(Arrays.asList("", "y uno", "y dos", "y tres", "y cuatro", "y cinco", "y seis",
				"y siete", "y ocho", "y nueve"));
	}

	public ArrayList<String> getCentenas() {
		return centenas;
	}

	public void setCentenas(ArrayList<String> centenas) {
		this.centenas = centenas;
	}

	public ArrayList<String> getDecenas() {
		return decenas;
	}

	public void setDecenas(ArrayList<String> decenas) {
		this.decenas = decenas;
	}

	public ArrayList<String> getDieci() {
		return dieci;
	}

	public void setDieci(ArrayList<String> dieci) {
		this.dieci = dieci;
	}

	public ArrayList<String> getUnidades() {
		return unidades;
	}

	public void setUnidades(ArrayList<String> unidades) {
		this.unidades = unidades;
	}

}
