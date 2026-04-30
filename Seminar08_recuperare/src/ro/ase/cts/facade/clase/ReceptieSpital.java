package ro.ase.cts.facade.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void intreneazaPacient(Pacient pacient){
        if(medic.areTrimitere(pacient)){
            int patLiber = salon.getPatLiber();
            if(patLiber != -1){
                System.out.println("Pacientul " + pacient.getNume() + " va fi internat in patul " + patLiber);
                salon.ocupaPat(patLiber);
            } else {
                System.out.println("Nu avem paturi libere! Du te la alt spital");
            }
        } else {
            System.out.println("Nu are trimitere");
        }
    }
}
