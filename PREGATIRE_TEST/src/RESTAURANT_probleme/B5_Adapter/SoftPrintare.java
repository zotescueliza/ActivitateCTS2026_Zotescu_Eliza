package RESTAURANT_probleme.B5_Adapter;

public class SoftPrintare {
     public void printeazaFacutura(AbstractProduseBucatarie produs){
        System.out.println("Softul de printare facturi preia produsul.");
        produs.printeazaPeFactura();
    }
}
