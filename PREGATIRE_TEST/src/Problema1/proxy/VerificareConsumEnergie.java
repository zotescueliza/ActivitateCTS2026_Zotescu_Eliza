package Problema1.proxy;

public class VerificareConsumEnergie implements Verificare{
    @Override
    public boolean estePermisaProcesarea(Hala hala) {
        if(hala.getConsumInstantaneuEnergie() < hala.getConsumMaximEnergie()){
            System.out.println("Consumul instantaneu de energie este in limita permisa.");
            return true;
        } else {
            System.out.println("Consumul instantaneu de energie depaseste limita permisa.");
            return false;
        }
    }
}
