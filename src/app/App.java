package app;

import java.util.Scanner;

public class App {
    
    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Sherlock");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(1);

        elTop.reproducir();

        // websodio

        System.out.println(" Empezando otra cosa");

        Episodio epiDemo;

        int posicion = 0;

        // En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Entrada.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        // primero: preguntar si es un objeto de X tipo, usando el operador "instanceof"
        // segundo: usando el operador de casteo. (es decir, "transformando" la
        // referencia)
        // Casteo es como epidemo es mayor de edad y webisodio es menor de edad, para hacer el envio de mail es necesario ser mayor. Entonces para entrar en el boliche para mayores de 18 e envia el mail, epidemo va a prestar su distintivo a webisodio para que entre e envie el mail.
        if (epiDemo instanceof Webisodio) {
            Webisodio webi = (Webisodio) epiDemo;
            webi.enviarAlertaDeQueEstaOnline();

        } else {
            System.out.println("No hay que hacer mas nada con un Episodio");
        }

        miPooflix.inicializarListaNominados();

        miPooflix.reproducirTrailersDeNominacion();

    }
}