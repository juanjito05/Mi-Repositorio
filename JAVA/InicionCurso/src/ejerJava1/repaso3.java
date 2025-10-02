package ejerJava1;

import java.util.Scanner;

public class repaso3 {

	private static void determinar(int n) {
		int num = n;
		if (n % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

	}

	private static void ladoCuadrado(int n) {
		int perimetro = n * 4;
		System.out.println(perimetro + "cm");

	}

	private static void productos(int n1, int n2, int n3, int n4) {
		int suma = n1 + n2;
		int producto = n3 * n4;

		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);
	}

	private static void promedio(int n1, int n2, int n3, int n4) {

		int suma = n1 + n2 + n3 + n4;
		int promedio = suma / 4;

		System.out.println("La suma es: " + suma);
		System.out.println("El promedio es: " + promedio);

	}

	private static void promedioNotas(int n1, int n2, int n3) {

		int suma = n1 + n2 + n3;
		int promedio = suma / 3;

		if (promedio >= 7) {
			System.out.println("Nota: " + promedio + ", promociona");

		} else {
			System.out.println("Nota: " + promedio + ", repite");
		}

	}
	
	private static void digitos(int n) {
		
		if (n>=10) {
			System.out.println("Tiene dos dígitos");
			
		} else {
			System.out.println("Tiene un dígito");
		}
		

	}

	public static void main(String[] args) {
		System.out.println("Introduzca 2 números");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		int n4 = sc.nextInt();
//		determinar(n1);
//		ladoCuadrado(1n);
//		productos(n1,n2,n3,n4);
//		promedio(n1,n2,n3,n4);
//		promedioNotas(n1, n2, n3);
		digitos(n1);
	}
}
