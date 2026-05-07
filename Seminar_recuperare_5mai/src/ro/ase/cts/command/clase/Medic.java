package ro.ase.cts.command.clase;

public class Medic implements PersonalSpital{

    private String numeM;

    public Medic(String numeM) {
        this.numeM = numeM;
    }

    public String getNumeM() {
        return numeM;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul " + numeM + " INTERNEAZA PACIENTUL " + pacient );
    }
}
