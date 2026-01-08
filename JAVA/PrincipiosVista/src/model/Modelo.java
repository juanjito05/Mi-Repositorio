package model;

import java.util.ArrayList;

public class Modelo {
	
	private ArrayList <String>datos;
	
	
	public Modelo() {
		
		datos= new ArrayList<>();
		
		datos.add("Título");
		datos.add("Introduzca contraseña");
	}


	public ArrayList<String> getDatos() {
		return datos;
	}


	public void setDatos(ArrayList<String> datos) {
		this.datos = datos;
	}
	
	
}

