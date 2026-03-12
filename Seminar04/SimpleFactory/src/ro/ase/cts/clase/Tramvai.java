package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport {
    public Tramvai(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvaiul are un numar de roti de: ")
                .append(this.numarRoti)
                .append(" si un numar de inmatriculare: ")
                .append(this.numarInmatriculare);
        System.out.println(sb);
    }
}
