package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public List<INnominable> nominados = new ArrayList<>();

    public Serie buscarSerie(String Titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(Titulo))
                return s;
        }
        return null;

    }

    public void inicializarCatalogo() {
        inicializarPelis();
        this.inicializarSerie1();
        this.inicializarSerie2();
    }

    public void inicializarSerie1() {

        // Serie Sherlock
        Serie serie1 = new Serie();
        serie1.nombre = "Sherlock";
        this.series.add(serie1);

        // clasificacion Sherlock
        Clasificacion optimo = new Clasificacion("Mayores de 16", 16);
        //optimo.tipo = "Mayores de 16";
        //optimo.edadMin = 16;
        optimo.descripcion = "Prohibido para menores de 16 años";
        serie1.clasificacion = optimo;
        // Genero
        Genero policia = new Genero("policial");
        //policia.nombre = "Policial";
        policia.descripcion = "Genero policial";
        serie1.genero = policia;
        // anio descrip calific elenco
        // Contenido sherlockSerie = new Contenido();
        serie1.ano = 2010;
        serie1.descripcion = "Ubicada en el Londres del siglo XXI, la serie sigue los pasos del excéntrico detective Sherlock Holmes junto a su compañero el doctor John H. Watson, en su búsqueda por resolver los brutales crímenes que se van desarrollando. Sus insuperables habilidades de deducción y su arrogante distanciamiento emocional le convierten en el perfecto detective, pero pronto descubrirá que hay alguien más que le sigue los pasos, el misterioso James Moriarty.";
        serie1.calificacion = 4.8;
        // Elenco
        Actor benedictCumberbatch = new Actor();
        benedictCumberbatch.edad = "47";
        benedictCumberbatch.nombre = "Benedict Cumberbatch";
        serie1.elenco.add(benedictCumberbatch);

        Actor martinFreeman = new Actor();
        martinFreeman.edad = "51";
        martinFreeman.nombre = "Martin Freeman";
        serie1.elenco.add(martinFreeman);

        // Serie 1 TEMPORADAS SHERLOCK
        Temporada serie1T1 = new Temporada(1);
        //serie1T1.numero = 1;
        Temporada serie1T2 = new Temporada(2);
        //serie1T2.numero = 2;

        serie1.temporadas.add(serie1T1);
        serie1.temporadas.add(serie1T2);

        // Serie 1 EPISODIOS SHERLOCK TEMP1
        Episodio epi = new Episodio(1, " A study in pink ", 88);
        // epi.nombre = " A study in pink";
        // epi.numero = 1;
        // epi.duracionEnMinutos = 88;
        epi.descripcion = "Una mujer vestida de rosa es la cuarta en una serie de suicidios sin relación aparente. Sherlock Holmes deduce que las muertes no fueron voluntarias, sino asesinatos.";
        serie1T1.episodios.add(epi);

        epi = new Episodio(2, " The blind banker ", 89);
        // epi.nombre = " The blind banker";
        // epi.numero = 2;
        // epi.duracionEnMinutos = 89;
        epi.descripcion = "La nueva vida de Watson junto a su compañero Sherlock Holmes nunca es aburrida, e incluso la extraña idea de Sherlock para ir al banco mantiene ocupado al doctor.";
        serie1T1.episodios.add(epi);

        epi = new Episodio(3, "the great games", 90);
        // serie1T1E3.nombre = " The great game";
        // serie1T1E3.numero = 3;
        // serie1T1E3.duracionEnMinutos = 90;
        epi.descripcion = "Cansado de la ingenuidad de los delincuentes londinenses, Sherlock acepta un caso, al parecer, sencillo y descubre que detrás se esconde una mente maestra.";
        serie1T1.episodios.add(epi);

        // Webisodio-
        Webisodio webi = new Webisodio(20, "Episodio web", 30, "http://direccion.com");
        // webi.numero = 20;
        // webi.nombre = "Episodio web";
        // webi.duracionEnMinutos = 30;
        // webi.url = "http://direccion.com";

        serie1T1.episodios.add(webi);
        // webi-

        // Serie 1 EPISODIOS SHERLOCK TEMP2
        epi = new Episodio(1, "A scandal in Belgravia", 90);
        // serie1T2E1.nombre = " A scandal in Belgravia";
        // serie1T2E1.numero = 1;
        // serie1T2E1.duracionEnMinutos = 90;
        epi.descripcion = "Un escándalo real que involucra a una dominatrix lleva a Sherlock a un difícil caso.";
        serie1T2.episodios.add(epi);

        epi = new Episodio(2, "The hounds of baskerville", 89);
        // serie1T2E2.nombre = " The hounds of Baskerville";
        // serie1T2E2.numero = 2;
        // serie1T2E2.duracionEnMinutos = 89;
        epi.descripcion = "Sherlock viaja a Dartmoor para desentramar un misterio de una criatura asesina.";
        serie1T2.episodios.add(epi);

        epi = new Episodio(3, "The reichenbach fall", 89);
        // serie1T2E3.nombre = " The Reichenbach fall";
        // serie1T2E3.numero = 3;
        // serie1T2E3.duracionEnMinutos = 89;
        epi.descripcion = "Sherlock se enfrenta a Moriarty, su gran adversario.";
        serie1T2.episodios.add(epi);

    }

    public void inicializarSerie2() {

        // Serie 2 MODERN LOVE
        Serie serie2 = new Serie();
        serie2.nombre = " Modern Love";
        this.series.add(serie2);

    }

    public void inicializarPelis() {
        Pelicula peli = new Pelicula();
        peli.nombre = "The Shining";
        Actor actor = new Actor();
        actor.nombre = "Jack";

        peli.elenco.add(actor);

        this.peliculas.add(peli);

        peli = new Pelicula();
        peli.nombre = "Deadpool";
        actor = new Actor();
        actor.nombre = "Ryan";

        peli.elenco.add(actor);

        this.peliculas.add(peli);

    }

    public void inicializarListaNominados() {

        for (Pelicula peli : this.peliculas) {
            this.nominados.add(peli);
            for (Actor actor : peli.elenco)
                this.nominados.add(actor);

        }
        for (Serie serie : this.series) {
            for (Actor actor : serie.elenco)
                this.nominados.add(actor);

        }
    }

    public void reproducirTrailersDeNominacion() {
        for (INnominable nominado : nominados) {

            nominado.reproducirTrailerNominacion();
        }
    }



}
