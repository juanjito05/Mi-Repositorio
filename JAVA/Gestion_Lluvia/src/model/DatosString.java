package model;

import java.util.ArrayList;

/*
 * @authors JUAN JOSÉ ORTIZ JIMENEZ Y JOSE PORRAS MUÑOZ
 * 12/11/2025
 */

public class DatosString {

	ArrayList<String> textos;

	public DatosString() {
		textos = new ArrayList<>();
		
		textos.add("¿Quiere introducir una ciudad? (si/no)");
		textos.add("si");
		textos.add("Introduce el año");
		textos.add("Introduce el nombre de la ciudad");
		textos.add("¿Desea añadir un mes?");
		
	}

	public String getTextos(int n) {
		return textos.get(n);
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

}
