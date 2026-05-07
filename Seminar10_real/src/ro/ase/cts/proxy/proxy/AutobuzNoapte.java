package ro.ase.cts.proxy.proxy;

import ro.ase.cts.proxy.clase.MijlocDeTransport;
import ro.ase.cts.proxy.clase.Statie;
import ro.ase.cts.proxy.clase.TipCursa;

public class AutobuzNoapte implements MijlocDeTransport {

    private MijlocDeTransport mijlocDeTransport;

    public AutobuzNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if (statie.getNrCalatori() > 0 || this.mijlocDeTransport.getNrPasageri() > 0) {
            this.mijlocDeTransport.opresteInStatie(statie);
        } else {
            System.out.println("Autobuzul nu opreste in statia " + statie.getNumeStatie());
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        this.mijlocDeTransport.getTipCursa();
        return null;
    }
}
