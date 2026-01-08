package model;

import java.util.ArrayList;

public class Datos {
	
	private ArrayList<String>nombre;
	private ArrayList<String>cargo;
	private ArrayList<Integer>sueldo;
	
	private ArrayList<String>marca;
	private ArrayList<String>color;
	
	
	public Datos() {
		
		nombre=new ArrayList<>();
		cargo=new ArrayList<>();
		sueldo=new ArrayList<>();
		
		marca=new ArrayList<>();
		color=new ArrayList<>();
		
		nombre=rellenarNombres(nombre);
		cargo=rellenarCargos(cargo);
		sueldo=rellenarSueldos(sueldo);
	}


	private ArrayList<Integer> rellenarSueldos(ArrayList<Integer> sueldo) {
		// TODO Auto-generated method stub
		return sueldo;
	}


	private ArrayList<String> rellenarCargos(ArrayList<String> cargo) {
		
		cargo.add("Abogado");
		cargo.add("Policía");
		cargo.add("Profesor");
		cargo.add("Actriz");
		
		return cargo;
	}


	private ArrayList<String> rellenarNombres(ArrayList<String> nombre) {

		nombre.add("Juan");
		nombre.add("Pablo");
		nombre.add("Sergio");
		nombre.add("Celia");
		
		return nombre;
	}
	
	

}
