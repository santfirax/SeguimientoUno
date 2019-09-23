package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Jose Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public class Agenda {
    private static final Logger LOG = LoggerFactory.getLogger(Agenda.class);
    public static final int TAMANO_MAXIMO_AGENDA = 15;
    private List<Contacto> contactoList = new ArrayList<>();


    public void agregarContacto(Contacto c) {
        vefificaSiLaAgendaYaEstaLlena();
        contactoList.add(c);
        LOG.info("Contacto agregado exitosamente");
    }

    void vefificaSiLaAgendaYaEstaLlena() {
        if (contactoList.size() == TAMANO_MAXIMO_AGENDA) {
            throw new RuntimeException("No se pueden agregar mas contactos, Agenda llena");
        }
        LOG.info("Aun se pueden agregan contactos a la agenda");
    }

    public void buscarContacto(String nombre) {
        if (!contactoList.isEmpty()) {
            Optional<Contacto> optionalContacto = contactoList.stream().parallel().filter(contacto -> contacto.getNombre().equals(nombre)).findAny();
            if (optionalContacto.isPresent()) {
                LOG.info(optionalContacto.get().toString());
            } else {
                LOG.info("Contacto no encontrado");
            }

        } else {
            LOG.info("La agenda esta vacia");
        }
    }

    public int getSizeOfAgenda() {
        final int sizeOfAgenda = contactoList.size();
        LOG.info("Tamaño de agenda: " + sizeOfAgenda);
        return sizeOfAgenda;
    }

    public void listarAgenda() {
        if (!contactoList.isEmpty()) {
            contactoList.forEach(System.out::println);
        }
    }

    public Contacto crearContacto() {
        Menu menu = Menu.getInstance();
        LOG.info("Ingrese nombre de contacto:");
        String nombre = menu.leerEntradaDeConsola();
        LOG.info("Ingrese telefono:");
        String telefono = menu.leerEntradaDeConsola();
        LOG.info("Ingrese correo:");
        String correo = menu.leerEntradaDeConsola();
        return Contacto.crearNuevoContactoConNombre(nombre).conTelefono(telefono).yCorreo(correo);
    }
}
