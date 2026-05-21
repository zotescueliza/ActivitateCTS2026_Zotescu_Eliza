package RESTAURANT_probleme.B5_Adapter;

public class ProdusBucatarie implements AbstractProduseBucatarie{
    //produsul compatibil cu softul Vechi
    //este clasa care simulează vechiul sistem, cel care deja funcționa.

    private String denumireProdus;
    private double pretProdus;

    public ProdusBucatarie(String denumireProdus, double pretProdus) {
        this.denumireProdus = denumireProdus;
        this.pretProdus = pretProdus;
    }

    @Override
    public String obtineDenumireProdus() {
        return this.denumireProdus;
    }

    @Override
    public double obtinePretProdus() {
        return this.pretProdus;
    }

    @Override
    public void printeazaPeFactura() {
        System.out.println("Produsul de la bucatarie " + denumireProdus + " a fost printat pe factura. Pret: " + pretProdus + " lei.");
    }


}
