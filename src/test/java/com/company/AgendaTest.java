package com.company;

import org.junit.Assert;
import org.junit.Test;

public class AgendaTest {
    private final Agenda agenda = new Agenda();

    @Test
    public void deberiaAgregarContacto() {
        Contacto contacto = new Contacto("Santiago", "3022653192", "santi-1524@hotmail.com");
        agenda.agregarContacto(contacto);
        Assert.assertEquals("El tamaño de la lista deberia ser uno", 1, agenda.getSizeOfAgenda());
    }

    @Test
    public void deberiaEncontrarContactoAgregoEnLaAgenda() {
        Contacto contacto = new Contacto("Santiago", "3022653192", "santi-1524@hotmail.com");
        agenda.agregarContacto(contacto);
        Boolean encontroContacto = agenda.buscarContacto("Santiago");
        Assert.assertEquals("Deberia encontrar el Nombre en la Agenda", encontroContacto, true);
    }

    @Test
    public void noDeberiaEncontrarElContactoPorqueNoFueAgregadoEnAgenda() {
        Contacto contacto = new Contacto("pepe", "3022653192", "santi-1524@hotmail.com");
        agenda.agregarContacto(contacto);
        Boolean encontroContacto = agenda.buscarContacto("Santiago");
        Assert.assertEquals("No deberia encontrar el contacto porque no tienen mismo nombre", encontroContacto, false);
    }

    @Test
    public void deberiaArrojarQueLaAgendaYaEstaLLena() {
        Contacto contacto = new Contacto("pepe", "3022653192", "santi-1524@hotmail.com");
        agenda.agregarContactos(contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto
                , contacto, contacto, contacto);

    }
}