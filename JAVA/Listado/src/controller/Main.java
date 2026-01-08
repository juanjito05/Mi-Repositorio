package controller;

import java.util.ArrayList;

import model.Datos;
import model.Personal;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Personal>empleados=new ArrayList<>();
		Datos textos = new Datos();
		
		rellenarempleados(textos,empleados);
		
		
		listarEmpleado(empleados);
	}

	private static void listarEmpleado(ArrayList<Personal> empleados) {
	
		
		
	}

	private static void rellenarempleados(Datos textos, ArrayList<Personal> empleados) {
	
		empleados.add(new Personal(textos.))
		
	}
}
