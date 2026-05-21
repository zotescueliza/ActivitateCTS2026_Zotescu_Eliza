package RESTAURANT_probleme.B7_Decorator;

public class NotaDePlata implements NotaDePlataAbstracta{

    private int numarMasa;
    private double sumaTotala;

    public NotaDePlata(int numarMasa, double sumaTotala) {
        this.numarMasa = numarMasa;
        this.sumaTotala = sumaTotala;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public double getSumaTotala() {
        return sumaTotala;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Se printeaza nota de plata pentru masa " + numarMasa + ". Suma totala: " + sumaTotala + " lei.");
    }
}
