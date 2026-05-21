package RESTAURANT_probleme.B10_Flyweight;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();

        AbstractClientRestaurnat clientPopescu = fabricaClienti.getClient("Popescu Ion", "0712345678", "popescu@email.com");

        clientPopescu.afiseazaRezervare(new Rezervare(1, 4, "18:00"));

        System.out.println("===============================");

        AbstractClientRestaurnat clientPopescuAltaRezervare = fabricaClienti.getClient("Popescu Ion", "0712345678", "popescu@email.com");

        clientPopescuAltaRezervare.afiseazaRezervare(new Rezervare(3, 2, "20:00"));

        System.out.println("===============================");

        AbstractClientRestaurnat clientIonescu = fabricaClienti.getClient("Ionescu Maria", "0798765432", "ionescu@email.com");

        clientIonescu.afiseazaRezervare(new Rezervare(5, 6, "21:00"));

        System.out.println("===============================");

        AbstractClientRestaurnat clientPopescuAtreiaRezervare = fabricaClienti.getClient("Popescu Ion", "0712345678", "popescu@email.com");

        clientPopescuAtreiaRezervare.afiseazaRezervare(new Rezervare(7, 3, "22:00"));

        System.out.println("===============================");

        System.out.println("Numar obiecte client create: " + fabricaClienti.getNrClienti());

        System.out.println("Fara Flyweight ar fi fost create 4 obiecte client.");
        System.out.println("Cu Flyweight s-au creat doar "
                + fabricaClienti.getNrClienti()
                + " obiecte client, deoarece clientii existenti sunt reutilizati.");
    }
}
