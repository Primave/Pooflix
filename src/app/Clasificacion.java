package app;

public class Clasificacion {

    public Clasificacion(String tipo, int edadMin) {
        this.tipo = tipo;
        this.edadMin = edadMin;
    }

    private String tipo;
    private int edadMin;
    private String descripcion;

    // get
    public String getTipo() {
        return this.tipo;
    }

    // Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdadMin() {
        return this.edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}