package RESTAURANT_probleme.B9_Proxy;

public class RezervareRestaurant implements AbstractRezervare{

    //Aceasta este clasa reală.
    // Ea știe să facă rezervarea, dar nu verifică regula cu minimum 4 persoane.


    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        System.out.println("Rezervarea pentru clientul "
                + numeClient
                + " a fost realizata pentru "
                + numarPersoane
                + " persoane.");
    }
}
