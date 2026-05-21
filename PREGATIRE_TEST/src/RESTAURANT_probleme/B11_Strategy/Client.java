package RESTAURANT_probleme.B11_Strategy;

public class Client {

    private AbstractModDePlata modDePlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setModDePlata(AbstractModDePlata modDePlata){
        this.modDePlata = modDePlata;
    }

    public void platesteNota(double suma){
        if (modDePlata != null) {
            System.out.println("Clientul " + nume + " a ales modul de plata.");
            modDePlata.plateste(suma);
        } else {
            System.out.println("Clientul " + nume + " nu a ales un mod de plata.");
        }
    }
}
