package model;

import java.util.ArrayList;

/*
 * @authors: Juan José Ortiz
 * 06/11/2025
 */

public class DatosString {

	ArrayList<String> textos;

	public DatosString() {
		textos = new ArrayList<>();
		
		textos.add("¿Quiere introducir una matrícula? (si/no)");
		textos.add("si");
		textos.add("Indica el año de la matrícula");
		textos.add("Indica el mes de la matrícula");
		textos.add("Introduzca el número de matrículas que se han realizado en ese mes");
		textos.add("EVOLUCIÓN MENSUAL DE LAS MATRICULACIONES");
	}

	public String getTextos(int n) {
		return textos.get(n);
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

}
