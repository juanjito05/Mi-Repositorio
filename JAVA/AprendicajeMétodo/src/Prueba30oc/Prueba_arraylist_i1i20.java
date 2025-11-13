package Prueba30oc;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Juan José Ortiz Jiménez
 * 30/10/2025
 */
public class Prueba_arraylist_i1i20 {
	/*
	 * método main
	 */
	public static void main(String[] args) {

		ArrayList<String> Palabras = new ArrayList<>();

		Palabras = rellenarArray(Palabras, 4);
		System.out.println("La suma del array es: " + obTenerSuma(Palabras));
		imprimirPosicionArray(Palabras);
		modificarPalabra(Palabras);
		imprimirArray(Palabras);
		quitarVocales(Palabras);
		imprimirArray(Palabras);

	}

	/*
	 * Uso el replaceall en cada palabra del array para remplazar cualquier tipo de
	 * vocal que haya en cada plabra por un string vacío
	 */

	public static void quitarVocales(ArrayList<String> tabla) {
		for (int i = 0; i < tabla.size(); i++) {
			String sinVocales = tabla.get(i).replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
			tabla.set(i, sinVocales);
		}
	}
	/*
	 * Método para rellenar el array y te pedirá que introducas una palabra un
	 * número de veces igual al tamaño del array que se indque por parámetro
	 */

	private static ArrayList<String> rellenarArray(ArrayList<String> tabla, int n) {
		for (int i = 1; i < n; i++) {
			String palabra = introducirPalabra("Introduce palabra");
			if (comprobarPlabra(palabra)) {
				System.out.println("La palabra tiene que ser de más de 4 letras");
			} else {
				tabla.add(palabra);
			}
		}
		return tabla;
	}

	/*
	 * Se coge la segunda posición del array y la alterna con la palabra que
	 * introduzcas
	 */

	private static void modificarPalabra(ArrayList<String> tabla) {
		String palabra = introducirPalabra("Modifica palabra");
		for (int i = 0; i < tabla.size(); i++) {
			tabla.set(1, palabra);
		}
	}

	/*
	 * Comrprueba si la palabra es mayor de 4 carácteres, si es menor te devolverá
	 * una advertencia de que tiene que ser más de 4
	 */

	private static boolean comprobarPlabra(String texto) {
		if (texto.length() < 3) {
			return true;
		}
		return false;
	}

	/*
	 * Método para introducir palabra
	 */

	public static String introducirPalabra(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.println(texto);
		return sc.nextLine();
	}

	/*
	 * Método para calcular el tamaño de cada plabra introducida
	 */
	private static int obTenerSuma(ArrayList<String> tabla) {
		int suma = 0;

		for (int i = 0; i < tabla.size(); i++) {
			suma = suma + tabla.get(i).length();
		}
		return suma;
	}

	/*
	 * Imrpime la posicion que este la palabra introducida
	 */
	public static ArrayList<String> imprimirPosicionArray(ArrayList<String> tabla) {
		for (int i = 0; i < tabla.size(); i++) {
			System.out.print(tabla.get(i).length() + " ");
		}
		return tabla;
	}

	/*
	 * Imprime el array
	 */
	public static ArrayList<String> imprimirArray(ArrayList<String> tabla) {
		for (int i = 0; i < tabla.size(); i++) {
			System.out.print(tabla.get(i) + " ");
		}
		return tabla;
	}

}
