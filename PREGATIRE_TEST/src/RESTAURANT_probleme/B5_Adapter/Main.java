package RESTAURANT_probleme.B5_Adapter;

public class Main {
    public static void main(String[] args) {
        SoftPrintare softPrintareFacturi = new SoftPrintare();

        AbstractProduseBucatarie produsBucatarie = new ProdusBucatarie("Paste carbonara", 45);

        System.out.println("=== Printare produs din vechiul soft de bucatarie ===");

        softPrintareFacturi.printeazaFacutura(produsBucatarie);

        System.out.println("===============================");

        ProdusBar produsBar = new ProdusBar("Limonada", 18);

        AbstractProduseBucatarie produsBarAdaptat = new AdapterProdusBar(produsBar);

        System.out.println("=== Printare produs din noul soft de bar prin adapter ===");

        softPrintareFacturi.printeazaFacutura(produsBarAdaptat);
    }
}
