package ro.ase.cts.command.clase;

public class Pacient {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacientul ");
        sb.append("cu numele ").append(nume).append('\'');
        return sb.toString();
    }
}
