package RESTAURANT_probleme.B9_Proxy;

public class ProxyRezervareRestaurant implements AbstractRezervare{

    private AbstractRezervare rezervareRestaurant;

    public ProxyRezervareRestaurant(AbstractRezervare rezervareRestaurant) {
        this.rezervareRestaurant = rezervareRestaurant;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        if (numarPersoane >= 4) {
            rezervareRestaurant.realizeazaRezervare(numeClient, numarPersoane);
        } else {
            System.out.println("Rezervarea pentru clientul "
                    + numeClient
                    + " nu a fost realizata. Pentru "
                    + numarPersoane
                    + " persoane sunt suficiente locuri fara rezervare.");
        }
    }
}
