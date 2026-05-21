package Problema1.proxy;

public class Utilaj implements IUtilaj{

    private String denumire;

    public Utilaj(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void proceseazaPlaca(PlacaLemn placaLemn, Hala hala) {
        System.out.println("Utilajul " + denumire + " proceseaza placa din " + placaLemn.getTipLemn() + ".");
    }
}
