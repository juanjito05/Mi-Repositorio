package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Datos;
import model.Jugador;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Datos datos = new Datos();
		ArrayList<Jugador> jugadores = new ArrayList<>();

		agregarNombreJugador(jugadores, sc, datos);
		juego(jugadores, sc, datos);
	}

	private static void juego(ArrayList<Jugador> jugadores, Scanner sc, Datos datos) {

		int carta;
		double valor;
		int contador = 0;

		for (int i = 0; i < jugadores.size(); i++) {
			double suma = 0;
			System.out.println(datos.getDatos().get(2) + jugadores.get(i).getNombre());
			do {
				carta = (int) (Math.random() * 11) + 1;
				if (carta >= 8 && carta <= 10) {
					valor = 0.5;
				} else if (carta == 11) {
					System.out.println("Cuanto quieres que valga");
					double numeroIntro = introducriDecimal(sc);
					valor = numeroIntro;
				} else {
					valor = carta;
				}

				System.out.println(datos.getDatos().get(3) + valor);
				sc.nextLine();
				suma += valor;
				System.out.println(datos.getDatos().get(4) + suma);

			} while (suma <= 7.5);
			System.out.println(jugadores.get(i).getNombre() + " " + datos.getDatos().get(5));
		}
	}

	private static double introducriDecimal(Scanner sc) {
		return sc.nextDouble();
	}

	private static int introducirNum(Scanner sc) {
		return sc.nextInt();
	}

	private static void agregarNombreJugador(ArrayList<Jugador> jugadores, Scanner sc, Datos datos) {

		System.out.println(datos.getDatos().get(0));
		int n = introducirNum(sc);
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println(datos.getDatos().get(1) + " " + (i + 1) + ":");
			String nombre = sc.nextLine();
			jugadores.add(new Jugador(nombre));
		}

	}

}
