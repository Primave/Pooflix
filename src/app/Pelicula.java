package app;

import java.util.List;

public class Pelicula extends Contenido implements INnominable {

    public Director director;
    public int duracionEnMinutos;

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Reproducindo trailer de pelicula " + this.nombre);

    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean estaNominaada() {
        // TODO Auto-generated method stub
        return false;
    }

    
}