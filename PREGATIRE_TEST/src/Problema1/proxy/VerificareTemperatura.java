package Problema1.proxy;

public class VerificareTemperatura implements Verificare{

    private float temperaturaMinima;
    private float temperaturaMaxima;

    public VerificareTemperatura(float temperaturaMinima, float temperaturaMaxima) {
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    @Override
    public boolean estePermisaProcesarea(Hala hala) {
        if (hala.getTemperaturaInterna() >= this.temperaturaMinima && hala.getTemperaturaInterna() <= this.temperaturaMaxima) {
            System.out.println("Temperatura din hala este in intervalul permis.");
            return true;

        } else {
            System.out.println("Temperatura din hala nu este in intervalul permis.");
            return false;
        }
    }
}
