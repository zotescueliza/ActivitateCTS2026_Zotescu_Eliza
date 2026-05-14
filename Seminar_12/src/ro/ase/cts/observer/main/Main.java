package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Autobuz;
import ro.ase.cts.observer.clase.Calator;
import ro.ase.cts.observer.clase.CalatorAbonat;
import ro.ase.cts.observer.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Calator calator1 = new CalatorAbonat("Andrei");
        Calator calator2 = new CalatorAbonat("Ana");
        Calator calator3 = new CalatorAbonat("Crina");
        Calator calator4 = new CalatorAbonat("Matei");

        MijlocDeTransport autobuz = new Autobuz("10");

        autobuz.abonareCalator(calator1);
        autobuz.abonareCalator(calator2);
        autobuz.abonareCalator(calator3);

        autobuz.PleacaDinDepou();

        autobuz.abonareCalator(calator4);
        autobuz.dezabonare(calator1);

        autobuz.ramaneBlocatInTrafic();
    }
}
