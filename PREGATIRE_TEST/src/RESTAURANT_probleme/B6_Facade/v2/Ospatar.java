package RESTAURANT_probleme.B6_Facade.v2;

public class Ospatar {
    public boolean esteMasaDebarasata(Masa masa) {
        return masa.isDebarasata();
    }

    public boolean areServeteleNoi(Masa masa) {
        return masa.isAreServeteleNoi();
    }
}
