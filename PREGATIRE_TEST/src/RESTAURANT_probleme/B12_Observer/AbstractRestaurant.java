package RESTAURANT_probleme.B12_Observer;

public interface AbstractRestaurant {
    void aboneaza(AbstractClientFidel clientFidel);
    void dezaboneaza(AbstractClientFidel clientFidel);
    void trimiteNotificare(String mesaj);
}
