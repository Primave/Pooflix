package app;

public class Webisodio extends Episodio {

    public Webisodio(int numero, String nombre, int duracionEnMinutos, String url) {

        super(numero, nombre, duracionEnMinutos);

        this.url = url;

    }

    private String url;

    public String getUrl() {
        return this.url;
    }
    public void getUrl(String url){
        this.url = url;
    }

    @Override /// Anotacion que indica que el metodo se sobre - escribe(redefinicion)
    public void reproducir() {
        System.out.println(
                "Se esta reproduciendo websodio numero: " + this.getNumero() + " " + this.getNombre() + " url: " + this.getUrl());
    }

    /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }
}