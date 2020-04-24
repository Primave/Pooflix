package app;

import java.util.ArrayList;
import java.util.List;

public abstract class Contenido {

    public String nombre;
    public Clasificacion clasificacion;
    public Genero genero;
    public int ano;
    public String descripcion;
    public double calificacion;
    public List<Actor> elenco = new ArrayList<>();
    
    public void reproducir() {
        
    }
}