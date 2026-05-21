package RESTAURANT_probleme.B6_Facade.v2;

public class Masa {
    private int numarMasa;
    private boolean libera;
    private boolean debarasata;
    private boolean areServeteleNoi;

    public Masa(int numarMasa, boolean libera, boolean debarasata, boolean areServeteleNoi) {
        this.numarMasa = numarMasa;
        this.libera = libera;
        this.debarasata = debarasata;
        this.areServeteleNoi = areServeteleNoi;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public boolean isLibera() {
        return libera;
    }

    public boolean isDebarasata() {
        return debarasata;
    }

    public boolean isAreServeteleNoi() {
        return areServeteleNoi;
    }

    public void ocupaMasa() {
        this.libera = false;
    }
}
