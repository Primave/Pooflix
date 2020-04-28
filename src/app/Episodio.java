package app;

public class Episodio {

    //Constructor
    public Episodio(int numero, String nombre, int duracionEnMinutos){
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private int numero;
    private String nombre;
    private int duracionEnMinutos;
    private String descripcion;

    //get
    public int getNumero() {
        return this.numero;
    }  
    //Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }
    public void setDuracionEMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void reproducir() {

       System.out.print("Reproducindo Episodio " + this.getNumero() + this.getNombre());

    }


    
}