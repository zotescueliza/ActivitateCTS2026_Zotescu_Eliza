package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<Pacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti = new ArrayList<>();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPacienti(List<Pacient> pacienti) {
        this.pacienti = pacienti;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient p : pacienti){
            p.receptioneazaNotificare(mesaj + " de la spitalul " + this.nume);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        pacienti.remove(pacient);
    }

    public void notificaVirus(){
        trimiteMesaj("Exista un virus nou in oras!");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Exista o epidemie noua in oras!");
    }
}
