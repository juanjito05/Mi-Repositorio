package model;

import java.util.ArrayList;

/*
 * @authors JUAN JOSÉ ORTIZ JIMENEZ Y JOSE PORRAS MUÑOZ
 * 12/11/2025
 */

public class Ciudad {

	private int año;
	private String ciudad;
	private ArrayList<Mes> meses;

	public Ciudad(int año, String ciudad) {
		this.año = año;
		this.ciudad = ciudad;
		meses= new ArrayList<>();
	}
	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void enseÑarMes() {
		for (Mes mes: meses) {
			System.out.println(mes);
		}

	}
	
	public ArrayList<Mes> getMeses() {
		return meses;
	}

	public void setMeses(Mes meses) {
		this.meses.add(meses);
	}
	@Override
    public String toString() {
        return "Año: "+ año+ " Ciudad: " + ciudad;
    }
}
