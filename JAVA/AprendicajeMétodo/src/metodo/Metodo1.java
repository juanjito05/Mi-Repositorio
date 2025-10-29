package metodo;

import java.util.Scanner;

public class Metodo1 {

	public static int dni(int n) {
		int resto = n % 23;
		return resto;
	}

	public static int introducirNumero() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static void main(String[] args) {

		String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("Introduzca tu dni");

		int n = introducirNumero();
		int numero = dni(n);
		char dni = Letras.charAt(numero);
		System.out.println("Tu dni es " + n + dni);
	}
}
