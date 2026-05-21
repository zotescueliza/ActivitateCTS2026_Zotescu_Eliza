package RESTAURANT_probleme.B16_ChainOfResponsability;

public class NotificatorManager extends AbstractNotificator{
    @Override
    public void trimiteNotificare(ClientRestaurant client, String mesaj) {
        System.out.println("Managerul restaurantului a fost notificat ca pentru clientul "
                + client.getNume()
                + " nu exista date de contact.");
    }
}
