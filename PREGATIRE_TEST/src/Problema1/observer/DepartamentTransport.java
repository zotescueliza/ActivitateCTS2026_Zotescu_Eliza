package Problema1.observer;

public class DepartamentTransport implements Departament{

    private String denumire;

    public DepartamentTransport(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void receptioneazaInformatii(PlacaLemn placaLemn) {
        float greutateEstimata = placaLemn.getSuprafataPrelucrata() * placaLemn.getGrosime() * 0.7f;
        System.out.println(denumire + " a primit informatii despre placa din "
                + placaLemn.getTipLemn()
                + ". Greutatea estimata pentru transport este: "
                + greutateEstimata + " kg.");
    }
}
