package com.company;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Jose Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public class Contacto {
    private final String nombre;
    private String telefono;
    private String correo;

    private Contacto(String nombre) {
        this.nombre = nombre;

    }

    public static Contacto crearNuevoContactoConNombre(String nombre) {
        return new Contacto(nombre);
    }

    public Contacto conTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Contacto yCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Contacto)) return false;

        Contacto contacto = (Contacto) o;

        return new EqualsBuilder()
                .append(getNombre(), contacto.getNombre())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getNombre())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new StringBuilder("Contacto{")
                .append("nombre='").append(nombre).append('\'')
                .append(", telefono='").append(telefono).append('\'')
                .append(", correo='").append(correo).append('\'')
                .append('}')
                .toString();
    }
}
