package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int i = 1;
		System.out.println("Introduce un límite");
		n = sc.nextInt();

		while (i <= n) {
			System.out.println(i++);

		}
	}
}
