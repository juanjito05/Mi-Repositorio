package ejercicios;

import java.util.Scanner;

/*
 * 	EJERCICIO 6
 */
public class ejercicio8 {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		int n;
		int suma1 = 0;
		int suma2 = 0;
		Scanner sc = new Scanner(System.in);

		while (i < 3) {
			System.out.println("Introduzca una cantidad de numeros para la lista 1");
			n = sc.nextInt();
			suma1 = suma1 + n;
			i++;
			while (j < i) {
				System.out.println("Introduzca una cantidad de numeros para la lista 2");
				n = sc.nextInt();
				suma2 = suma2 + n;
				j++;

			}
		}

		System.out.println(suma1);
		System.out.println(suma2);

		if (suma1 > suma2) {
			System.out.println("Lista 1 mayor");
		} else if (suma2 > suma1) {
			System.out.println("Lista 2 mayor");
		}

	}

}
