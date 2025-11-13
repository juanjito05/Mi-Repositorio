package string;

import java.util.Scanner;

public class calcularPalabra {
	
	public static void main(String[] args) {
		
		String palabra;
		int totalPalabras=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una palabra");
		palabra = sc.nextLine();
		
		for (int i = 0; i < palabra.length(); i++) {
		
			System.out.println(palabra.charAt(i));
		}
		
		
		
	}
	
	
	

}
