package Problema1.observer;

import java.util.ArrayList;
import java.util.List;

public class Utilaj implements IUtilaj{

    private String denumireUtilaj;
    private List<Departament>listaDepartamente;

    public Utilaj(String denumireUtilaj) {
        this.denumireUtilaj = denumireUtilaj;
        this.listaDepartamente = new ArrayList<>();
    }

    @Override
    public void transmiteInformatii(PlacaLemn placaLemn) {
        for(Departament departament : listaDepartamente){
            departament.receptioneazaInformatii(placaLemn);
        }
    }

    public void proceseazaPlaca(PlacaLemn placaLemn){
        System.out.println("Utilajul " + denumireUtilaj + " a finalizat procesarea placii din " + placaLemn.getTipLemn() + ".");
        transmiteInformatii(placaLemn);
    }

    @Override
    public void aboneazaDepartament(Departament departament) {
        listaDepartamente.add(departament);
    }

    @Override
    public void dezaboneazDepartament(Departament departament) {
        listaDepartamente.remove(departament);
    }
}
