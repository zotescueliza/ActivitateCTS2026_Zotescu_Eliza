package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.clase.adaptor.Adapter;
import ro.ase.cts.adapter.clase.farmacie.Medicament;

public class Main{
    public static void procucareMedicament(Medicament medFarmacie){
        medFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {

        ro.ase.cts.adapter.clase.spital.Medicament medS = new ro.ase.cts.adapter.clase.spital.Medicament("Paracetamol",10);
        Medicament medF = new Medicament("Nurofen");

        medS.achizitioneazaMedicament();
        medF.cumparaMedicament();

        Main.procucareMedicament(medF);
        //Main.procucareMedicament(medS);

        //vrem sa adaptam medicam din spital
        Adapter adapter = new Adapter(medS);
        procucareMedicament(adapter);
    }
}
