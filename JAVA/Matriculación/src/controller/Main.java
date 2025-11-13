package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.DatosString;
import model.Matricula;

/*
 * @authors: Juan José Ortiz
 */

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Matricula> matriculas = new ArrayList<>();
	private static DatosString textos = new DatosString();

	public static void main(String[] args) {

		introducirArray();
		imrpmirArray();

	}

	public static String introducirDato() {
		return sc.nextLine();

	}

	public static int introducirDatoNum() {
		return sc.nextInt();

	}

	public static void introducirArray() {

		String respuesta;
		Integer añoActual = null;

		do {
			System.out.println(textos.getTextos(0));
			respuesta = sc.next();

			if (respuesta.equalsIgnoreCase(textos.getTextos(1))) {

				Matricula matricula = new Matricula(matriculas.size() + 1);

				System.out.println(textos.getTextos(2));
				matricula.setAño(introducirDatoNum());
				sc.nextLine(); // limpiar buffer

				System.out.println(textos.getTextos(3));
				matricula.setNombreMes(introducirDato());
//				sc.nextLine(); 

				System.out.println(textos.getTextos(4));
				matricula.setNumMatriculas(introducirDatoNum());
				sc.nextLine();

				if (!matriculas.isEmpty()) {
					Matricula maAnterior = matriculas.get(matriculas.size() - 1);
					int numAnterior = maAnterior.getNumMatriculas();
					matricula.calcularDif(numAnterior);
				} else {
					matricula.calcularDif(0);
				}

				matriculas.add(matricula);
				sc.nextLine(); // limpiar buffer

			} else {

			}

		} while (respuesta.equalsIgnoreCase(textos.getTextos(1)));
//		System.out.println(textos.getTextos(0));

		sc.close();
	}

	public static void imrpmirArray() {
		System.out.println(textos.getTextos(5));
		for (Matricula m : matriculas) {
			m.mostrarMatricula();
		}
	}

}
