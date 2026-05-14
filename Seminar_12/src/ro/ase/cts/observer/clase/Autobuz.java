package ro.ase.cts.observer.clase;

public class Autobuz extends MijlocDeTransport{

    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void PleacaDinDepou() {
        String mesaj = "Autobuzul de pe linia " + super.linie+ " pleaca din depou";
        notificareCalator(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj = "Autobuzul de pe linia " + super.linie+ " a ramas blocat in trafic";
        notificareCalator(mesaj);
    }
}
