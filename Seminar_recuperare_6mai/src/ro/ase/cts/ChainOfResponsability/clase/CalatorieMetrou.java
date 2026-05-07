package ro.ase.cts.ChainOfResponsability.clase;

public class CalatorieMetrou extends CalatorieHandler{
    public CalatorieMetrou() {
        super();
    }

    @Override
    public String recomandariCalatorie(double distanta) {
        return "Metrou";
    }
}
