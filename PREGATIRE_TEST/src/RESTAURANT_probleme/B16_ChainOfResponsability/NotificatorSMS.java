package RESTAURANT_probleme.B16_ChainOfResponsability;

public class NotificatorSMS extends AbstractNotificator{
    @Override
    public void trimiteNotificare(ClientRestaurant client, String mesaj) {
        if (client.getNumarTelefon() != null && client.getNumarTelefon().length() > 0) {
            System.out.println("Clientul " + client.getNume()
                    + " a fost notificat prin SMS la numarul "
                    + client.getNumarTelefon()
                    + ". Mesaj: " + mesaj);
        } else {
            if (urmatorulNotificator != null) {
                urmatorulNotificator.trimiteNotificare(client, mesaj);
            }
        }
    }
}
