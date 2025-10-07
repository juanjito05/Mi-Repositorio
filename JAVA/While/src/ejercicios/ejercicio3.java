package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		int i = 1;
		int n;
		int suma=0;
		int promedio=0;
		
		while(i <= 10) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un número");
			n = sc.nextInt();
			suma=suma+n;
			i++;
			promedio=suma/10;
		}
		
//		for (int j = 0; j < 10; j++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Introduce un número");
//			n = sc.nextInt();
//			suma=suma+n;
//			promedio=suma/i++;
//		}
	
		
		System.out.println("La suma de los numeros introducidos son: " + suma);
		System.out.println("El promedio de los numeros son: "+ promedio);
	}
}
