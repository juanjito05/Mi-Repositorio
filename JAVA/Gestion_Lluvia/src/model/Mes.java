package model;

/*
 * @authors JUAN JOSÉ ORTIZ JIMENEZ Y JOSE PORRAS MUÑOZ
 * 12/11/2025
 */

public class Mes {
	
	private String nombre;
	private double litros;
	private double total;
	
	public Mes(String nombre, double litros) {	
		this.nombre =  nombre;
		this.litros=litros;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}
	
	public	void calcularDif(int numMatriculasAnterior ) {
		total= this.litros-numMatriculasAnterior;
	}
	
	 @Override
	    public String toString() {
	        return "Mes: "+ nombre + " Litros:" + litros + "ºL Total:"+ total +"ºL";
	    }
	 
}
