package string;

import java.util.Scanner;

/*
 * @author Juan Jose Ortiz Jimenez
 */

public class IndexOffCaracter {

	public static void main(String[] args) {

		String palabra;
		char Letra = 'a';

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una palabra");
		palabra = sc.nextLine();
		
		
//		El inex off para saber la posición de la letra que busco (me indica en que posicion está la letra que quiero buscar)

		int i = palabra.indexOf(Letra);
		
		if(i==-1) {
			System.out.println("No se encuentra la letra " + Letra + " en esta palabra");
		}
		else {
			System.out.println("La letra " + Letra + " está en la posición " + i);
		}

		

	}

}
