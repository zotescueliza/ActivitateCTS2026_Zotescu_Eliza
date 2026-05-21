package RESTAURANT_probleme.B5_Adapter;

public class AdapterProdusBar implements AbstractProduseBucatarie{
    //1. implementează AbstractProdusBucatarie
    //2. conține o referință către ProdusBar

    private ProdusBar produsBar;

    public AdapterProdusBar(ProdusBar produsBar) {
        this.produsBar = produsBar;
    }

    @Override
    public String obtineDenumireProdus() {
        return produsBar.getNumeBautura();
    }

    @Override
    public double obtinePretProdus() {
        return produsBar.getPretBautura();
    }

    @Override
    public void printeazaPeFactura() {
        produsBar.vindeBautura();
        System.out.println("Bautura "
                + obtineDenumireProdus()
                + " a fost printata pe factura. Pret: "
                + obtinePretProdus() + " lei.");
    }
}
