package com.company;

import java.util.Random;

public class SeguimientoTres {
    private static final Horoscopo horoscopo = new Horoscopo();

    public static void ejecutarCalculoAltura() {
        CalcuarAltura calcuarAltura = new CalcuarAltura();
        LeerTeclado leerTeclado = new LeerTeclado();
        calcuarAltura.setCatetoAdyacente(leerTeclado.leerDato("cateto opuesto"));
        calcuarAltura.setAngulo(leerTeclado.leerDato("angulo"));
        final double altura = calcuarAltura.calcularAlturaConCatetoAdyacente();
        System.out.println("Altura del arbol:" + altura);
    }

    public static void generarNumeroAleatorio() {
        Random random = new Random();
        String numero = String.format("%06d", random.nextInt(1000000));
        System.out.println(numero);
    }

    public static void imprimirPalabraLowerCase(String palabra) {
        System.out.println("Palabra en lowercase:" + palabra.toLowerCase());


    }

    public static void imprimirPalabraCamelCase(String palabra) {
        System.out.println("Palabra en camelcase:" + palabra.substring(0, 1).toUpperCase() + palabra.substring(1));
    }

    public static void imprimirPalabraUpperCase(String palabra) {
        System.out.println("Palabra en uppercase:" + palabra.toUpperCase());
    }

    public static void mostrarHoroscopo() {
        horoscopo.mostrarHoroscopo();
    }

}
