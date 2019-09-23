package com.company;

/**
 * @author Jose Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public class App {
    private static String opcion;

    public static void main(String[] args) {
        opcion = mostrarOpcionesDeMenu();
        while (!opcion.equals("S")) {
            Menu.getInstance().ejecutarOpcion(MenuTypes.valueOf(opcion));
            opcion = mostrarOpcionesDeMenu();
        }
        System.out.println("Has salido del programa");
    }

    private static String mostrarOpcionesDeMenu() {
        System.out.println("A) Para agregar un contacto");
        System.out.println("B) Para buscar un contacto");
        System.out.println("C) Listar Agenda");
        System.out.println("D) Ver si la agenda esta llena");
        System.out.println("E) Ver espacios libre de la agenda");
        System.out.println("S) Para salir Del Programa");
        System.out.println("Ingrese una opción:");
        return Menu.getInstance().leerEntradaDeConsola();
    }
}
