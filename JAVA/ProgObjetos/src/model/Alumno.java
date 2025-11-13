package model;


public class Alumno {
	
	
	
	private int np;
	private String nombre;
	private double nota1;
	private double nota2;
	
	public Alumno(int np, String nombre) {
		this.np=np;
		this.nombre=nombre;
	}
	
	
	public void ponNotas(double nota1, double nota2) {
		this.nota1=nota1;
		this.nota2=nota2;
	}
	
	public double dameMedia() {
		return (nota1+nota2)/2;
		
	}
	
	public String muestraAlumno() {
		return "Matrícula: "+np +" \nNombre: "+ nombre +"\nNota media: "+ dameMedia();
	}
	
}
