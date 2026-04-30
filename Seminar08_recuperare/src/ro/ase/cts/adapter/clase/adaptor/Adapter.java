package ro.ase.cts.adapter.clase.adaptor;

import ro.ase.cts.adapter.clase.farmacie.Medicament;

//mostenesti la ce adaptezi => noi adaptam spitalul la farmacie

public class Adapter extends Medicament {
    private ro.ase.cts.adapter.clase.spital.Medicament medicament;

    public Adapter(ro.ase.cts.adapter.clase.spital.Medicament medicament) {
        super(medicament.getNume());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        this.medicament.achizitioneazaMedicament();
    }
}
