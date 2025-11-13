package controller;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Alumno;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre: "); 
		String nombre=sc.nextLine();
		System.out.print("Introduce el nº del alumno: "); 
		int np=sc.nextInt();
		System.out.print("Introduce primera nota: "); 
		double nota1=sc.nextDouble();
		System.out.print("Introduce segunda nota: "); 
		double nota2=sc.nextDouble();
		
		Alumno alumn1 = new Alumno(np, nombre);
		alumn1.ponNotas(nota1, nota2);
		System.out.println(alumn1.muestraAlumno());
	}
}
