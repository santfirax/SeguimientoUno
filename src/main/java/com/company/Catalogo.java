package com.company;

public class Catalogo {
    private String codigo;
    private String producto;
    private String tipo;
    private double precio;
    private String inventario;

    public Catalogo(String codigo, String producto, String tipo, double precio, String inventario) {
        this.codigo = codigo;
        this.producto = producto;
        this.tipo = tipo;
        this.precio = precio;
        this.inventario = inventario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getInventario() {
        return inventario;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codigo='" + codigo + '\'' +
                ", producto='" + producto + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio='" + precio + '\'' +
                ", inventario='" + inventario + '\'' +
                '}';
    }
}
