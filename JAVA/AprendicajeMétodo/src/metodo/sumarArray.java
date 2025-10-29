package metodo;

import java.util.Iterator;
import java.util.Scanner;

public class sumarArray {

	public static int introducirNumero() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static int[] rellenarArray(int[] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = introducirNumero();
		}
		return tabla;
	}
	
	public static int[] imprimirArray(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
		    System.out.print(array[i] + " ");
		}
		return array;
	}

	public static void main(String[] args) {

		int[] array;
		System.out.println("Introducir tamaño del array");
		int n = introducirNumero();
		array = new int[n];
		array = rellenarArray(array);
		
		imprimirArray(array);
	}
}
