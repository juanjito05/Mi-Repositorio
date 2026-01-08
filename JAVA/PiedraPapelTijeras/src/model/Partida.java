package model;

import java.util.ArrayList;

public class Partida {

	ArrayList<Integer> jugadas;

	public Partida() {

		jugadas = new ArrayList<>();
	}

	public ArrayList<Integer> getJugadas() {
		return jugadas;
	}

	public void setJugadas(int n) {
		this.jugadas.add(n);
	}
	
	@Override
    public String toString() {
        return "Jugadas ganadas: "+ jugadas ;
    }
 
}
