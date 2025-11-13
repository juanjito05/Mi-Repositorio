package string;

import java.util.Scanner;

/*
 * @author Juan José Ortiz Jiménez
 */

public class IndexOffString {

	public static void main(String[] args) {

		String palabra;
		String Letra = "afg";
		char a;
		int po;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una palabra");
		palabra = sc.nextLine();
		
		
//		El inex off para saber la posición de la letra que busco (me indica en que posicion está la letra que quiero buscar)
		
		for (int i = 0; i < Letra.length(); i++) {
			a= Letra.charAt(i);
			po=palabra.indexOf(a);
			if(po==-1) {
				System.out.println("No se encuentra la letra " + a + " en esta palabra");
			}
			else {
				System.out.println("La letra " + a + " está en la posición " + po);
			}
		}

		
		
		

		

	}

}
