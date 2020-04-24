package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public List<Temporada> temporadas = new ArrayList<>();

    public Temporada getTemporada(int nro) {
        // recorrer cada temporada
        // si el nro de temporada del ciclo es igual a "nro"
        // devolver esa temporada

        for (Temporada tempo : this.temporadas) {
            if (tempo.numero == nro) {
                return tempo;
            }
        }
        return null;
    }


}