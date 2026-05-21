package RESTAURANT_probleme.B16_ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        ClientRestaurant clientCuTelefon = new ClientRestaurant("Popescu Ion", "0712345678", "popescu@email.com");

        ClientRestaurant clientCuEmail = new ClientRestaurant("Ionescu Maria", null, "ionescu@email.com");

        ClientRestaurant clientFaraContact = new ClientRestaurant("Georgescu Andrei", null, null);

        AbstractNotificator notificatorSMS = new NotificatorSMS();
        AbstractNotificator notificatorEmail = new NotificatorEmail();
        AbstractNotificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        String mesajOferta = "A aparut o oferta noua la restaurant.";

        notificatorSMS.trimiteNotificare(clientCuTelefon, mesajOferta);

        System.out.println("===============================");

        notificatorSMS.trimiteNotificare(clientCuEmail, mesajOferta);

        System.out.println("===============================");

        notificatorSMS.trimiteNotificare(clientFaraContact, mesajOferta);
    }
}
