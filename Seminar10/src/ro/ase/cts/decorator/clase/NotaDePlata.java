package ro.ase.cts.decorator.clase;

public class NotaDePlata implements NotaDePlataAbstract{

    private Float suma;
    private String data;

    public NotaDePlata(Float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("La data: "+data+" a fost platita suma: "+suma+" lei");
    }
}
