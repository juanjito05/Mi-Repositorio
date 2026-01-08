package model;

import java.util.ArrayList;

public class Jugador {

	String nombre;
	ArrayList<Integer> carta;

	public Jugador(String nombre) {
		this.nombre = nombre;
		carta = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getCarta() {
		return carta;
	}

	public void setCarta(ArrayList<Integer> carta) {
		this.carta = carta;
	}

	@Override
	public String toString() {
		return "Jugador: " + nombre;
	}

}
