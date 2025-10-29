package metodo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Juanjo
 * 29/10/2025
 */

public class Estudiantes2 {

	public static void main(String[] args) {

		int n;

		ArrayList<Integer> mañana;
		ArrayList<Integer> tarde;
		ArrayList<Integer> noche;

		mañana = new ArrayList<>();
		tarde = new ArrayList<>();
		noche = new ArrayList<>();

		System.out.println("Turno de mañana");
		n = introducirNumero();
		mañana = rellenarArray(mañana, n);

		System.out.println("Turno de tarde");
		n = introducirNumero();
		tarde = rellenarArray(tarde, n);

		System.out.println("Turno de noche");
		n = introducirNumero();
		noche = rellenarArray(noche, n);

		int proMañana = obTenerPromedio(mañana);
		int proTarde = obTenerPromedio(tarde);
		int proNoche = obTenerPromedio(noche);

		System.out.println(
				"Promedio mañana: " + proMañana + "; promedio tarde: " + proTarde + "; promedio noche " + proNoche);

		System.out.println(
				"El promedio más grande es del turno de " + comrprobarPromedios(proMañana, proTarde, proNoche));
	}

	private static String comrprobarPromedios(int pro1, int pro2, int pro3) {
		if (pro1 > pro2 && pro1 > pro3) {
			return "mañana";
		}
		if (pro2 > pro1 && pro2 > pro3) {
			return "tarde";
		}
		if (pro3 > pro1 && pro3 > pro2) {
			return "noche";
		} else {
			return "";
		}

	}

	private static int obTenerPromedio(ArrayList<Integer> tabla) {
		int suma = 0;
		int promedio = 0;
		for (int i = 0; i < tabla.size(); i++) {
			suma = suma + tabla.get(i);
			promedio = suma / tabla.size();
		}
		return promedio;
	}

	private static ArrayList<Integer> rellenarArray(ArrayList<Integer> tabla, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Para la edad del alumno " + i + " ");
			tabla.add(introducirNumero());

		}
		return tabla;
	}

	public static int introducirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero");
		return sc.nextInt();
	}

	public static ArrayList<Integer> imprimirArray(ArrayList<Integer> tabla) {
		for (int i = 0; i < tabla.size(); i++) {
			System.out.print(tabla.get(i) + " ");
		}
		return tabla;
	}
}
