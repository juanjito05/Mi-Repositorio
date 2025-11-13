package Array1;

import java.util.Scanner;

public class array {
	
	private static Scanner sc;
	private static int[] elemento;
	private static int suma;

	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		elemento = new int [4];
		
		
		
		for (int i = 0; i < elemento.length; i++) {
			System.out.println("\u001b[1;3mPosición \u001b[0m" + i +"\u001b[1;34m Introduce el número\u001b[0m");
			elemento[i]= sc.nextInt();
			suma=suma+elemento[i];
			
		}
		
		System.out.println(suma);
	}
}
