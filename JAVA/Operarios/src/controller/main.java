package controller;

import java.util.Scanner;

import model.Operarios;

public class main {

	private int[] sueldos;

	private static Scanner sc = new Scanner(System.in);

	private static Operarios operario;

	public static void main(String[] ar) {
		operario = new Operarios();

		int[] sueldos = operario.getSueldos();

		for (int i = 0; i < operario.getSueldos().length; i++) {
			System.out.print("Ingrese valor de la componente:");
			sueldos[i] = sc.nextInt();
		}

		operario.imrpimir();

	}

}