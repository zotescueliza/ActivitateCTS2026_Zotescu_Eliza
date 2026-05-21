package RESTAURANT_probleme.B15_Command;

public class Masa {
    private int numarMasa;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public void rezervaMasa() {
        System.out.println("Masa " + numarMasa + " a fost rezervata.");
    }

    public void ocupaMasa() {
        System.out.println("Masa " + numarMasa + " a fost ocupata.");
    }
}
