package ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String[] palabras = { "manzana", "banana", "cereza", "durazno", "kiwi", "mango", "pera", "uva", "sandía",
				"limón" };
		String palabraAleatoria;
		char a;
		char espacio = '_';
		char letraIntro;
		char[] palabraIntro;
		int contador;
		int fallos = 0;

		for (int i = 0; i < palabras.length; i++) {
			int p = random.nextInt(palabras.length);
			palabraAleatoria = palabras[p];
//			System.out.println(palabraAleatoria);
//			for (int j = 0; j < palabraAleatoria.length(); j++) {
////				palabraIntro.charAT() = palabraAleatoria.charAt(j);
//				System.out.print(espacio+ " ");
//		
//			}
//			
			palabraIntro = new char[palabraAleatoria.length()];

			for (int j = 0; j < palabraAleatoria.length(); j++) {
				palabraIntro[j] = espacio;
			}
//			
//			Bucle
			while (!String.valueOf(palabraIntro).equals(palabraAleatoria) && fallos < 3) {
				System.out.println(palabraIntro);
				System.out.println("\u001b[1;34m¡Introduce letra aleatoria!\u001b[0m");
				letraIntro = sc.next().charAt(0);
				contador = 0;
				for (int k = 0; k < palabraAleatoria.length(); k++) {
					if (letraIntro == palabraAleatoria.charAt(k)) {
						palabraIntro[k] = letraIntro;
						contador++;
					}

				}
//				System.out.println(letraIntro);
//				Si contador sigue siendo cero se acumulan los fallos
				if (contador == 0) {
					fallos++;
				}
			}
			if (fallos == 3) {
				System.out.println("\u001b[1;31mGAME OVER\u001b[0m");
				break;
			}
			
			else {
				System.out.println("\u001b[1;32m¡GANASTE!\u001b[0m");
			}

		}
	}
}
		


