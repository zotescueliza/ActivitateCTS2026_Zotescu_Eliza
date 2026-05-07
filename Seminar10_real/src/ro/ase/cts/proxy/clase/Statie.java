package ro.ase.cts.proxy.clase;

public class Statie {
    private String numeStatie;
    private int nrCalatori;

    public Statie(String numeStatie, int nrCalatori) {
        this.numeStatie = numeStatie;
        this.nrCalatori = nrCalatori;
    }

    public String getNumeStatie() {
        return numeStatie;
    }

    public void setNumeStatie(String numeStatie) {
        this.numeStatie = numeStatie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }
}
