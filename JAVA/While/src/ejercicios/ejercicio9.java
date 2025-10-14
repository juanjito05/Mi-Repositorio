package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {

		int n;
		int i = 1;
		int j = 1;
		float factorial = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número");
		n = sc.nextInt();

		while (i <= n) {
			factorial = factorial * i;
			i++;
		}

		System.out.println("El factorial de " + n + " es: " + factorial);
	}

}