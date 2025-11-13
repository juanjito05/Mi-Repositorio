package controller;

import java.util.*;

import model.Jugador;

public class Main {

	public static void main(String[] args) {

		String nombre, provincia;
		Scanner teclado = new Scanner(System.in);
		Jugador lista[] = new Jugador[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduzca nombre del jugador " + (i + 1) + ": ");
			nombre = teclado.next();
			System.out.println("Introduzca provincia del jugador " + (i + 1) + ": ");
			provincia = teclado.next();
			Jugador jugador = new Jugador(nombre, provincia);
			lista[i] = jugador;
		}
		lista[0].setVictorias(lista[0].getVictorias() + 1);
		lista[1].setVictorias(3);
		lista[2].setVictorias(2);S
//		System.out.println(lista[2].getNombre());
		for (Jugador v : lista)
			System.out.println(v.getNombre() + " / " + v.getProvincia() + "/" + v.getVictorias());

	}
}

