package controller;

import view.Ventana;

public class Controlador {
	
	Ventana vista;

	public Controlador() {
		
		vista= new Ventana(0);
		vista.hacerVisible(true);
		
		asignarEventoBoton();
	}
	
	private void asignarEventoBoton() {
		
		vista.getBotones().get(0).addActionListener(new Oyente(vista));
		
	}

	public static void main(String[] args) {
		new Controlador();
	}
	
}
