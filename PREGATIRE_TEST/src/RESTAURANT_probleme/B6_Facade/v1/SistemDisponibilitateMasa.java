package RESTAURANT_probleme.B6_Facade.v1;

public class SistemDisponibilitateMasa {
    public boolean verificaMasaLibera(Masa masa){
        if(masa.isLibera()){
            System.out.println("Masa " + masa.getNumarMasa() +" este libera");
            return true;
        }
        else {
            System.out.println("Masa " + masa.getNumarMasa() + "nu este libera");
            return false;
        }
    }
}
