package model;

public class Alumno {

	private String nombre;
	private int edad;

	public Alumno() {

		nombre = new String();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean esMayorEdad() {
		if (edad > 18) {
			return true;
		} else {
			return false;
		}

	}

	public void imprimir() {

		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

}


