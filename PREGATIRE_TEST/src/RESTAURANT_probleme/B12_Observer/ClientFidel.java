package RESTAURANT_probleme.B12_Observer;

public class ClientFidel implements AbstractClientFidel{

    String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul fidel " + nume
                + " a primit notificarea: " + mesaj);
    }
}
