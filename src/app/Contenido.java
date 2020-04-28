package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;

//ABSRACT

public abstract class Contenido {

    private String nombre;
    private Clasificacion clasificacion;
    private Genero genero;
    private int ano;
    private String descripcion;
    private double calificacion;
    private List<Actor> elenco = new ArrayList<>();
    

    public void reproducir() {
    }  
        
     // get
     public String getNombre() {
        return this.nombre;
    }
    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public Clasificacion getClasificacion() {
        return this.clasificacion;
    }
    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Genero getGenero(){
        return this.genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCalificacion() {
        return this.calificacion;
    }
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public List<Actor> getElenco(){
        return this.elenco;
    }
    public void setElenco(List<Actor> elenco) {
        this.elenco = elenco;
    }


}