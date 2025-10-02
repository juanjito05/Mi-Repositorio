package arrayList;

import java.util.Scanner;

public class operacion {

	public static void main(String[] args) {

		int o;
		int a = 5;
		int b = 5;
		int resultado = 0;
		int resultado2 = 0;

		resultado = b + (++a);
		resultado2 = b + (a++);

		System.out.println("Que prefieres:");
		System.out.println("1 = operación 1 o 2 = operación dos");
		Scanner sc = new Scanner(System.in);
		o = sc.nextInt();

		if (o == 1) {
			System.out.println(resultado);
		} else if (o == 2) {
			System.out.println(resultado2);
		}

	}
}
