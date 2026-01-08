package model;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private ArrayList<Integer> victorias;
	private ArrayList<Integer> cartas;

	public Jugador(String nombre) {
		this.nombre = nombre;

		victorias = new ArrayList<>();
		cartas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getVictorias() {
		return victorias;
	}

	public void setVictorias(ArrayList<Integer> victorias) {
		this.victorias = victorias;
	}
	
	public ArrayList<Integer> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Integer> cartas) {
		this.cartas = cartas;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre;
	}

}
