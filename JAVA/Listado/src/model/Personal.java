package model;

public class Personal {

	String nombre;
	String cargo;
	int sueldo;

	public Personal(String nombre, String cargo, int sueldo) {

		this.nombre = nombre;
		this.cargo = cargo;
		this.sueldo = sueldo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
