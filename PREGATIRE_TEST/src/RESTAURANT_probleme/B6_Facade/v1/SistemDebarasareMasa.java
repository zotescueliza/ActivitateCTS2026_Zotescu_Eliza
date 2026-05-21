package RESTAURANT_probleme.B6_Facade.v1;

public class SistemDebarasareMasa {
    public boolean verificareMasaDebarasata(Masa masa){
        if(masa.isDebarasata()){
            System.out.println("Masa " + masa.getNumarMasa() + " a fost debarasata.");
            return true;
        } else {
            System.out.println("Masa " + masa.getNumarMasa() + " nu a fost debarasata.");
            return false;
        }
    }
}
