package RESTAURANT_probleme.B16_ChainOfResponsability;

public class NotificatorEmail extends AbstractNotificator{
    @Override
    public void trimiteNotificare(ClientRestaurant client, String mesaj) {
        if (client.getEmail() != null && client.getEmail().length() > 0) {
            System.out.println("Clientul " + client.getNume()
                    + " a fost notificat prin email la adresa "
                    + client.getEmail()
                    + ". Mesaj: " + mesaj);
        } else {
            if (urmatorulNotificator != null) {
                urmatorulNotificator.trimiteNotificare(client, mesaj);
            }
        }
    }
}
