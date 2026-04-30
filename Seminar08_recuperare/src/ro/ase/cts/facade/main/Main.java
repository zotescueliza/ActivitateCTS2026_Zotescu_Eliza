package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Medic;
import ro.ase.cts.facade.clase.Pacient;
import ro.ase.cts.facade.clase.ReceptieSpital;
import ro.ase.cts.facade.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Gigel",5);
        Medic m1 = new Medic();
        Salon s1 = new Salon();

        if(m1.areTrimitere(p1)){
            int patLiber = s1.getPatLiber();
            if(patLiber != -1){
                System.out.println("Pacientul " + p1.getNume() + " va fi internat in patul " + patLiber);
                s1.ocupaPat(patLiber);
            }
        }

        //daca vrem sa internam iar un pacient trebuie sa reluam tot procesul => de aceea facem facade

        Pacient p2 = new Pacient("Mihai", 9);
        Pacient p3 = new Pacient("Lucian", 2);
        Pacient p4 = new Pacient("Diana", 9);

        ReceptieSpital receptie = new ReceptieSpital(m1,s1);
        receptie.intreneazaPacient(p2);
        receptie.intreneazaPacient(p3);
        receptie.intreneazaPacient(p4);
    }
}
