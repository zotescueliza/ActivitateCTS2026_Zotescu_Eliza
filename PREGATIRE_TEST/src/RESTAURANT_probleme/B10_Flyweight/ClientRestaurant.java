package RESTAURANT_probleme.B10_Flyweight;

public class ClientRestaurant implements AbstractClientRestaurnat{

    // FLYWEIGHT CONCRET - DATELE COMUNE ALE CLIENTULUI

    private String nume;
    private String numarTelefon;
    private String email;

    public ClientRestaurant(String nume, String numarTelefon, String email) {
        System.out.println("Se creeaza un nou obiect client pentru: " + nume);

        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul " + nume
                + ", telefon: " + numarTelefon
                + ", email: " + email
                + ", are rezervare la masa "
                + rezervare.getNumarMasa()
                + " pentru " + rezervare.getNumarPersoane()
                + " persoane, la ora "
                + rezervare.getOraRezervare() + ".");
    }
}
