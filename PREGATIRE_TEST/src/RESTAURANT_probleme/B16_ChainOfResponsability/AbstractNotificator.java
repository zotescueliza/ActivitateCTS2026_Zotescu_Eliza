package RESTAURANT_probleme.B16_ChainOfResponsability;

public abstract class AbstractNotificator {

    protected AbstractNotificator urmatorulNotificator;

    public void setUrmatorulNotificator(AbstractNotificator urmatorulNotificator) {
        this.urmatorulNotificator = urmatorulNotificator;
    }

    public abstract void trimiteNotificare(ClientRestaurant client, String mesaj);
}
