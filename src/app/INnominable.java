package app;

import java.util.List;

//interface necesita ser publico por defecto
public interface INnominable {

    boolean ganoPreviamente();

    void reproducirTrailerNominacion();

    void sacarSelfie(List<Actor> elenco);

    boolean estaNominaada();

}