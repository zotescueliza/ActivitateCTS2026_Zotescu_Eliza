package RESTAURANT_probleme.B5_Adapter;

public interface AbstractProduseBucatarie {
    //interfata pe care o cunoaste softul de printare
    //aceste functii exista in clasa compatibila cu softul, dar trebuie implemetate in ADAPTER
    String obtineDenumireProdus();
    double obtinePretProdus();
    void printeazaPeFactura();
}
