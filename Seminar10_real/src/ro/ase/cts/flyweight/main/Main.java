package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Autobuz;
import ro.ase.cts.flyweight.clase.ManagerLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz101 = new Autobuz("Audi", 1999,45);
        Autobuz autobuz102 = new Autobuz("Mercedes", 1999,34);
        Autobuz autobuz103 = new Autobuz("Ford", 1998,22);

        ManagerLinie managerLinie = new ManagerLinie();
        managerLinie.getLinie(101, "Romana","Universitate").afiseazaNrMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(101, "hgbucgous","gshdfdghshgd").detaliiLinie(autobuz101);


    }
}