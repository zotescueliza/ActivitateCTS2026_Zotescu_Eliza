package Problema1.observer;

public class Main {
    public static void main(String[] args) {

        PlacaLemn placaStejar = new PlacaLemn("stejar", 10.5f, 4.0f, 150.0f);
        PlacaLemn placaFag = new PlacaLemn("fag", 8.0f, 3.5f, 120.0f);
        PlacaLemn placaPin = new PlacaLemn("pin", 12.0f, 2.5f, 90.0f);

        Departament departamentDepozitare = new DepartamentDepozitare("Departamentul de depozitare");
        Departament departamentFinanciar = new DepartamentFinanciar("Departamentul financiar");
        Departament departamentTransport = new DepartamentTransport("Departamentul de transport");

        IUtilaj utilajDebitare = new Utilaj("Utilaj_debitare");
        IUtilaj utilajFinisare = new Utilaj("Utilaj_finisare");

        utilajDebitare.aboneazaDepartament(departamentDepozitare);
        utilajDebitare.aboneazaDepartament(departamentFinanciar);
        utilajDebitare.aboneazaDepartament(departamentTransport);

        utilajFinisare.aboneazaDepartament(departamentDepozitare);
        utilajFinisare.aboneazaDepartament(departamentFinanciar);
        utilajFinisare.aboneazaDepartament(departamentTransport);

        ((Utilaj) utilajDebitare).proceseazaPlaca(placaStejar);

        System.out.println("====================================================");

        ((Utilaj) utilajFinisare).proceseazaPlaca(placaFag);



    }
}
