package ejerJava1;

import java.util.Scanner;

public class repaso4 {

	
	public static void main(String[] args) {
		
	int precio;
	int cantidad;
	int totalPagar;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el precio del producto");
	precio= sc.nextInt();
	System.out.println("Introduzca cuantas unidades quiere");
	cantidad = sc.nextInt();
	
	totalPagar=precio*cantidad;
	System.out.println("Precio de la unidad: \t"+ precio+"€");
	System.out.println("Cantidad que eligió: \t"+ cantidad);
	System.out.println("Total a pagar:  \t"+ totalPagar+"€");
	}
	
}
