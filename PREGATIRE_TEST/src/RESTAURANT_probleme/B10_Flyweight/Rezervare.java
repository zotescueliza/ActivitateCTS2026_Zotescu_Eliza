package RESTAURANT_probleme.B10_Flyweight;

public class Rezervare {

    // AICI SUNT INFORMATII CARE DIFERA

    private int numarMasa;
    private int numarPersoane;
    private String oraRezervare;

    public Rezervare(int numarMasa, int numarPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }
}
