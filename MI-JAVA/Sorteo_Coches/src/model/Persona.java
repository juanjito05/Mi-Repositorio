package model;

public class Persona {

	String nombre;
	String correo;
	String color;
	boolean participar;

	public Persona(String nombre, String correo, String color, boolean participar) {
		this.nombre = nombre;
		this.correo = correo;
		this.color = color;
		this.participar = participar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isParticipar() {
		return participar;
	}

	public void setParticipar(boolean participar) {
		this.participar = participar;
	}

	@Override
	public String toString() {
		return nombre + " -- " + correo + " -- " + color + " -- " + participar;

	}

}
