package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public Temporada(int numero) {
        this.numero = numero;
    }

    public int numero;
    public List<Episodio> episodios = new ArrayList<>();


    /**
     * Obtiene un episodio en base a su numero de episodio
     * 
     * @param nro
     * @return
     */


    public Episodio getEpisodio(int nro) {
        // recorrer cada episodio
        // si el nro del episo del ciclo es igual a "nro"
        // devolver ese episo
        for (Episodio ep : this.episodios) {
            if (ep.getNumero() == nro) {
                return ep;
            }

        }
        return null;

    }

    /**
     * Obtiene un episodio en base a la posicion dentro del ArrayList. Recordar que
     * los arraylist la primer posicion es la 0
     * 
     * @param pos
     * @return
     */
    public Episodio getEpisodioAtPosicion(int pos) {
        return this.episodios.get(pos);
    }

    public List<Webisodio> obtenerWebisodios() {
        List<Webisodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Webisodio)
                lista.add((Webisodio)epi);
        }
        return lista;
    }

}