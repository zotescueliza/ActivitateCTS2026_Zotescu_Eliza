package Problema1.observer;

public class DepartamentDepozitare implements Departament{

    private String denumire;

    public DepartamentDepozitare(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void receptioneazaInformatii(PlacaLemn placaLemn) {
        float volumPlaca = placaLemn.getSuprafataPrelucrata() * placaLemn.getGrosime() / 100;
        System.out.println(denumire + " a primit informatii despre placa din "
                + placaLemn.getTipLemn()
                + ". Volumul calculat este: " + volumPlaca + " m3.");

    }
}
