package model;

import java.util.ArrayList;

public class Datos {
	private ArrayList<String> textos = new ArrayList<>();

	public Datos() {

		textos.add("Introduce piedra '1', papel '2', tijeras '3'"); // 4
		textos.add("Empate"); // 5
		textos.add("Gana el jugador"); // 6
		textos.add("Gana la máquina"); // 7

		textos.add("Bienvenido al juego de piedra papel tijeras");
		textos.add("¿Quiere jugar una partida?");
		textos.add("si");
		textos.add("Partidas");
	}

	public ArrayList<String> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}

}
