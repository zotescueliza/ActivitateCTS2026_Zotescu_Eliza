package ro.ase.cts.flyweight.clase;

public class Linie implements LinieAbstracta{

    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    @Override
    public void detaliiLinie(Autobuz autobuz) {
        System.out.println("Pe linia " + this.nrLinie + " circula autobuzul " + autobuz.toString() +
                " care opreste in capatul1: " + this.primaStatie + " si in capatul2: " + this.ultimaStatie);
    }

    @Override
    public void afiseazaNrMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Nr maxim de calatori pentru linia " + this.nrLinie +
                " care circula intre " + this.primaStatie + " si " + this.ultimaStatie +
                " are un nr maxim de calatori de " + autobuz.getNrLocuri());
    }

    //ca sa fie mai aproape de singleton regsitry
    protected Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }
}