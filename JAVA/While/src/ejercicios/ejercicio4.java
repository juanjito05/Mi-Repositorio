package ejercicios;

/*
 * @author Juan Jose
 */

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

		int piezas;
		int i = 1;
		float largo;
		int cantidad = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas piezas desea introducir");
		piezas = sc.nextInt();

		while (i <= piezas) {
			System.out.println("¿Cuanto mide el largo de la pieza " + i + "?");
			largo = sc.nextFloat();
			if (largo >= 1.20 && largo <= 1.30) {
				cantidad = cantidad + 1;
			} else {
				System.out.println("No están disponibles esas medidas");
			}
			i++;
		}

		System.out.println("La cantidad de piezas que puedes adquirir son estas " + cantidad);

	}
}
