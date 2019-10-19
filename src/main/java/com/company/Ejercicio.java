package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();
        nombres.add("Santiago");
        nombres.add("CESAR");
        nombres.add("JOSE");
        nombres.add("Luis");
        nombres.add("LORENA");
        nombres.stream().filter(n -> n.length() <= 6)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
