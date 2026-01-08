package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.Datos;
import model.Tarjeta;

/*
 * @author Juan José Ortiz Jiménez
 *	25/11/2025 
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Tarjeta> tarjetas = new ArrayList<>();
		ArrayList<Integer> numeroBingo = new ArrayList<>();
		Datos textos = new Datos();

		generarTarjeta(tarjetas, sc, textos);
		agregarNumCard(tarjetas, sc);
		jugarBingo(tarjetas, numeroBingo, sc, textos);

	}

	public static void agregarNumCard(ArrayList<Tarjeta> tarjetas, Scanner sc) {

		int mitad = tarjetas.size() / 2;

		for (int i = 0; i < mitad; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.println("Añade numeros a la tarjeta");
				int numero = introducirDatoNum(sc);
				if (!tarjetas.get(i).getNumCard().contains(numero)) {
					tarjetas.get(i).getNumCard().add(numero);
				}

			}

		}
		for (int i = mitad; i < tarjetas.size(); i++) {
			tarjetas.get(i).agregarNumCardMaquina(tarjetas.get(i).getNumCard());
		}
	}

	public static int introducirDatoNum(Scanner sc) {
		return sc.nextInt();
	}

	/*
	 * Le pide al usuario cuantas tarjetas van a jugar
	 */
	private static void generarTarjeta(ArrayList<Tarjeta> tarjetas, Scanner sc, Datos textos) {

		System.out.println(textos.getTextos().get(0));
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			tarjetas.add(new Tarjeta());
		}

	}

	private static void jugarBingo(ArrayList<Tarjeta> tarjeta, ArrayList<Integer> numeroBingo, Scanner sc,
			Datos textos) {

		int numero = 0;

		for (int i = 0; i < tarjeta.size(); i++) {
			System.out.println("Tarjeta: " + (i + 1));
			tarjeta.get(i).imprimirTarjeta(tarjeta.get(i).getNumCard());

		}

		for (int i = 0; i < 15; i++) {
			numero = (int) (Math.random() * 20) + 1;
			if (!numeroBingo.contains(numero)) {
				numeroBingo.add(numero);
				System.out.println("Número bingo: " + numero);
				sc.nextLine();
			}

		}

		for (int i = 0; i < tarjeta.size(); i++) {
			int contador = 0;
			for (int j = 0; j < tarjeta.get(i).getNumCard().size(); j++) {
				if (numero == tarjeta.get(i).getNumCard().get(j)) {
					contador++;
				}
			}
			System.out.println(textos.getTextos().get(2) + (i + 1) + ": " + contador);
		}

	}

}
