package arrayList;

import java.util.Scanner;

public class Contrasena {

	public static void main(String[] args) {

		String palabra = "";
		String contraseña = "abcd345";
		int limite = contraseña.length();

		Scanner sc = new Scanner(System.in);

		while (!palabra.equals(contraseña)) {
			System.out.println("Introduce la contraseña porfavor");
			palabra = sc.nextLine();
			
			if(palabra.length() != limite) {
				System.out.println("Contraseña introducida no coincide con el número de carácteres de la contraseña");
				
			}
			else {
				if (palabra.equals(contraseña)) {
					System.out.println("Contraseña correcta");
				} else {
					System.out.println("<<" + palabra + ">>" + " no es la contraseña correcta:(");
				}
			}

		}

	}
}
