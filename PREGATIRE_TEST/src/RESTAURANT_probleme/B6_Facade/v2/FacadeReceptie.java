package RESTAURANT_probleme.B6_Facade.v2;

public class FacadeReceptie {
    private Restaurant restaurant;
    private Ospatar ospatar;

    public FacadeReceptie(Restaurant restaurant, Ospatar ospatar) {
        this.restaurant = restaurant;
        this.ospatar = ospatar;
    }

    public void aseazaClientLaMasa() {
        Masa masaLibera = restaurant.getMasaLibera();

        if (masaLibera != null) {
            if (ospatar.esteMasaDebarasata(masaLibera)) {
                if (ospatar.areServeteleNoi(masaLibera)) {
                    System.out.println("Clientul poate fi asezat la masa " + masaLibera.getNumarMasa());
                    masaLibera.ocupaMasa();
                } else {
                    System.out.println("Masa " + masaLibera.getNumarMasa() + " nu are servetele noi.");
                }
            } else {
                System.out.println("Masa " + masaLibera.getNumarMasa() + " nu a fost debarasata.");
            }
        } else {
            System.out.println("Nu exista mese libere in restaurant.");
        }
    }
}
