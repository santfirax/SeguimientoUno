package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private List<Contacto> contactoList = new ArrayList<>();


    public void agregarContactos(Contacto... c) {
        vefificaSiLaAgendaYaEstaLlena();
        for (Contacto contacto : c) {
            contactoList.add(contacto);
        }
    }

    public void agregarContacto(Contacto c) {
        vefificaSiLaAgendaYaEstaLlena();
        contactoList.add(c);
    }

    private void vefificaSiLaAgendaYaEstaLlena() {
        if (contactoList.size() > 15) {
            throw new RuntimeException("No se pueden agregar mas contactos, Agenda llena");
        }
    }

    public Boolean buscarContacto(String nombre) {
        Optional<Contacto> nombreContacto = contactoList.stream().parallel().filter(contacto -> contacto.getNombre().equals(nombre)).findFirst();
        return nombreContacto.isPresent();
    }

    public int getSizeOfAgenda() {
        return contactoList.size();
    }
}
