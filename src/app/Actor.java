package app;

import java.util.List;

public class Actor extends Persona implements INnominable {

    @Override
    public boolean ganoPreviamente() {
        //todo Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Reproducindo trailer de actor " + this.nombre);

    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {
        //todo Auto-generated method stub

    }

    @Override
    public boolean estaNominaada() {
        // TODO Auto-generated method stub
        return false;
    }


}