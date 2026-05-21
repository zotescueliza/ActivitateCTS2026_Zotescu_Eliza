package Problema1.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyUtilaj implements IUtilaj{

    private IUtilaj utilaj;
    private List<Verificare>listaVerificari;

    public ProxyUtilaj(IUtilaj utilaj) {
        this.utilaj = utilaj;
        this.listaVerificari = new ArrayList<>();
    }

    public void adugaVerificare(Verificare verificare){
       listaVerificari.add(verificare);
    }

    @Override
    public void proceseazaPlaca(PlacaLemn placaLemn,Hala hala) {
        boolean toateConditiileSuntRespectate = true;

        for(Verificare verificare : listaVerificari){
            if(!verificare.estePermisaProcesarea(hala)){
                toateConditiileSuntRespectate = false;
            }
        }
        if (toateConditiileSuntRespectate) {
            System.out.println("Acces permis. Procesarea poate incepe.");
            utilaj.proceseazaPlaca(placaLemn, hala);
        } else {
            System.out.println("Acces respins. Procesarea placii nu poate incepe.");
        }
    }
}
