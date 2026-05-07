package ro.ase.cts.command.clase;

public class Asistent implements PersonalSpital{

    private String numeA;

    public Asistent(String numeA) {
        this.numeA = numeA;
    }

    public String getNumeA() {
        return numeA;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta " + numeA + " Trtateaza imediat " + pacient);
    }
}
