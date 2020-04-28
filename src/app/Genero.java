package app;

public class Genero {

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private String descripcion;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}