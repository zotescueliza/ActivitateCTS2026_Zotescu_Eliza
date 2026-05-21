package RESTAURANT_probleme.B5_Adapter;

public class ProdusBar {
    //clasa incompatibila
    //Nu implementează AbstractProdusBucatarie, deci softul de printare nu o poate folosi direct.
    //ea are metode noi legate de bautura

    private String numeBautura;
    private double pretBautura;

    public ProdusBar(String numeBautura, double pretBautura) {
        this.numeBautura = numeBautura;
        this.pretBautura = pretBautura;
    }

    public String getNumeBautura() {
        return numeBautura;
    }

    public double getPretBautura() {
        return pretBautura;
    }

    public void vindeBautura() {
        System.out.println("Bautura " + numeBautura + " a fost vanduta prin noul soft de bar.");
    }
}
