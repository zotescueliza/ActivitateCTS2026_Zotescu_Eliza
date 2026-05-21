package RESTAURANT_probleme.B6_Facade.v2;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Ospatar ospatar = new Ospatar();

        Masa masaLibera = restaurant.getMasaLibera();

        if (masaLibera != null) {
            if (ospatar.esteMasaDebarasata(masaLibera)) {
                if (ospatar.areServeteleNoi(masaLibera)) {
                    System.out.println("Clientul poate fi asezat la masa " + masaLibera.getNumarMasa());
                    masaLibera.ocupaMasa();
                }
            }
        }

        System.out.println("===============================");

        FacadeReceptie receptieRestaurant = new FacadeReceptie(restaurant, ospatar);

        receptieRestaurant.aseazaClientLaMasa();
        receptieRestaurant.aseazaClientLaMasa();
        receptieRestaurant.aseazaClientLaMasa();
    }
}
