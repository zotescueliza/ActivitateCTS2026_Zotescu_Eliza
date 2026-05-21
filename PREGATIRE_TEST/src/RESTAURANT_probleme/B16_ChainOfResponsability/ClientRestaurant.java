package RESTAURANT_probleme.B16_ChainOfResponsability;

public class ClientRestaurant {
    private String nume;
    private String numarTelefon;
    private String email;

    public ClientRestaurant(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getEmail() {
        return email;
    }
}
