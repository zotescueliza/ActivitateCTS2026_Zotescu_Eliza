package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSptal1 = new Departament("Spital1");
        Structura depAdministrativ = new Departament("Administrativ");

        Structura sectieSecretariat = new Sectie("SECRETARIAT", 10);
        Structura sectieManagement = new Sectie("MANAGEMENT",13);

        ((Departament)depSptal1).adaugaStructura(depAdministrativ);
        ((Departament)depSptal1).adaugaStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieSecretariat);

        ((Departament) depSptal1).afiseazaDetaliiStructura();

    }
}
