package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Ciudad;
import model.DatosString;
import model.Mes;

/*
 * @authors JUAN JOSÉ ORTIZ JIMENEZ Y JOSE PORRAS MUÑOZ
 * Ç12/11/2025
 */

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Ciudad> ciudades = new ArrayList<>();
	private static DatosString textos = new DatosString();

	public static void main(String[] args) {

		int año = 0;
		String nombreCiudad = new String();
		String respuesta = new String();

		introducirAño(año, nombreCiudad, respuesta);
		imprimirArray();

	}

	private static void introducirAño(int año, String nombreCiudad, String respuesta) {

		do {
			System.out.println(textos.getTextos(0));
			respuesta = sc.next();

			if (respuesta.equalsIgnoreCase(textos.getTextos(1))) {

				System.out.println(textos.getTextos(2));
				año = introducirDatoNum();
				sc.nextLine(); // limpiar buffer

				System.out.println(textos.getTextos(3));
				nombreCiudad = introducirDato();

				Ciudad ciudad = new Ciudad(año, nombreCiudad);
				ciudades.add(ciudad);

				do {
					System.out.println(textos.getTextos(4));
					respuesta = sc.next();

					if (respuesta.equalsIgnoreCase(textos.getTextos(1))) {
						System.out.println("Introduce el nombre del mes :");
						String nombreMes = introducirDato();

						System.out.println("Introduce la temperatura media de " + nombreMes + ":");
						double temperatura = sc.nextDouble();
						sc.nextLine();

						Mes mes = new Mes(nombreMes, temperatura);
						ciudad.setMeses(mes);
					}

				} while (respuesta.equalsIgnoreCase(textos.getTextos(1)));

			}

		} while (respuesta.equalsIgnoreCase(textos.getTextos(1)));

	}

	public static String introducirDato() {
		return sc.nextLine();
	}

	public static int introducirDatoNum() {
		return sc.nextInt();
	}

	public static void imprimirArray() {
		for (Ciudad c : ciudades) {
			System.out.println(c);
			c.enseÑarMes();
		}
	}
}
