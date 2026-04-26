package model;

import java.util.ArrayList;

public class Personas {

	String nombre;
	ArrayList<Integer> telefonos;
	String correo;

	public Personas(String nombre, ArrayList<Integer> telefonos, String correo) {

		this.nombre = nombre;
		this.telefonos = telefonos;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Integer> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return nombre + " -- " + telefonos + " -- " + correo;
	}

}
