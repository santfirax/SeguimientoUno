package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Horoscopo {
    private final List<String> frasesHoroscopo = new ArrayList<>();
    private final Random random = new Random();

    public Horoscopo() {
        //como por hacer algo en el constructor
        frasesHoroscopo.add("Cuál es la prisa que llevas? ¿Acaso están regalando algo? Siéntate, relájate un momento, ¿por qué todo tiene que ser una competencia? No te vendrían mal unas clases de yoga. (Aries)");
        frasesHoroscopo.add("Dijiste que era la última galleta que te ibas a comer. Sé que disfrutar de la vida es importante ¡pero no exageres! (Tauro).");
        frasesHoroscopo.add("Pero no tienes que soltarte a llorar de esa forma, está todo bien. Es solo una película. Déjame alcanzarte la caja de pañuelos… y si te doy un abrazo, ¡total! (Cáncer).");
        frasesHoroscopo.add("¿Crees que podrías callarte tan solo por cinco minutos? Gracias, necesitaba escuchar mi propia voz por un momento. (Géminis).");
        frasesHoroscopo.add("No entiendo que le encuentras de interesante, ¡es solo un espejo! No te haría mal despegarte de él un rato. (Leo).");
        frasesHoroscopo.add("¿Qué es lo que no te parece esta vez? ¿El color, el tamaño? ¿Por qué no te dejas de fastidiar un rato? (Virgo).");
        frasesHoroscopo.add("¿Sabes que das auténtico miedo con esa mirada? En serio. (Escorpio).");
        frasesHoroscopo.add("¿Podemos decidir de una buena vez? ¡Por Dios, no lo pienses tanto! (Libra).");
        frasesHoroscopo.add("A veces no sé si eres o te haces el tonto, ¿es que no piensas las cosas antes de hacerlas? (Sagitario).");
        frasesHoroscopo.add("¿Crees que podamos ir por un café o tengo que consultarlo con tu secretaria? (Capricornio).");
    }

    public void mostrarHoroscopo() {
        System.out.println(frasesHoroscopo.get(random.nextInt(9)));

    }
}
