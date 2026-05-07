package ro.ase.cts.proxy.clase;

public class Autobuz implements MijlocDeTransport {

    private int nrPasageri;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.CURSA_NORMALA;
    }

    public Autobuz(int nrPasageri, int nrLinie, TipCursa tipCursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    @Override
    public TipCursa getTipCursa() {
        return tipCursa;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("AUTOBUZUL de pe linia: " + nrLinie + " a oprit in statia " + statie.getNumeStatie());
    }
}
