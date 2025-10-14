package ejercicios;

import java.util.Iterator;

public class for3 {

	public static void main(String[] args) {
		
		int suma=0;
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <=i; j++) {
				suma++;
				System.out.print(suma);
			}
			System.out.println("");
		}
	}
}
