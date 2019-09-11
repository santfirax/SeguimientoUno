package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mostrarNumerosDelUnoAlCien();
        mostrarNumerosDelCienAlUno();
        numerosParesDelUnoAlCientoCincuenta();
        sumatoriaDelUnoAlDosCientos();
        imprimirAstericos();
        mostrarTabla();
    }

    private static void mostrarNumerosDelUnoAlCien() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }
    }

    private static void mostrarNumerosDelCienAlUno() {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }

    private static void numerosParesDelUnoAlCientoCincuenta() {
        for (int i = 1; i <= 150; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es numero par");
            }

        }
    }

    private static void sumatoriaDelUnoAlDosCientos() {
        int suma = 0;
        for (int i = 1; i < 200; i++) {
            suma += i;
        }
        System.out.println("Sumatoria:" + suma);
    }

    private static void imprimirAstericos() {
        Scanner scanner = new Scanner(System.in);
        int numeroAstericos = scanner.nextInt();
        for (int i = 0; i < numeroAstericos; i++) {
            System.out.print("*");
        }
    }

    private static void mostrarTabla() {
        int filas = 10;
        int columnas = 10;
        int tabla[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println("");
        }
    }
}
