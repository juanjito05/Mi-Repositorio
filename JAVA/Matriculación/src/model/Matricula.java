package model;

/*
 * @authors: Juan José Ortiz 
 * 06/11/2025
 */

public class Matricula {

	private String nombreMes;
	private int año;
	private int numMatriculas;
	private int dif;

	public Matricula(int num) {
		nombreMes =  new String();
	}

	public String getNombreMes() {
		return nombreMes;
	}

	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getNumMatriculas() {
		return numMatriculas;
	}

	public int setNumMatriculas(int numMatriculas) {
		this.numMatriculas = numMatriculas;
		return numMatriculas;
	}

	public int getDif() {
		return dif;
	}

	public void setDif(int dif) {
		this.dif = dif;
	}

	public	void calcularDif(int numMatriculasAnterior ) {
		dif= this.numMatriculas-numMatriculasAnterior;
			
	}
	
	public void mostrarMatricula() {
		System.out.println("Mes: "+ nombreMes + " Número de matrículas: " + numMatriculas+" Diferencias con el mes anterior: "+dif);
	}




}
