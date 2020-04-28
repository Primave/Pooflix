package app;

import java.util.List;

import app.personas.Actor;
import app.personas.Director;

public class Pelicula extends Contenido implements INnominable {

    private Director director;
    private int duracionEnMinutos;

    public Director getDirector() {
        return this.director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDuracionEnMinutos(){
        return this.duracionEnMinutos;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }


    //Interface
    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Reproducindo trailer de pelicula " + this.getNombre());

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