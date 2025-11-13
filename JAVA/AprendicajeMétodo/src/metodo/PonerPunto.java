package metodo;

import java.util.Scanner;

public class PonerPunto {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce número");
		n = sc.nextInt();

		String numero = String.valueOf(n);

		for (int i = 0; i < numero.length(); i++) {
			if (numero.length() >= 3) {
				char numero0 = numero.charAt(3);
				numero0 = '+';
				numero = numero + numero0;
			}
		}

		System.out.println(numero);

	}
}
