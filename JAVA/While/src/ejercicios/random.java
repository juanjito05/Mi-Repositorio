package ejercicios;

import java.util.Scanner;

/*
 * @author Juan José Ortiz Jiménez
 * 14/10/2025
 */

public class random {
	public static void main(String[] args) {

		int inicio;
		int fin;
		int n;
		int oportunidades;
		int numeroFallos = 0;
		double random;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce entre que números se va a generar");

		System.out.println("Desde el: ");
		inicio = sc.nextInt();

		System.out.println("hasta el: ");
		fin = sc.nextInt();

		if (inicio > fin) {
			System.out.println(
					"El número inicial es más grande que el final, el numero random se comprenden de menor a mayor");
		} else {
			System.out.println("Selecciona el número de oportunidades que desee: ");
			oportunidades = sc.nextInt();

			n = 0;
			random = (int) Math.floor(Math.random() * (inicio - fin + 1) + fin);

			System.out.println(random);

			for (int i = 0; i < oportunidades; i++) {
				System.out.println("Introduce numero:");
				n = sc.nextInt();
				if (n == random) {
					System.out.println("Correcto");
					break;
				} else {
					numeroFallos++;
					System.out.println("Incorrecto llevas " + numeroFallos + " fallos");
					if (numeroFallos == 3) {
						//numeroFallos=0;
						random = (int) Math.floor(Math.random() * (inicio - fin + 1) + fin);
						System.out.println(random);
						if (numeroFallos == oportunidades) {
							System.out.println("GAME OVER");
							break;
						}

					}
				}

			}

		}

	}

}
