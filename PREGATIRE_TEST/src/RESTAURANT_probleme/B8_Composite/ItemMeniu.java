package RESTAURANT_probleme.B8_Composite;

public class ItemMeniu implements AbstrcatMeniu{

    private String denumire;
    private double pret;

    public ItemMeniu(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void afiseazaMeniu() {
        System.out.println("Item meniu: " + denumire + " - " + pret + " lei");
    }
}
