package string;

import java.util.Scanner;

/*
 * @author Juan José Ortiz Jiménez
 */

public class InvertirLetra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce palabra");
		String palabra = sc.nextLine();
		String palabraInvertida = "";

		for (int i = palabra.length(); i >= 0; i--) {
			palabraInvertida += palabra.charAt(i);
		}

		System.out.println(palabraInvertida);

	}

}
