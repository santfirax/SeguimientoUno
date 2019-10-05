package com.company;

public class CalcuarAltura {
    private double catetoOpuesto;
    private double catetoAdyacente;
    private double angulo;

    public double getCatetoOpuesto() {
        return catetoOpuesto;
    }

    public void setCatetoOpuesto(double catetoOpuesto) {
        this.catetoOpuesto = catetoOpuesto;
    }

    public double getCatetoAdyacente() {
        return catetoAdyacente;
    }

    public void setCatetoAdyacente(double catetoAdyacente) {
        this.catetoAdyacente = catetoAdyacente;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double calcularAlturaConCatetoAdyacente() {
        return Math.tan(angulo) * catetoAdyacente;
    }
}
