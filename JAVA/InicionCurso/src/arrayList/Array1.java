package arrayList;

import java.util.Scanner;

/*
 * @author Juan José Ortiz Jiménez
 */
public class Array1 {

    public static void main(String[] args) {
        String palabra;
        char[] letras;
        int totalLetras = 0;
//		Introducir por teclado

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra");
        palabra = sc.nextLine();

//		Agregar el texto introducido al array de palabras

        letras = new char[palabra.length()];
        System.out.println(palabra);

//		bucle paara leer el array de letras gyardadas y convertir en caracteres
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.charAt(i);
        }

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);

        }

    }
}
