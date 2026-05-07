package ro.ase.cts.observer.clase;

public class PacientAbonat implements Pacient{
    private String nume;
    private int vasrta;

    public PacientAbonat(String nume, int vasrta) {
        this.nume = nume;
        this.vasrta = vasrta;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Pacientul " + this.nume + " a primit urm mesaj " + mesaj);
    }
}
