package app;

public class Pelicula extends Contenido {

    public Pelicula(Director director, int duracionEnMinutos){
        this.director = director;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public Director director;
    public int duracionEnMinutos;
}