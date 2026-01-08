package model;

import java.util.ArrayList;

/*
 * @author Juan José Ortiz Jiménez
 *	25/11/2025 
 */

public class Datos {

	private ArrayList<String> textos;

	public Datos() {

		textos = new ArrayList<>();
		textos.add("Cuantos vais a jugar");
		textos.add("Numero de victorias de la tarjeta");
	}

	public ArrayList<String> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}
}
