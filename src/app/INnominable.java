package app;

import java.util.List;

import app.personas.Actor;

//interface necesita ser publico por defecto
public interface INnominable {

    boolean ganoPreviamente();

    void reproducirTrailerNominacion();

    void sacarSelfie(List<Actor> elenco);

    boolean estaNominaada();

}