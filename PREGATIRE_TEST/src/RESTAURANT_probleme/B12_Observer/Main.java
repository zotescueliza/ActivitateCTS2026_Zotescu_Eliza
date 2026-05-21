package RESTAURANT_probleme.B12_Observer;

public class Main {
    public static void main(String[] args) {
        AbstractClientFidel client1 = new ClientFidel("Popescu Ion");
        AbstractClientFidel client2 = new ClientFidel("Ionescu Maria");
        AbstractClientFidel client3 = new ClientFidel("Georgescu Andrei");

        AbstractRestaurant restaurant = new Restaurant("Restaurant Central");

        restaurant.aboneaza(client1);
        restaurant.aboneaza(client2);
        restaurant.aboneaza(client3);

        ((Restaurant) restaurant).adaugareOfertaPret("20% reducere la meniul zilei");

        System.out.println("===============================");

        restaurant.dezaboneaza(client2);

        ((Restaurant) restaurant).introduceMeniuNou("Meniu de sarbatori");
    }

}

