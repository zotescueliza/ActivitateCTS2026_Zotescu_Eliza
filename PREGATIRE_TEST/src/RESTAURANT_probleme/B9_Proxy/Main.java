package RESTAURANT_probleme.B9_Proxy;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervareRestaurant = new RezervareRestaurant();

        AbstractRezervare proxyRezervare = new ProxyRezervareRestaurant(rezervareRestaurant);

        proxyRezervare.realizeazaRezervare("Popescu Ion", 2);

        System.out.println("===============================");

        proxyRezervare.realizeazaRezervare("Ionescu Maria", 4);

        System.out.println("===============================");

        proxyRezervare.realizeazaRezervare("Georgescu Andrei", 6);
    }
}
