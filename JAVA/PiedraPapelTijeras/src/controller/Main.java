package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import model.Datos;
import model.Partida;

public class Main {

	public static void main(String[] args) {

		ArrayList<Partida> partidas = new ArrayList<>();
		partidas.add(new Partida());// 0 jugador
		partidas.add(new Partida());// 1 maquina
		Datos datos = new Datos();

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int maquina = 0;

		ejecucionPartida(sc, n, maquina, partidas, datos);

		mostrarJugadasGanadas(partidas, datos);
	}

	private static ArrayList<Partida> ejecucionPartida(Scanner sc, int n, int maquina, ArrayList<Partida> partidas,
			Datos datos) {
		System.out.println(datos.getTextos().get(4));

		String respuesta;
		int indicePartida = 1;
		do {
			System.out.println(datos.getTextos().get(5));
			respuesta = sc.nextLine();
			respuesta = respuesta.toLowerCase();
			if (respuesta.equals(datos.getTextos().get(6))) {
				partidas = partida(sc, n, maquina, partidas, datos, indicePartida);
				indicePartida++;

			}
		} while (respuesta.equals(datos.getTextos().get(6)));
		return partidas;

	}

	private static void mostrarJugadasGanadas(ArrayList<Partida> partidas, Datos datos) {
		System.out.println(datos.getTextos().get(7));
		for (Partida p : partidas) {
			if (p == partidas.get(0)) {
				System.out.println("JUGADOR \n" + p);
			} else if (p == partidas.get(1)) {
				System.out.println("MAQUINA \n" + p);
			}
		}

	}

	private static ArrayList<Partida> partida(Scanner sc, int n, int maquina, ArrayList<Partida> partidas, Datos datos,
			int indicePartida) {

		for (int i = 0; i < indicePartida; i++) {
			n = 0;
			while (n != 1 && n != 2 && n != 3) {
				System.out.println(datos.getTextos().get(0));
				n = sc.nextInt();
			}
			maquina = (int) (Math.random() * 3) + 1;
			System.out.println(maquina);
			if (n == maquina) {
				System.out.println(datos.getTextos().get(1));
				indicePartida--;
			} else if ((n == 1 && maquina == 3) || (n == 2 && maquina == 1) || (n == 3 && maquina == 2)) {
				System.out.println(datos.getTextos().get(2));
				partidas.get(0).setJugadas(indicePartida);

			} else {
				System.out.println(datos.getTextos().get(3));
				partidas.get(1).setJugadas(indicePartida);
			}
		}
		return partidas;
	}

}
