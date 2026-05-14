package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    //aici o sa facem lista de observatori

    protected List<Calator> listaCalatori;
    String linie;

    public MijlocDeTransport(String linie) {
        this.linie = linie;
        this.listaCalatori = new ArrayList<>();
    }

    public void abonareCalator(Calator calator){
        listaCalatori.add(calator);
    }

    public void dezabonare(Calator calator){
        listaCalatori.remove(calator);
    }

    public void notificareCalator(String mesaj){
        for(Calator calator : this.listaCalatori){ //cu this ca e Atribut
            calator.notificare(mesaj);
        }
    }

    public abstract void PleacaDinDepou();

    public abstract void ramaneBlocatInTrafic();

}
