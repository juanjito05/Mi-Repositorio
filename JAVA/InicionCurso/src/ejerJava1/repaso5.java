package ejerJava1;

import java.util.Scanner;

public class repaso5 {

	public static void main(String[] args) {
		int n;
		int porciento;
		double porcentaje;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el precio del producto");
		n = sc.nextInt();
		System.out.println("Introduzca el porcentaje que quisiera hacer");
		porciento = sc.nextInt();

		porcentaje = n * (porciento / 100.0);

		System.out.println("Este es " + porciento + " % de " + n + " es: " + porcentaje);
	}

}
