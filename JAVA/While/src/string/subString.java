package string;

import java.util.Scanner;

/*
 * @author Juan José Ortiz Jiménez
 */

public class subString {

	public static void main(String[] args) {

		String palabra;
		;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una palabra");
		palabra = sc.nextLine();

		for (int i = 0; i < palabra.length(); i=i+2) {
			if(palabra.length() %2!=0 ) {
				palabra=palabra+ " ";
			}
			System.out.println(palabra.substring(i,i+2));
		}

	}

}
