package metodo;

import java.util.Scanner;

public class Estudiantes {

	public static void main(String[] args) {

		int[] mañana;
		mañana = new int[5];
		int[] tarde;
		tarde = new int[5];
		int[] noche;
		noche = new int[5];

		System.out.println("Turno de mañana");
		mañana = rellenarArray(mañana);
		System.out.println("Turno de tarde");
		tarde = rellenarArray(tarde);
		System.out.println("Turno de noche");
		noche = rellenarArray(noche);

		int proMañana = obTenerPromedio(mañana);

		int proTarde = obTenerPromedio(tarde);

		int proNoche = obTenerPromedio(noche);

		System.out.println(
				"Promedio mañana: " + proMañana + "; promedio tarde: " + proTarde + "; promedio noche " + proNoche);
	}

	private static int[] rellenarArray(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = introducirNumero();
		}
		return tabla;
	}

	public static int introducirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero");
		return sc.nextInt();
	}

	public static int obTenerPromedio(int[] tabla) {
		int suma = 0;
		int promedio = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma = suma + tabla[i];
			promedio = suma / tabla.length;
		}
		return promedio;
	}

}
