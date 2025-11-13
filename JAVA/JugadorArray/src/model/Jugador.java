package model;

public class Jugador {
	private String nombre;
	private String provincia;
	private int victorias = 0;

	public Jugador(String nombre, String provincia) {
		this.nombre = nombre;
		this.provincia = provincia;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	
}
