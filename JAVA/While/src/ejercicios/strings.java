package ejercicios;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class strings extends JFrame{
	
	public strings(){
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new strings();

		int n;
		int resto;
		char letra;
		String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca tu dni");
		n = sc.nextInt();

		resto = n % 23;

		System.out.println(resto);

		letra = Letras.charAt(resto);

		JOptionPane.showMessageDialog(null, "Tu DNI completo es: " + n +" " +letra);

	}
}
