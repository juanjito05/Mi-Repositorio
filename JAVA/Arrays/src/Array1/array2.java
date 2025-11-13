package Array1;

import java.util.Scanner;

public class array2 {

	private static int[] array1;
	private static int[] array2;
	private static int[] arrayResultado;

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		array1 = new int[2];
		array2 = new int[2];
		arrayResultado = new int[2];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("\u001b[1;34m Introduce el número\u001b[0m");
			array1[i] = sc.nextInt();
			System.out.println("\u001b[1;34m Introduce el número\u001b[0m");
			array2[i] = sc.nextInt();

			arrayResultado[i] = array1[i] + array2[i];
		}

		for (int i = 0; i < array1.length; i++) {

			System.out.print("La suma de " + array1[i] + " y " + array2[i] + " es: " + arrayResultado[i] + " ");
		}

	}
}
