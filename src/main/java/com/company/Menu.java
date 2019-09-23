package com.company;

import java.util.Scanner;

/**
 * @Author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public class Menu {
    private static Menu ourInstance = new Menu();
    private static Scanner scanner = new Scanner(System.in);

    public static Menu getInstance() {
        return ourInstance;
    }

    private Menu() {
    }

    public void ejecutarOpcion(MenuTypes menuTypes) {
        menuTypes.escogerOpcion();
    }

    public String leerEntradaDeConsola() {
        return scanner.nextLine();
    }
}
