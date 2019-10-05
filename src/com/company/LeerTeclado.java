package com.company;

import java.util.Scanner;

public class LeerTeclado {
    private Scanner scanner = new Scanner(System.in);

    public int leerDato(String titulo) {
        System.out.println("Ingrese "+titulo);
        return scanner.nextInt();
    }
}
