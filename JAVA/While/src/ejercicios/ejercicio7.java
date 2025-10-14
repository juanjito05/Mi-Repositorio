package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {

		int i = 0;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cantidad de numeros");
		n = sc.nextInt();

		while (i < n) {
			i++;
			if (i % 2 == 0) {
				System.out.println(i + ", es par");
			} else {
				System.out.println(i + ", es impar");
			}
		}
	}

}
