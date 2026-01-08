package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Usuario;

public class Main {

	public static void main(String[] args) {

		ArrayList<Usuario> usuarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		añadirUsuario(sc, usuarios);
		iniciarSesion(sc, usuarios);
	}

	private static void iniciarSesion(Scanner sc, ArrayList<Usuario> usuarios) {

		for (Usuario u : usuarios) {

			String nombre = "";
			String contraseña = "";
			while (!nombre.equals(u.getNombre()) || !contraseña.equals(u.getContraseñas())) {
				System.out.println("Introduce nombre del usuario");
				nombre = sc.nextLine();
				System.out.println("Introduce contraseña del usuario");
				contraseña = sc.nextLine();

				char a = ' ';
				char c = ' ';

				for (int i = 0; i < contraseña.length(); i++) {
					a = contraseña.charAt(i);
					for (int j = 0; j < u.getContraseñas().length(); j++) {
						c = u.getContraseñas().charAt(j);
						if (!nombre.equals(u.getNombre()) || !validarContraseña(a, c)) {
							System.out.println("Contraseña incorrecta");
						}
						else {
							System.out.println("Puede acceder");
						}
					}
				}

				
			}
			

		}

	}

	private static boolean validarContraseña(char a, char c) {

		if (a == c) {
			return true;
		} else {
			return false;
		}
	}

	private static void añadirUsuario(Scanner sc, ArrayList<Usuario> usuarios) {

		System.out.println("¿Quieres añadir un usuario? si/no");
		String respuesta = sc.nextLine();
		do {
			System.out.println("Introduce el nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduce la contraseña");
			String contraseña = sc.nextLine();

			usuarios.add(new Usuario(nombre, contraseña));

		} while (respuesta.equalsIgnoreCase("si"));

	}
}
