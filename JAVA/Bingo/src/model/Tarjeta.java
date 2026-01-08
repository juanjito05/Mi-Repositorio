package model;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Juan José Ortiz Jiménez
 *	25/11/2025 
 */

public class Tarjeta {

	ArrayList<Integer> numCard;

	public Tarjeta() {

		numCard = new ArrayList<>();

	}

	public void imprimirTarjeta(ArrayList<Integer> numCard) {
		for (int i = 0; i < numCard.size(); i++) {
			System.out.print(numCard.get(i) + " ");
		}
		System.out.println();
	}

	public ArrayList<Integer> agregarNumCardMaquina(ArrayList<Integer> numCard) {

		for (int i = 0; i < 7; i++) {
			int numero = (int) (Math.random() * 20) + 1;
			if (!numCard.contains(numero)) {
				numCard.add(numero);
			}

		}

		return numCard;
	}
	


	public ArrayList<Integer> getNumCard() {
		return numCard;
	}

	public void setNumCard(ArrayList<Integer> numCard) {
		this.numCard = numCard;
	}

}
