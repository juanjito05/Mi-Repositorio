package Array1;

import java.util.Random;
import java.util.Scanner;

public class array3 {

	private static int[] array;
	private static int[] arrayIntro;

	private static Scanner sc;

	private static int n;
	private static int random;
	private static int contador;
	private static String[] puntosGanados;

	public static void main(String[] args) {

		int contador = 0;
		boolean esRepetido;
		int puntuacion = 0;
		boolean acierto = false;
		sc = new Scanner(System.in);

		System.out.println("\u001b[1;33mQUINIELA\u001b[0m");

		System.out.println("\u001b[1;36mIntroduce el tamaño del array\u001b[0m");
		array = new int[sc.nextInt()];

		arrayIntro = new int[array.length];

		System.out.println("\u001b[1;36mNUMEROS\u001b[0m");

		while (contador < array.length) {
			random = (int) (Math.random() * array.length) + 1;
			esRepetido = false;

			for (int i = 0; i < contador; i++) {
				if (array[i] == random) {
					esRepetido = true;
					break;
				}
			}
			if (!esRepetido) {
				array[contador] = random;
				System.out.print(array[contador] + " ");
				contador++;
			}

		}

		System.out.println(" ");

		for (int i = 0; i < array.length; i++) {
			System.out.println("\u001b[1;34mIntroduce número para la posición \u001b[0m" + i);
			arrayIntro[i] = sc.nextInt();
			puntuacion++;
		}
		while (puntuacion < arrayIntro.length) {
			for (int i1 = 0; i1 < puntuacion; i1++) {
				if (arrayIntro[i1] == array[i1]) {
					acierto = true;
				}
			}

			if (!acierto) {
				System.out.print("Fallo");
			} else {
				System.out.print("Acierto");
			}
		}

	}

}

