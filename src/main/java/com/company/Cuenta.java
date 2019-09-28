package com.company;

/**
 * @author Jose Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public class Cuenta {
    private final String nombreDelTitular;
    private double saldo;

    public Cuenta(String nombreDelTitular) {
        this.nombreDelTitular = nombreDelTitular;
    }

    public Cuenta(String nombreDelTitular, double saldo) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldo = saldo;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            throw new RuntimeException("SALDO INSUFICIENTE");
        }
        this.saldo -= cantidad;
    }
}
