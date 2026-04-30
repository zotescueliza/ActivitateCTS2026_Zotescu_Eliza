package ro.ase.cts.adapter.clase.spital;

public class Medicament {
    private String nume;
    private double pret;

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        if(this.prezintaReteta())
            System.out.println("S-a cumparat medicamentul " + this.nume + " la pretul de " + this.pret + " lei");
        else
            System.out.println("Nu s-a prezentat reteta");
    }
    public boolean prezintaReteta(){
        return this.nume.length() > 10;
    }

    public String getNume() {
        return nume;
    }
}
