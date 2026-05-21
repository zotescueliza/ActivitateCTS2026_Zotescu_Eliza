package RESTAURANT_probleme.B12_Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements AbstractRestaurant{

    private String denumire;
    private List<AbstractClientFidel> listaClienti;

    public Restaurant(String denumire) {
        this.denumire = denumire;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void aboneaza(AbstractClientFidel clientFidel) {
        listaClienti.add(clientFidel);
    }

    @Override
    public void dezaboneaza(AbstractClientFidel clientFidel) {
        listaClienti.remove(clientFidel);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(AbstractClientFidel clientFidel : listaClienti){
            clientFidel.primesteNotificare(mesaj + " - " + denumire);
        }
    }

    public void adaugareOfertaPret(String oferta){
        trimiteNotificare("Oferta noua de pret " + oferta);
    }

    public void introduceMeniuNou(String menu){
        trimiteNotificare("Meniu nou introdus: " + menu);
    }

}
