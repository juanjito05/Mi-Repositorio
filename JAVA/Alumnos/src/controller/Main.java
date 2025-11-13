package controller;

import java.util.Scanner;

import model.Alumno;

public class Main {

	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		Alumno alumno1 = new Alumno();

		String nombre;
		System.out.println("Escribe el nombre: ");
		nombre = sc.nextLine();
		alumno1.setNombre(nombre);
		int edad;
		System.out.println("Escribe la edad: ");
		edad = sc.nextInt();
		alumno1.setEdad(edad);

		alumno1.imprimir();

		if (alumno1.esMayorEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		;
	}

}
