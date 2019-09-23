package com.company;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * @author José Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public class AgendaTest {
    private final Agenda agenda = new Agenda();
    private Contacto contacto = Contacto.crearNuevoContactoConNombre("Santiago").conTelefono("3022653192").yCorreo("santi-1524@hotmail.com");
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void deberiaAgregarContacto() {
        agenda.agregarContacto(contacto);
        Assert.assertEquals("El tamaño de la lista deberia ser uno", 1, agenda.getSizeOfAgenda());
    }

    @Test
    public void deberiaEncontrarContactoAgregoEnLaAgenda() {
        agenda.agregarContacto(contacto);
        Boolean encontroContacto = agenda.buscarContacto("Santiago");
        Assert.assertEquals("Deberia encontrar el Nombre en la Agenda", encontroContacto, true);
    }

    @Test
    public void noDeberiaEncontrarElContactoPorqueNoFueAgregadoEnAgenda() {

        agenda.agregarContacto(contacto);
        Boolean encontroContacto = agenda.buscarContacto("pepe");
        Assert.assertEquals("No deberia encontrar el contacto porque no tienen mismo nombre", encontroContacto, false);
    }

    @Test
    public void deberiaArrojarQueLaAgendaYaEstaLLena() {

        List<Contacto> contactoList = Arrays.asList(contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto, contacto);
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("No se pueden agregar mas contactos, Agenda llena");
        contactoList.forEach(agenda::agregarContacto);

    }

    @Test
    public void laAgendaDeberiaEstarLLena() {

        Assert.assertThat(Agenda.TAMANO_MAXIMO_AGENDA, is(equalTo(15)));
    }

    @Test
    public void deberiaSerLaAgendaVaciaSiNoHayContactos() {
        Assert.assertThat("La agenda deberia estar vacia porque no fueron agregados contactos", agenda.getSizeOfAgenda(), is(equalTo(0)));
    }

}