package Problema1.observer;

public class DepartamentFinanciar implements Departament{

    private String denumire;

    public DepartamentFinanciar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void receptioneazaInformatii(PlacaLemn placaLemn) {
        float costTotal = placaLemn.getSuprafataPrelucrata() * placaLemn.getCostPeMetruPatrat();
        System.out.println(denumire + " a primit informatii despre placa din "
                + placaLemn.getTipLemn()
                + ". Costul total calculat este: " + costTotal + " lei.");
    }
}
