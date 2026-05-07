package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.*;
import ro.ase.cts.proxy.proxy.AutobuzCursaSpeciala;
import ro.ase.cts.proxy.proxy.AutobuzNoapte;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz168 = new Autobuz(23,168);
        MijlocDeTransport autobuz226 = new Autobuz(0,226);

        Statie statieRomana = new Statie("Piata Roaman",10);
        Statie statieUniversitate = new Statie("Universitate",0);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUniversitate);

        System.out.println("======================================================");

        MijlocDeTransport autobuzNoapteN168 = new AutobuzNoapte(autobuz168) ;
        MijlocDeTransport autobuzNoapteN226 = new AutobuzNoapte(autobuz226) ;

        autobuzNoapteN168.opresteInStatie(statieRomana);
        autobuzNoapteN226.opresteInStatie(statieUniversitate);

        System.out.println("======================================================");

        MijlocDeTransport autobuz = new Autobuz(12,6, TipCursa.CURSA_SPECILA);

        MijlocDeTransport autobuzSpecial168 = new AutobuzCursaSpeciala(autobuz168);
        MijlocDeTransport autobuzSpecial = new AutobuzCursaSpeciala(autobuz);

        autobuzSpecial.opresteInStatie(statieRomana);
        autobuzSpecial168.opresteInStatie(statieUniversitate);

    }
}
