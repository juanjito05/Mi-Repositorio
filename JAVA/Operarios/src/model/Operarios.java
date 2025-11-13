package model;

import java.util.Scanner;

public class Operarios {
	private int[] sueldos;

	public Operarios() {
		
		sueldos = new int[5];

		;
	}

	public void imrpimir() {
		
	for (int i = 0; i < sueldos.length; i++) {
		System.out.println("Sueldo "+(i+1)+" : "+sueldos[i]);
	}
		
	}

	public int[] getSueldos() {
		return sueldos;
	}

	public void setSueldos(int[] sueldos) {
		this.sueldos = sueldos;
	}

	

	}

