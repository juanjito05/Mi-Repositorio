package model;

public class Usuario {

	String nombre;
	String contraseña;

	public Usuario(String nombre, String contraseñas) {

		this.nombre = nombre;
		this.contraseña = contraseñas;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseñas() {
		return contraseña;
	}

	public void setContraseñas(String contraseñas) {
		this.contraseña = contraseñas;
	}

}
