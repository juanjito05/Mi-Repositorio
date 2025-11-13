package model;

import java.util.ArrayList;

public class DatosString {

	ArrayList<String> textos;

	public DatosString() {
		textos = new ArrayList<>();

		textos.add("¿Quiere introducir un cliente? (si/no)");
		textos.add("si");
		textos.add("Introduzca el NIF del cliente (solo números):");
		textos.add("Introduzca el nombre:");
		textos.add("Introduzca la dirección:");
		textos.add("Introduzca el código postal:");
		textos.add("Introduzca la antigüedad:");
		textos.add("\nCODIGO\tCIF\tNOMBRE\tDIRECCION\tCP\tANTIGÜEDAD");
	}

	public String getTextos(int n) {
		return textos.get(n);
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

}
