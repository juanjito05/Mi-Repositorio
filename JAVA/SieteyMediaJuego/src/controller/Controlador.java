package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.Datos;
import model.Jugador;

public class Controlador {

	public Controlador() {

		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> jugadores = new ArrayList<>();
		Datos datos = new Datos();

		crearJugadore(sc, jugadores, datos);
		rondas(sc, jugadores, datos);

	}

	private static void rondas(Scanner sc, ArrayList<Jugador> jugadores, Datos datos) {

		for (int i = 0; i < 2; i++) {
			System.out.println(datos.getTextos().get(0) + " " + (i + 1));
			juego(sc, jugadores, datos);
		}

	}

	private static void crearJugadore(Scanner sc, ArrayList<Jugador> jugadores, Datos datos) {

		System.out.println(datos.getTextos().get(1));
		int n = sc.nextInt();
		String nombre;

		for (int i = 0; i < n; i++) {
			System.out.println(datos.getTextos().get(2) + i + " : ");
			nombre = sc.next();
			sc.nextLine();
			jugadores.add(new Jugador(nombre));
		}
	}

	private static void juego(Scanner sc, ArrayList<Jugador> jugadores, Datos datos) {

		int carta;
		double valor;

		int victorias = 0;
		for (int i = 0; i < jugadores.size(); i++) {
			double suma = 0;
			System.out.println(datos.getTextos().get(4) + " " + jugadores.get(i).getNombre());
			do {
				carta = (int) (Math.random() * 11) + 1;
				if (carta >= 8) {
					valor = 0.5;
				} else {
					valor = carta;
				}
				System.out.println(carta);
				jugadores.get(i).getCartas().add(carta);
				sc.nextLine();
				suma = suma + valor;
				System.out.println("Suma: " + suma);

				if (suma == 7.5) {
					victorias++;
					System.out.println("Jugador " + jugadores.get(i).getNombre() + " ha ganado");
					jugadores.get(i).getVictorias().add(victorias);
				} else if (suma >= 7.5) {
					System.out.println("Jugador " + jugadores.get(i).getNombre() + " ha perdido");
					cambaiarNombreJugador(sc, i, jugadores);
				}

			} while (suma == 7.5 || suma <= 7.5);

		}

	}

	private static void cambaiarNombreJugador(Scanner sc, int iterador, ArrayList<Jugador> jugadores) {
		System.out.println("Añadele un mote al jugador");
		String nombre = sc.nextLine();
		jugadores.get(iterador).setNombre(nombre);
		System.out.println("Ahora se llamara " + jugadores.get(iterador).getNombre());
	}
}
