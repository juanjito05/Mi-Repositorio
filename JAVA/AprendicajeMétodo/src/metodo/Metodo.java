package metodo;

import java.util.Scanner;

public class Metodo {

	public static boolean esBisiesto(int n) {

		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce año");
		int año = sc.nextInt();

		if (esBisiesto(año)) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
	}
}
