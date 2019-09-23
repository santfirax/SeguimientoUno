package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jose Santiago Molano Perdomo, jose.molano@upb.edu.co
 */
public enum MenuTypes {
    A {
        @Override
        public void escogerOpcion() {
            agenda.agregarContacto(agenda.crearContacto());
        }
    }, B {
        @Override
        public void escogerOpcion() {
            LOG.info("Ingrese nombre del contacto:");
            agenda.buscarContacto(Menu.getInstance().leerEntradaDeConsola());

        }
    }, C {
        @Override
        public void escogerOpcion() {
            agenda.listarAgenda();

        }
    }, D {
        @Override
        public void escogerOpcion() {
            agenda.vefificaSiLaAgendaYaEstaLlena();

        }
    }, E {
        @Override
        public void escogerOpcion() {
            agenda.getSizeOfAgenda();
        }
    };
    private static Agenda agenda = new Agenda();
    private static final Logger LOG = LoggerFactory.getLogger(MenuTypes.class);

    abstract public void escogerOpcion();

}
