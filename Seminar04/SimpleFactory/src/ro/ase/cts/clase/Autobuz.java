package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int numarRoti, String numarInmatriculare){
        super(numarRoti,numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul are un numar de roti de: ").append(this.numarRoti).append(" si are numarul de inmatriculare: ").append(this.numarInmatriculare);
        System.out.println(sb);
    }
}
