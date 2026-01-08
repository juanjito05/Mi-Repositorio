package controller;

//Ejercicio 9.1: Traductor que solicita varios numeros . entero e imprime la expresión de dicho número en español.
//Sólo se aceptan número menores de 1000.

//y guarda los  solo tres numeros  los ultimos tres que se hayan metido

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import model.Numeros;

/*
 * @author Juan Jose Ortiz JiMenez
 */
public class TraduceNumincompleto {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Numeros numeros = new Numeros();
		ArrayList<Integer> numList = new ArrayList<>();

		rellenarNumeros(numList, sc);

		numList = pasarAstring(numeros, numList);

		imprimirTresUltimosNum(numList);

	}

	private static void imprimirTresUltimosNum(ArrayList<Integer> numList) {

		System.out.println("Últimos números introducidos");
		for (int i = numList.size() - 3; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}

	}

	private static ArrayList<Integer> pasarAstring(Numeros numeros, ArrayList<Integer> numList) {
		for (int n : numList) {
			int centenas = n / 100;
			int decenas = (n / 10) % 10;
			int unidades = n % 10;

			if (decenas == 1) {
				System.out.println(numeros.getCentenas().get(centenas) + " " + numeros.getDieci().get(unidades));
			} else {
				System.out.println(numeros.getCentenas().get(centenas) + " " + numeros.getDecenas().get(decenas) + " "
						+ numeros.getUnidades().get(unidades));
			}
		}
		return numList;

	}

	public static void rellenarNumeros(ArrayList<Integer> numList, Scanner sc) {
		System.out.println("Introduce 10 numeros: ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce numero: ");
			int n = introducirNum(sc);
			numList.add(n);
		}
	}

	private static int introducirNum(Scanner sc) {
		return sc.nextInt();
	}
}
