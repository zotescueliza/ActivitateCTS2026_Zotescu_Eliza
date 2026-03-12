package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul are un numar de roti de ")
                .append(this.numarRoti)
                .append(" si nr de inmatriculare")
                .append(this.numarInmatriculare);
        System.out.println(sb);
    }
}
