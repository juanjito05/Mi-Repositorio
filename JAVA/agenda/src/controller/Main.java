package controller;

import java.util.*;
import model.Clientes;
import model.DatosString;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Clientes> conjunto = new ArrayList<>();
        DatosString textos = new DatosString();
        String respuesta;

        do {
            System.out.println(textos.getTextos(0));
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase(textos.getTextos(1))) {
                Clientes cliente = new Clientes(conjunto.size() + 1);

                System.out.println(textos.getTextos(2));
                cliente.setCif(teclado.next());

                teclado.nextLine(); // limpiar buffer
                System.out.println(textos.getTextos(3));
                cliente.setNombre(teclado.nextLine());

                System.out.println(textos.getTextos(4));
                cliente.setDireccion(teclado.nextLine());

                System.out.println(textos.getTextos(5));
                cliente.setCp(teclado.nextInt());

                System.out.println(textos.getTextos(6));
                cliente.setAntiguedad(teclado.nextInt());

                conjunto.add(cliente);
                teclado.nextLine(); // limpiar buffer
            }

        } while (respuesta.equalsIgnoreCase(textos.getTextos(1)));

        System.out.println(textos.getTextos(7));
        
        for (Clientes c : conjunto) {
            c.mostrarCliente();
        }

        teclado.close();
    }
}

